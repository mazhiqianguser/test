package com.cn.controller;

import com.cn.entity.SystemConfig;
import com.cn.service.SystemConfigService;
import com.cn.utils.BaseResponse;
import org.springframework.web.bind.annotation.*;

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

    /**
     * @Author mazhiqiang
     * @Description //TODO 修改id
     * @Date 14:33 2019\1\25 0025
     * @Param
     * @return
     **/
    @PostMapping(
            value = {"/update"},
            produces = {"application/json;charset=utf-8"}
    )
    public BaseResponse update(@RequestBody SystemConfig systemConfig){
        try {
            int count = this.systemConfigService.updateById(systemConfig);
            return count > 0 ? this.ajaxSucc("", this.UPDATE_SUCCESS, "200") : this.ajaxFail(this.UPDATE_FAIL, "300");
        } catch (Exception var3) {
            var3.printStackTrace();
            return this.ajaxFail(this.UPDATE_FAIL, "300");
        }
    }
}
