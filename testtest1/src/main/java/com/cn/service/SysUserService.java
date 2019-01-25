package com.cn.service;

import com.cn.entity.SysUser;
import com.cn.entity.SysUserExample;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\25 0025 15:12
 * @Description:
 */
public interface SysUserService extends BaseService<SysUser, SysUserExample>{

    SysUser getUsername(String username);
}
