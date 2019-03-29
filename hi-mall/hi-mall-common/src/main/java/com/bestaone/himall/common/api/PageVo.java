package com.bestaone.himall.common.api;

import java.util.List;

public class PageVo<T> {

    private Integer pageNum;
    private Integer pageSize;
    private Long total;
    private Integer pages;
    private List<T> list;

    /**
     * 需要提供默认的无参构造函数，否则feign在反序列化的时候会报错
     */
    public PageVo() {}

    public PageVo(Integer pageNum, Integer pageSize, Long total, Integer pages, List<T> list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.pages = pages;
        this.list = list;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}