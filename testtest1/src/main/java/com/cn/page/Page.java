package com.cn.page;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\25 0025 10:25
 * @Description:
 */
public class Page {

    private Integer totalRecord = null;
    private Integer totalPage = null;
    private Integer pageSize = 100;
    private Integer currentPage = 1;
    private Integer startSize = null;
    private Boolean isLimit = false;

    public Page() {
    }

    public void paging(boolean isLimit, Integer totalRecord, Integer pageSize, Integer currentPage) {
        if (isLimit) {
            if (pageSize != null) {
                this.pageSize = pageSize;
            }

            if (currentPage != null) {
                this.currentPage = currentPage;
            }

            this.totalPage = (totalRecord + this.pageSize - 1) / this.pageSize;
            this.totalRecord = totalRecord;
            this.startSize = this.pageSize * (this.currentPage - 1);
            this.setIsLimit(isLimit);
        }

    }

    public Integer getTotalRecord() {
        return this.totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    public Integer getTotalPage() {
        return this.totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getStartSize() {
        return this.startSize;
    }

    public void setStartSize(Integer startSize) {
        this.startSize = startSize;
    }

    public Boolean getIsLimit() {
        return this.isLimit;
    }

    public void setIsLimit(Boolean isLimit) {
        this.isLimit = isLimit;
    }
}
