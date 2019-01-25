package com.cn.service;

import java.util.List;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\24 0024 16:44
 * @Description:
 */
public interface BaseService<T, V> {

    List<T> selectAll(V var1);

    T selectById(Integer var1);

    int save(T var1);

    int update(T var1, V var2);

    int updateById(T var1);

    int count(V var1);

    int delete(V var1);

    int deleteById(Integer var1);

}
