package com.teamcoffee.coffeeflavourwheel.controller;

import com.teamcoffee.coffeeflavourwheel.model.TastedCoffee;
import com.teamcoffee.coffeeflavourwheel.model.User;
import com.teamcoffee.coffeeflavourwheel.repository.TastedCoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TastedCoffeeController {

    @Autowired
    private TastedCoffeeRepository repository;

    @GetMapping("/tastedcoffee")
    public List<TastedCoffee> allTastedCoffee() {
        return (List<TastedCoffee>) repository.findAll();
    }

    @GetMapping(path = {"/tastedcoffee/{id}"})
    public ResponseEntity<TastedCoffee> findById(@PathVariable long id) {
        return repository.findById(id).map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("tastedcoffee/count")
    public Long count() {
        return repository.count();
    }

    @PostMapping(value = "/tastedcoffee/posts" )
    public TastedCoffee create(@RequestBody TastedCoffee tastedCoffee) {
        return repository.save(tastedCoffee);
    }

    @PutMapping(value = "/tastedcoffee/{id}")
    public ResponseEntity<TastedCoffee> update(@PathVariable("id") long id, @RequestBody TastedCoffee tastedCoffee) {
        return repository.findById(id).map(record -> {
            record.setCoffeeName(tastedCoffee.getCoffeeName());
            record.setRoaster(tastedCoffee.getRoaster());
            record.setRoastColor(tastedCoffee.getRoastColor());
            record.setProcessingMethod(tastedCoffee.getProcessingMethod());
            record.setTastingMethod(tastedCoffee.getTastingMethod());
            record.setBeanType(tastedCoffee.getBeanType());
            TastedCoffee updated = repository.save(record);
            return ResponseEntity.ok().body(updated);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("tastedcoffee/{id}")
    public void delete(@PathVariable String id) {
        Long tastedCoffeeId = Long.parseLong(id);
        repository.deleteById(tastedCoffeeId);
    }
}
