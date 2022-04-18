package com.example.demo.project;

import com.example.demo.project.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class Controller {

    @Autowired
    private ControllerService controllerService;


    @GetMapping(path = "/persons", produces = {"application/json"})
    public List<Person> getPersons(){
        return controllerService.getPersons();
    }

    @GetMapping(path = "/person/{perId}")
    public Person getPersonWithId(@PathVariable("perId") Long Id){
        return controllerService.getPersonUisngID(Id);
    }

    @PostMapping(path = "/person")
    public void registerNewPerson(@RequestBody Person person){
        controllerService.addNewPerson(person);
    }

    @DeleteMapping(path = "person/{perId}")
    public void deletePerson(@PathVariable("perId") long id){
        controllerService.removePerson(id);
    }

    @PutMapping(path = "person")
    public void putPerson(@RequestBody Person person){
        controllerService.updatePerson(person);
    }
}
