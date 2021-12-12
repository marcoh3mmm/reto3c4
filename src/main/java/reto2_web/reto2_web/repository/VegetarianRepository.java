package reto2_web.reto2_web.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reto2_web.reto2_web.interfaces.VegetarianInterface;
import reto2_web.reto2_web.model.Vegetarian;

@Repository
public class VegetarianRepository {
    @Autowired
    private VegetarianInterface vegetarianCrudRepository;

    public List<Vegetarian> getAll() {
        return vegetarianCrudRepository.findAll();
    }

    public Optional<Vegetarian> getClothe(String reference){
        return vegetarianCrudRepository.findById(reference);
    }
    
    public Vegetarian create(Vegetarian clothe) {
        return vegetarianCrudRepository.save(clothe);
    }

    public void update(Vegetarian clothe) {
        vegetarianCrudRepository.save(clothe);
    }
    
    public void delete(Vegetarian clothe) {
        vegetarianCrudRepository.delete(clothe);
    }

}
