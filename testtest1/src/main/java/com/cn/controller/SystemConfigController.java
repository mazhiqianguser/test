package com.cn.controller;

import com.cn.entity.SystemConfig;
import com.cn.service.SystemConfigService;
import com.cn.utils.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\25 0025 10:10
 * @Description:
 */
@RestController
@RequestMapping({"/config"})
public class SystemConfigController extends BaseController{

    @Resource
    private SystemConfigService systemConfigService;
    
    public SystemConfigController() {
    }
    
    /**
     * @Author mazhiqiang
     * @Description //TODO 查询登陆连接id
     * @Date 10:11 2019\1\25 0025
     * @Param
     * @return 
     **/
    @GetMapping(
            value = {"/select"},
            produces = {"application/json;charset=utf-8"}
    )
    @ResponseBody
    public BaseResponse select(){
        SystemConfig systemConfig = (SystemConfig)systemConfigService.selectById(1);
         if(systemConfig.equals("") && systemConfig==null){
            return ajaxFail(FIND_FAIL,"300");
        }
        return ajaxSucc(systemConfig,FIND_SUCCESS,"200");
    }
}
