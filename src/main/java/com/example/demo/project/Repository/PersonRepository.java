package com.example.demo.project.Repository;

import com.example.demo.project.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository
        extends JpaRepository<Person, Long> {

    Optional<Person> findPersonByName(String name);
    Optional<Person> findPersonById(Long Id);
//
//    @Query("from Person  where  ( age>?1 and  city in ('Balaa', 'Nablus') ) order by age asc ")
//    Optional<Person> findPersonByAgeIsGreaterThanAndCityIsStartingWith(int age, String as);

    //Optional<Person> findCustomPerson(Character nameFirstChar,Integer minAge);


}
