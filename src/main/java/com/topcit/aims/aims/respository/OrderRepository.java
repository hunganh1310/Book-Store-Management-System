package com.topcit.aims.aims.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.topcit.aims.aims.dto.response.CustomerSpendingDTO;
import com.topcit.aims.aims.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {
    @Query("SELECT new com.topcit.aims.aims.dto.response.CustomerSpendingDTO(c.fullName, SUM(o.totalAmount)) " +
           "FROM Orders o JOIN o.customerID c " +
           "GROUP BY c.fullName")
    List<CustomerSpendingDTO> getCustomerSpending();
}
