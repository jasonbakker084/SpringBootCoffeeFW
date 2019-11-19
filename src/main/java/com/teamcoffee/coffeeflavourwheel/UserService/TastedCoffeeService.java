package com.teamcoffee.coffeeflavourwheel.UserService;

import com.teamcoffee.coffeeflavourwheel.model.TastedCoffee;
import com.teamcoffee.coffeeflavourwheel.repository.TastedCoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TastedCoffeeService {

    @Autowired
    private TastedCoffeeRepository tastedCoffeeRepository;

    public List<TastedCoffee> findAll() {
        var it = tastedCoffeeRepository.findAll();

        var tastedcoffees = new ArrayList<TastedCoffee>();
        it.forEach(e -> tastedcoffees.add(e));

        return tastedcoffees;
    }

    public Long count() {
        return tastedCoffeeRepository.count();
    }

    public void deleteById(Long tastedCoffeeId) {
        tastedCoffeeRepository.deleteById(tastedCoffeeId);
    }
}
