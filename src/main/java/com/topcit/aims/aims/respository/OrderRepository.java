package com.topcit.aims.aims.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.topcit.aims.aims.dto.response.CustomerSpendingDTO;
import com.topcit.aims.aims.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("SELECT new com.topcit.aims.aims.dto.response.CustomerSpendingDTO(c.fullName, SUM(o.totalAmount)) " +
           "FROM Customer c JOIN Orders o on c.customerId = o.customer.customerId " +
           "GROUP BY c.fullName ")
    List<CustomerSpendingDTO> getCustomerSpending();
}
