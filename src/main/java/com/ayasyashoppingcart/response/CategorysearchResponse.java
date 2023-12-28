package com.ayasyashoppingcart.response;

import java.util.List;

public class CategorysearchResponse {
    private Long count;
    private int limit;
    private int page;
    private List<CategoryResponse> resultObjects;

    public CategorysearchResponse(Long count, int limit, int page, List<CategoryResponse> resultObjects) {
        this.count = count;
        this.limit = limit;
        this.page = page;
        this.resultObjects = resultObjects;
    }

    public CategorysearchResponse() {
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<CategoryResponse> getResultObjects() {
        return resultObjects;
    }

    public void setResultObjects(List<CategoryResponse> resultObjects) {
        this.resultObjects = resultObjects;
    }
}
