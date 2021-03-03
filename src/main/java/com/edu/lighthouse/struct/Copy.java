package com.edu.lighthouse.struct;

import net.sf.cglib.beans.BeanCopier;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wufengfu
 */
public class Copy {

  /**
   * 列表对象拷贝
   *
   * @param sources 源列表
   * @param clazz   源列表对象Class
   * @param <T>     目标列表对象类型
   * @param <M>     源列表对象类型
   * @return 目标列表
   */
  public static <T, M> List<T> listStruct(List<M> sources, Class<T> clazz) {
    if (Objects.isNull(sources) || Objects.isNull(clazz) || sources.isEmpty()) {
      return Collections.emptyList();
    }
    BeanCopier copier = BeanCopier.create(sources.get(0).getClass(), clazz, false);
    return Optional.of(sources)
        .orElse(new ArrayList<>())
        .stream().map(m -> copyProperties(m, clazz, copier))
        .collect(Collectors.toList());
  }

  /**
   * 单个对象属性拷贝
   *
   * @param source 源列表
   * @param clazz  源列表对象Class
   * @param <T>    目标列表对象类型
   * @param <M>    源列表对象类型
   * @return 目标列表
   */
  public static <T, M> T struct(M source, Class<T> clazz) {
    if (Objects.isNull(source) || Objects.isNull(clazz)) {
      return null;
    }
    return copyProperties(source, clazz, null);
  }

  /**
   * 单个对象属性拷贝
   *
   * @param source 源对象
   * @param clazz  目标对象Class
   * @param copier copier
   * @param <T>    目标对象类型
   * @param <M>    源对象类型
   * @return 目标对象
   */
  private static <T, M> T copyProperties(M source, Class<T> clazz, BeanCopier copier) {
    if (null == copier) {
      copier = BeanCopier.create(source.getClass(), clazz, false);
    }
    T target = null;
    try {
      target = clazz.getDeclaredConstructor().newInstance();
      copier.copy(source, target, null);
    } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
      e.printStackTrace();
    }
    return target;
  }
}
