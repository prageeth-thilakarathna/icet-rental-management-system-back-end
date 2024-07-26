package edu.icet.pos.controller;

import edu.icet.pos.model.Customer;
import edu.icet.pos.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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

    @GetMapping(path = "/page/{pageNumber}/size/{pageSize}")
    public List<Customer> getCustomerPerPage(@PathVariable int pageNumber, @PathVariable int pageSize){
        return customerService.getPerPage(pageNumber, pageSize);
    }

    @GetMapping(path = "/count")
    public long getCustomerCount(){
        return customerService.count();
    }
}
