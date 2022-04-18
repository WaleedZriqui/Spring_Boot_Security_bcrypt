package com.example.demo.project;

import com.example.demo.project.Repository.CarRepository;
import com.example.demo.project.Repository.PersonRepository;
import com.example.demo.project.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ControllerService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private CarRepository carRepository;

    public List<Person> getPersons(){
        return personRepository.findAll();
    }

    public Person getPersonUisngID(Long Id){
        return personRepository.findById(Id).orElseThrow( ()->
                new IllegalStateException("ID doesn't Exsist"));
    }

    public void addNewPerson(Person person){
        Optional<Person> personOptional =
                personRepository.findPersonByName(person.getName());
        if(personOptional.isPresent()){
            throw new IllegalStateException("name token");
        }
        personRepository.save(person);
    }

    public void removePerson(long Id){
        Optional<Person> personOptional =
                personRepository.findPersonById(Id);
        if(personOptional.isEmpty()){
            throw new IllegalStateException("This ID doesn't exist");
        }
        personRepository.deleteById(Id);
    }

    public void updatePerson(Person updatedPerson) {
        Person person = personRepository.findPersonById(updatedPerson.getId()).orElseThrow(
                () -> new IllegalStateException("This ID doesn't exist")
        );

        String name = updatedPerson.getName();
        name.replaceAll(" ", "");
        int age = updatedPerson.getAge();
        String city = updatedPerson.getCity();
        city.replaceAll(" ", "");

        System.out.println(name + " %% " + age + " ^^ " + city);

        if(name != null && name.length()!= 0){
            person.setName(name);
        }

        if (age != 0){
            person.setAge(age);
        }

        if(city != null && city.length()!=0){
            person.setCity(city);
        }
    }



}


