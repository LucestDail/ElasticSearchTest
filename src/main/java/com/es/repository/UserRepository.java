package com.es.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.es.domain.Person;

public interface UserRepository extends JpaRepository<Person, Long> {

	long countByLastname(String lastname);

	long deleteByLastname(String lastname);

	List<Person> removeByLastname(String lastname);

}
