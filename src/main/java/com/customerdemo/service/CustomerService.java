package com.customerdemo.service;

import com.customerdemo.model.Customer;

import java.util.List;

/**
 * Service interface for {@link Customer} class
 *
 * @author Kurilko Artem
 */

public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}
