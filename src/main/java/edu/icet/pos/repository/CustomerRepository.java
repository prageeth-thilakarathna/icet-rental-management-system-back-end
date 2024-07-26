package edu.icet.pos.repository;

import edu.icet.pos.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer>,
        PagingAndSortingRepository<CustomerEntity, Integer> {
}
