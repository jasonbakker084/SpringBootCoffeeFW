package com.teamcoffee.coffeeflavourwheel.controller;

import com.teamcoffee.coffeeflavourwheel.UserService.UserService;
import com.teamcoffee.coffeeflavourwheel.model.User;
import com.teamcoffee.coffeeflavourwheel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MyController {

    @Autowired
//    private UserService userService;
    private UserRepository repository;

    @GetMapping("/users")
    public List<User> allUsers() {

        return repository.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<User> findById(@PathVariable long id) {
        return repository.findById(id).map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/users/count")
    public Long count() {

        return repository.count();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return repository.save(user);
    }

    @PutMapping(value = "/users/{id}")
    public ResponseEntity<User> update(@PathVariable("id") long id, @RequestBody User user) {
        return repository.findById(id).map(record -> {
            record.setFirstName(user.getFirstName());
            record.setLastName(user.getLastName());
            record.setEmail(user.getEmail());
            record.setUserType(user.getUserType());
            User updated = repository.save(record);
            return ResponseEntity.ok().body(updated);
        }).orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable String id) {

        Long userId = Long.parseLong(id);
        repository.deleteById(userId);
    }
}