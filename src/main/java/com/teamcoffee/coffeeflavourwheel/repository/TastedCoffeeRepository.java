package com.teamcoffee.coffeeflavourwheel.repository;

import com.teamcoffee.coffeeflavourwheel.model.TastedCoffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TastedCoffeeRepository extends CrudRepository<TastedCoffee, Long> {
}
