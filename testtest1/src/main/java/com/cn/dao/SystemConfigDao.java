package com.cn.dao;

import com.cn.entity.SystemConfig;
import com.cn.entity.SystemConfigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\25 0025 11:18
 * @Description:
 */
public interface SystemConfigDao {
    int countByExample(SystemConfigExample var1);

    int deleteByExample(SystemConfigExample var1);

    int deleteByPrimaryKey(Integer var1);

    int insert(SystemConfig var1);

    int insertSelective(SystemConfig var1);

    List<SystemConfig> selectByExample(SystemConfigExample var1);

    SystemConfig selectByPrimaryKey(Integer var1);

    int updateByExampleSelective(@Param("record") SystemConfig var1, @Param("example") SystemConfigExample var2);

    int updateByExample(@Param("record") SystemConfig var1, @Param("example") SystemConfigExample var2);

    int updateByPrimaryKeySelective(SystemConfig var1);

    int updateByPrimaryKey(SystemConfig var1);
}
