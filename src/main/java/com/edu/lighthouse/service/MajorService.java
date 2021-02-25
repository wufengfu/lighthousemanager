package com.edu.lighthouse.service;

import com.edu.lighthouse.mapper.MajorMapper;
import com.edu.lighthouse.pojo.Major;
import com.edu.lighthouse.pojo.vo.MajorBaseVo;
import com.edu.lighthouse.pojo.vo.MajorCountVo;
import com.edu.lighthouse.pojo.vo.MajorLargeVo;
import com.edu.lighthouse.pojo.vo.MajorParentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author jinzc
 */
@Service
public class MajorService {
    @Autowired
    MajorMapper majorMapper;

    public List<MajorCountVo> listLargeCount(String undergraduate) {
        return majorMapper.listLargeCount(undergraduate);
    }

    public Major get(String code) {
        return majorMapper.get(code);
    }

    @Cacheable(cacheManager = "caffeine", value = "majorBaseList")
    public List<MajorBaseVo> listMajorBase(String undergraduate, String majorName) {
        List<MajorLargeVo> largeList = listLarge(undergraduate);
        List<MajorParentVo> parentList = listParent(undergraduate, majorName);
        return largeList.stream()
                .map(large -> {
                    List<MajorParentVo> parentVos = Arrays.stream(large.getParentInfo().split(","))
                            .map(parent -> {
                                MajorParentVo parentVo = parentList.stream()
                                        .filter(item -> item.getParentName().equals(parent.trim()))
                                        .findFirst()
                                        .orElse(null);
                                return parentVo;
                            })
                            .filter(item -> Objects.nonNull(item))
                            .collect(Collectors.toList());
                    return new MajorBaseVo(large.getLargeClassName(), parentVos);
                })
                .filter(base -> !CollectionUtils.isEmpty(base.getParentVoList()))
                .collect(Collectors.toList());
    }

    private List<MajorLargeVo> listLarge(String undergraduate) {
        return majorMapper.listLarge(undergraduate);
    }

    private List<MajorParentVo> listParent(String undergraduate, String majorName) {
        return majorMapper.listParent(undergraduate, majorName);
    }
}
