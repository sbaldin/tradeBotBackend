package hello;

import hello.model.Customer;
import hello.model.Tick;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TickRepository extends MongoRepository<Tick, String> {



}
