package reto2_web.reto2_web.interfaces;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

import reto2_web.reto2_web.model.User;


public interface UserInterface extends MongoRepository<User, Integer> {
     Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}
