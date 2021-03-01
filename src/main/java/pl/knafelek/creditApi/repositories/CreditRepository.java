package pl.knafelek.creditApi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.knafelek.creditApi.model.Credit;

@Repository
public interface CreditRepository extends CrudRepository<Credit, Integer> {

}
