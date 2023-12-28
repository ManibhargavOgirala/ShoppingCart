package com.ayasyashoppingcart.request;

public class CategorySearchRequest {
    private String categoryName;
    private int limit;
    private int page;
    private String orderBy;
    private String orderDirection;

    private String createdDate;


    private static final String DEFAULT_SORT = "desc";
    private static final int DEFAULT_LIMIT = 5;
    private static final int DEFAULT_PAGE = 1;

    public String getOrderBy() {
        if (orderBy == null || orderBy.isEmpty()) {
            orderBy = "categoryName";
        }
        return orderBy;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderDirection() {
        if (orderDirection == null || orderDirection.isEmpty()) {
            orderDirection = DEFAULT_SORT;
        }
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public static String getDefaultSort() {
        return DEFAULT_SORT;
    }

    public static int getDefaultLimit() {
        return DEFAULT_LIMIT;
    }

    public static int getDefaultPage() {
        return DEFAULT_PAGE;
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





    @Override
    public String toString() {
        return "BatchPageRequest [limit=" + limit + ", page=" + page + ", orderBy=" + orderBy + ", orderDirection="
                + orderDirection + "]";
    }

}
