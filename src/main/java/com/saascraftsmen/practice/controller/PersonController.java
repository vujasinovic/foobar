package com.saascraftsmen.practice.controller;

import com.saascraftsmen.practice.entity.PersonEntity;
import com.saascraftsmen.practice.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(PersonController.BASE_URL)
public class PersonController {
    static final String BASE_URL = "/persons";

    private static final String PERSONS_ATTR_NAME = "persons";
    private static final String PERSONS_PAGE = "showPersons";

    private final PersonService personService;

    @GetMapping
    public String getPersons(Model model) {
        List<PersonEntity> persons = personService.findAll();
        model.addAttribute(PERSONS_ATTR_NAME, persons);

        return PERSONS_PAGE;
    }

    @GetMapping(value = "/newPerson")
    public String getNewPerson(Model model) {
        PersonEntity person = new PersonEntity();

        model.addAttribute("person", person);

        return "newPerson";
    }

    @PostMapping(value = "/newPerson")
    public String postNewPerson(@ModelAttribute("person") PersonEntity person) {
        personService.save(person);

        return "redirect:/persons";
    }
}
