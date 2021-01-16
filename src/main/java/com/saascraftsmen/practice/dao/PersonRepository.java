package com.saascraftsmen.practice.dao;

import com.saascraftsmen.practice.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
