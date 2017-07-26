package com.mrliang.ver.common;

/**
 * @author liang wei
 * @description 用一句话描述下该文件的作用
 * @date 2017/7/26 9:36
 */
public class Pagination {
    private long total = 0;
    private int per_page = 10;
    private int current_page = 0;
    private int last_page = 0;
    private long from = 1;
    private long to = 15;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getLast_page() {
        return last_page;
    }

    public void setLast_page(int last_page) {
        this.last_page = last_page;
    }

    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public long getTo() {
        return to;
    }

    public void setTo(long to) {
        this.to = to;
    }
}
