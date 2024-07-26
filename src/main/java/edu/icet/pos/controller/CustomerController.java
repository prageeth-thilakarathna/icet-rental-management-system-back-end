package edu.icet.pos.controller;

import edu.icet.pos.model.Customer;
import edu.icet.pos.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping(path = "/add")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @PostMapping(path = "/update")
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @DeleteMapping(path = "/delete")
    public String deleteCustomer(@RequestBody Customer customer){
        return customerService.delete(customer);
    }
}
