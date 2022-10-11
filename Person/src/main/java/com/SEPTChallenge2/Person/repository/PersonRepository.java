package com.SEPTChallenge2.Person.repository;

import com.SEPTChallenge2.Person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person,Long>{
}