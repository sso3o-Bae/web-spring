package com.sparta.webSpring.controller;

import com.sparta.webSpring.domain.CourseRepository;
import com.sparta.webSpring.domain.Person;
import com.sparta.webSpring.domain.PersonRepository;
import com.sparta.webSpring.domain.PersonRequestDto;
import com.sparta.webSpring.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {
    private final PersonRepository personRepository;

    private final PersonService personService;

    @GetMapping("/api/persons")
    public List<Person> getPerson(){
        return personRepository.findAll();
    }

    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto personRequestDto){
        Person person = new Person(personRequestDto);
        return personRepository.save(person);
    }

    @PutMapping("/api/persons/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto personRequestDto){
        return personService.update(id, personRequestDto);
    }

    @DeleteMapping("api/persons/{id}")
    public Long deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
        return id;
    }
}
