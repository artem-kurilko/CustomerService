package com.customerdemo.repository;

import com.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link com.customerdemo.model.Customer} class
 *
 * @author Kurilko Artem
 */
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
