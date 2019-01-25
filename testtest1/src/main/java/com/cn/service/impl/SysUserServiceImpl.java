package com.cn.service.impl;

import com.cn.dao.SysUserDao;
import com.cn.entity.SysUser;
import com.cn.entity.SysUserExample;
import com.cn.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\25 0025 15:13
 * @Description:
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserDao sysUserDao;

    public SysUserServiceImpl() {
    }

    /*查询sysuser表中的username*/
    @Override
    public SysUser getUsername(String username) {
        return this.sysUserDao.getUsername(username);
    }

    @Override
    public List<SysUser> selectAll(SysUserExample var1) {
        return null;
    }

    @Override
    public SysUser selectById(Integer var1) {
        return null;
    }

    @Override
    public int save(SysUser var1) {
        return 0;
    }

    @Override
    public int update(SysUser var1, SysUserExample var2) {
        return 0;
    }

    @Override
    public int updateById(SysUser var1) {
        return 0;
    }

    @Override
    public int count(SysUserExample var1) {
        return 0;
    }

    @Override
    public int delete(SysUserExample var1) {
        return 0;
    }

    @Override
    public int deleteById(Integer var1) {
        return 0;
    }
}
