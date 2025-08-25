package com.topcit.aims.aims.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
    public Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID", nullable = false)
    private Integer productID;

    @Column(name = "Title", length = 200)
    private String Title;

    @Column(name = "Category", length = 200)
    private String Category;

    @Column(name = "Price", precision = 10, scale = 2)
    private java.math.BigDecimal Price;

    @Column(name = "Quantity")
    private Integer Quantity;

    @Column(name = "AddDate")
    private LocalDateTime addDate;

    public enum ProductTypeEnum {
        book, cd, dvd
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "ProductType", length = 100, nullable = false)
    private ProductTypeEnum productType;

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        this.Category = category;
    }

    public java.math.BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(java.math.BigDecimal price) {
        this.Price = price;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        this.Quantity = quantity;
    }

    public LocalDateTime getAddDate() {
        return addDate;
    }

    public void setAddDate(LocalDateTime addDate) {
        this.addDate = addDate;
    }

    public ProductTypeEnum getProductType() {
        return productType;
    }

    public void setProductType(ProductTypeEnum productType) {
        this.productType = productType;
    }
}
