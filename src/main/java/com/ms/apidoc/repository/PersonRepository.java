package com.ms.apidoc.repository;

import com.ms.apidoc.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PersonRepository extends CrudRepository<Person, UUID> {}