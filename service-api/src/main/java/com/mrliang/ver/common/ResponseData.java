package com.mrliang.ver.common;

import com.mrliang.common.page.PageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liang wei
 * @description 用于返回页面展示的data
 * @date 2017/7/26 9:34
 */
public class ResponseData {
    private String retCode = "0000";
    private String retMsg = "成功";
    private List data = new ArrayList();
    private Pagination pagination = new Pagination();
    public static ResponseData fillPageInfo(PageInfo pageInfo){
        ResponseData responseData = new ResponseData();
        responseData.setData(pageInfo.getData());
        responseData.getPagination().setTotal(pageInfo.totalCount);
        responseData.getPagination().setLast_page(pageInfo.getTotalPages());
        responseData.getPagination().setCurrent_page(pageInfo.getCurrentPage());
        responseData.getPagination().setFrom(pageInfo.getStartIndex()+1);
        responseData.getPagination().setTo(pageInfo.totalCount < (pageInfo.getStartIndex()+pageInfo.getPerPageRows())?pageInfo.totalCount:(pageInfo.getStartIndex()+pageInfo.getPerPageRows()));
        return responseData;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
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

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }
}
