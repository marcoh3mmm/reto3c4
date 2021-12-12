package reto2_web.reto2_web.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reto2_web.reto2_web.interfaces.UserInterface;
import reto2_web.reto2_web.model.User;

@Repository
public class UserRepository {
    @Autowired
    private UserInterface userCrudRepository;

    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }

    public Optional<User> getUser(int id) {
        return userCrudRepository.findById(id);
    }

    public User create(User user) {
        return userCrudRepository.save(user);
    }
    
    public void update(User user) {
        userCrudRepository.save(user);
    }
    
    public void delete(User user) {
        userCrudRepository.delete(user);
    }

    public boolean emailExists(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);
        
        return !usuario.isEmpty();
    }

    public Optional<User> authenticateUser(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }

}
