package com.cn.utils;

import java.io.Serializable;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\25 0025 10:13
 * @Description:
 */
public class BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;
    private String time;
    private Object desc;
    private Object data;
    private Integer totalRecord;

    public BaseResponse() {
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Object getDesc() {
        return desc;
    }

    public void setDesc(Object desc) {
        this.desc = desc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "code='" + code + '\'' +
                ", time='" + time + '\'' +
                ", desc=" + desc +
                ", data=" + data +
                ", totalRecord=" + totalRecord +
                '}';
    }
}
