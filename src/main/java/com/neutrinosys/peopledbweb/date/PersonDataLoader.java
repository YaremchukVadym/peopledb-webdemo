package com.neutrinosys.peopledbweb.date;

import com.neutrinosys.peopledbweb.biz.model.Person;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Component
public class PersonDataLoader implements ApplicationRunner {

    private PersonRepository personRepository;

    public PersonDataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (personRepository.count() == 0) {
            List<Person> people = List.of(
//                    new Person(null, "Vlad", "Dogen", LocalDate.of(1950, 1, 1), "myemail1@gmail.com", new BigDecimal("1000")),
//                    new Person(null, "Dan", "Catget", LocalDate.of(1960, 2, 2), "myemail2@gmail.com", new BigDecimal("2000")),
//                    new Person(null, "Mary", "Helid", LocalDate.of(1970, 3, 3), "myemail3@gmail.com", new BigDecimal("3000")),
//                    new Person(null, "Vadym", "Nakto", LocalDate.of(1980, 4, 4), "myemail4@gmail.com", new BigDecimal("100000")),
//                    new Person(null, "Roma", "Hepo", LocalDate.of(1990, 5, 5), "myemail5@gmail.com", new BigDecimal("1200")),
//                    new Person(null, "Bob", "Meru", LocalDate.of(1999, 6, 6), "myemail6@gmail.com", new BigDecimal("1600"))
                    );
           personRepository.saveAll(people);
        }
    }
}
