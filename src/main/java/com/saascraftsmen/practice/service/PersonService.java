package com.saascraftsmen.practice.service;

import com.saascraftsmen.practice.entity.PersonEntity;

import java.util.List;

public interface PersonService {
    List<PersonEntity> findAll();
}
