package com.topcit.aims.aims.dto.response;

import java.math.BigDecimal;

public class CustomerSpedingDTO {
    private String customerName;
    private BigDecimal totalSpending;
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public BigDecimal getTotalSpending() {
        return totalSpending;
    }

    public void setTotalSpending(BigDecimal totalSpending) {
        this.totalSpending = totalSpending;
    }
}
