package edu.icet.pos.service.customer.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.pos.entity.CustomerEntity;
import edu.icet.pos.model.Customer;
import edu.icet.pos.repository.CustomerRepository;
import edu.icet.pos.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ObjectMapper objectMapper;

    @Autowired
    public CustomerServiceImpl(
            CustomerRepository customerRepository,
            ObjectMapper objectMapper
    ){
        this.customerRepository = customerRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public Customer save(Customer customer) {
        CustomerEntity customerEntity = objectMapper.convertValue(customer, CustomerEntity.class);
        CustomerEntity res = customerRepository.save(customerEntity);
        return objectMapper.convertValue(res, Customer.class);
    }

    @Override
    public String delete(Customer customer) {
        CustomerEntity customerEntity = objectMapper.convertValue(customer, CustomerEntity.class);
        customerRepository.delete(customerEntity);
        return customer.getCustomerId()+" Customer delete is successful.";
    }

    @Override
    public List<Customer> getPerPage(int pageNumber, int pageSize) {
        return List.of();
    }
}
