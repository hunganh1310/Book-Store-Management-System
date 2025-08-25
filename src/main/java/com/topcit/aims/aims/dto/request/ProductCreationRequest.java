package com.topcit.aims.aims.dto.request;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductCreationRequest {
    private String title;
    private String category;
    private BigDecimal price;
    private Integer quantity;
    private LocalDateTime addDate;
    private ProductTypeEnum productType;

    public enum ProductTypeEnum {
        book, cd, dvd
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public java.math.BigDecimal getPrice() {
        return price;
    }

    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public java.time.LocalDateTime getAddDate() {
        return addDate;
    }

    public void setAddDate(java.time.LocalDateTime addDate) {
        this.addDate = addDate;
    }

    public ProductTypeEnum getProductType() {
        return productType;
    }

    public void setProductType(ProductTypeEnum productType) {
        this.productType = productType;
    }
}
