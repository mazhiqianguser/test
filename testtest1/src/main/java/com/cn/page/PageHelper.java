package com.cn.page;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\25 0025 10:25
 * @Description:
 */
public class PageHelper<T> {
    private T object;
    private Page page;
    private String condition;

    public PageHelper() {
    }

    public String getCondition() {
        return this.condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public T getObject() {
        return this.object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Page getPage() {
        return this.page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
