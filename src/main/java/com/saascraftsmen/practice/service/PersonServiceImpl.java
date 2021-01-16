package com.saascraftsmen.practice.service;

import com.saascraftsmen.practice.dao.PersonRepository;
import com.saascraftsmen.practice.entity.PersonEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public List<PersonEntity> findAll() {
        return personRepository.findAll();
    }

    @Override
    public void save(PersonEntity person) {
        personRepository.save(person);
    }
}
