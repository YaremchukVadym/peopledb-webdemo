package com.neutrinosys.peopledbweb.web.controller;

import com.neutrinosys.peopledbweb.biz.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {
    @GetMapping
    public String getPeople(Model model) {
        List<Person> people = List.of(
                new Person(10L, "Alex", "Dogen", LocalDate.of(1950, 1, 1), new BigDecimal("1000")),
                new Person(20L, "Dan", "Catget", LocalDate.of(1960, 2, 2), new BigDecimal("2000")),
                new Person(30L, "Mary", "Helid", LocalDate.of(1970, 3, 3), new BigDecimal("3000")),
                new Person(40L, "Vadym", "Nakto", LocalDate.of(1980, 4, 4), new BigDecimal("100000")),
                new Person(50L, "Roma", "Hepo", LocalDate.of(1990, 5, 5), new BigDecimal("1200")),
                new Person(60L, "Bob", "Meru", LocalDate.of(1999, 6, 6), new BigDecimal("1600")));

        model.addAttribute("people", people);

        return "people";
    }
}
