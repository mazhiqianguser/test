package com.cn.service.impl;

import com.cn.entity.SystemConfig;
import com.cn.entity.SystemConfigExample;
import com.cn.service.SystemConfigService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\25 0025 10:29
 * @Description:
 */
@Service
public class SystemConfigServiceImpl implements SystemConfigService {
    @Override
    public List<SystemConfig> selectAll(SystemConfigExample var1) {
        return null;
    }

    /*根据id查询访问cms 路径 ID */
    @Override
    public SystemConfig selectById(Integer var1) {
        return null;
    }

    @Override
    public int save(SystemConfig var1) {
        return 0;
    }

    @Override
    public int update(SystemConfig var1, SystemConfigExample var2) {
        return 0;
    }

    @Override
    public int updateById(SystemConfig var1) {
        return 0;
    }

    @Override
    public int count(SystemConfigExample var1) {
        return 0;
    }

    @Override
    public int delete(SystemConfigExample var1) {
        return 0;
    }

    @Override
    public int deleteById(Integer var1) {
        return 0;
    }
}
