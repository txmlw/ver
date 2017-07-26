package com.mrliang.ver.common;

import com.mrliang.common.page.PageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liang wei
 * @description 用于返回页面展示的data
 * @date 2017/7/26 9:34
 */
public class PageData {
    private boolean success = true;
    private List data = new ArrayList();
    private Pagination pagination = new Pagination();
    public static PageData fillPageInfo(PageInfo pageInfo){
        PageData pageData = new PageData();
        pageData.setData(pageInfo.getData());
        pageData.getPagination().setTotal(pageInfo.totalCount);
        pageData.getPagination().setLast_page(pageInfo.getTotalPages());
        pageData.getPagination().setCurrent_page(pageInfo.getCurrentPage());
        pageData.getPagination().setFrom(pageInfo.getStartIndex()+1);
        pageData.getPagination().setTo(pageInfo.getStartIndex()+pageInfo.getPerPageRows());
        return pageData;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
