package com.teamcoffee.coffeeflavourwheel;

import com.teamcoffee.coffeeflavourwheel.model.User;
import com.teamcoffee.coffeeflavourwheel.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        logger.info("initializing users");

        var u1 = new User("Jason", "Bakker", "jasonbakker084@gmail.com", "Barista");
        userRepository.save(u1);

        var u2 = new User("Edward", "Idema", "e.idema@gmail.com", "Barista");
        userRepository.save(u2);

        var u3 = new User("John", "Legend", "jlegend@gmail.com", "Barista");
        userRepository.save(u3);
    }
}