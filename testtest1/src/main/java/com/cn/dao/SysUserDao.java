package com.cn.dao;

import com.cn.entity.SysUser;
import com.cn.entity.SysUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\25 0025 15:19
 * @Description:
 */
public interface SysUserDao {
    int countByExample(SysUserExample var1);

    int deleteByExample(SysUserExample var1);

    int deleteByPrimaryKey(Integer var1);

    int insert(SysUser var1);

    int insertSelective(SysUser var1);

    List<SysUser> selectByExample(SysUserExample var1);

    SysUser selectByPrimaryKey(Integer var1);

    int updateByExampleSelective(@Param("record") SysUser var1, @Param("example") SysUserExample var2);

    int updateByExample(@Param("record") SysUser var1, @Param("example") SysUserExample var2);

    int updateByPrimaryKeySelective(SysUser var1);

    int updateByPrimaryKey(SysUser var1);

    List<SysUser> pageList(@Param("start") Integer var1, @Param("pageSize") Integer var2);

    List<SysUser> getByUserName();

    SysUser getUsername(String username);
}
