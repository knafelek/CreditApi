package pl.knafelek.creditApi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.knafelek.creditApi.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
