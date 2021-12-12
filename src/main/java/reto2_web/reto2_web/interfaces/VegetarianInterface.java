package reto2_web.reto2_web.interfaces;

import reto2_web.reto2_web.model.Vegetarian;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface VegetarianInterface extends MongoRepository<Vegetarian, String> {
    
}

