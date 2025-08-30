package com.topcit.aims.aims.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Orders {
    public Orders() {
    }

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "OrderID", nullable = false)
    private Integer orderID;

    @ManyToOne
    @JoinColumn(name = "CustomerID", nullable = false)
    private Customer customerID;

    @Column(name = "OrderDate", nullable = false, columnDefinition = "DATETIME CURRENT_TIMESTAMP")
    private LocalDateTime orderDate;

    @Column(name = "TotalAmount", precision = 10, scale = 2)
    private BigDecimal totalAmount;

    @Column(name = "VAT", precision = 10, scale = 2)
    private BigDecimal vat;

    @Column(name = "ShippingFee", precision = 10, scale = 2)
    private BigDecimal shippingFee;

    public enum Status {
        Pending,
        Approved,
        Rejected
    }

    @Column(name = "Status", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status = Status.Pending;

    @Lob
    @Column(name = "ShippingAddress")
    private String shippingAddress;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public java.time.LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(java.time.LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public java.math.BigDecimal getVat() {
        return vat;
    }

    public void setVat(java.math.BigDecimal vat) {
        this.vat = vat;
    }

    public java.math.BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(java.math.BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
