package reto2_web.reto2_web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import reto2_web.reto2_web.model.Vegetarian;
import reto2_web.reto2_web.service.VegetarianService;

@RestController
@RequestMapping("api/vegetarian")
@CrossOrigin("*")
public class VegetarianController {
    @Autowired
    private VegetarianService vegetarianService;
    
    @GetMapping("/all")
    public List<Vegetarian> getAll() {
        return vegetarianService.getAll();
    }
    
    @GetMapping("/{reference}")
    public Optional<Vegetarian> getClothe(@PathVariable("reference") String reference) {
        return vegetarianService.getClothe(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Vegetarian create(@RequestBody Vegetarian gadget) {
        return vegetarianService.create(gadget);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Vegetarian update(@RequestBody Vegetarian gadget) {
        return vegetarianService.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return vegetarianService.delete(reference);
    }
}
