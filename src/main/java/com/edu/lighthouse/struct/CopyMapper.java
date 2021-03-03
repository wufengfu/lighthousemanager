package com.jtravel.common.util.struct;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author ziy
 */
@Mapper
public interface CopyMapper {

  CopyMapper INSTANCE = Mappers.getMapper(CopyMapper.class);

  /**
   * 对象->对象
   *
   * @param object
   * @param <T>
   * @return T
   */
  <T> T toStruct(Class<T> object);


  /**
   * 集合->集合
   *
   * @param list List
   * @param <T>  List
   * @return List
   */
  <T> List<T> toList(List<T> list);
}
