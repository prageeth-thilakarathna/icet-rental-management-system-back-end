package edu.icet.pos.service.customer;

import edu.icet.pos.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    String delete(Customer customer);

    List<Customer> getPerPage(int pageNumber, int pageSize);

    long count();
}
