package pl.knafelek.creditApi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.knafelek.creditApi.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
