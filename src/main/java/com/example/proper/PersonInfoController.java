package com.example.proper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@CrossOrigin("*")
public class PersonInfoController {

    @Autowired
    PersonInfoService personInfoService;

    @PostMapping("/add")
    public ResponseEntity<PersonInfo> createPersonInfo(@RequestBody PersonInfo personInfo) {
        PersonInfo response = personInfoService.createPersonInfo(personInfo);

        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @GetMapping("/get-all")
    public ResponseEntity<List<PersonInfo>> getPersonInfo() {
        List<PersonInfo> response = personInfoService.getPersonInfo();

        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<PersonInfo> getPersonInfoById(@PathVariable String id) {
        PersonInfo response = personInfoService.getPersonInfoById(id);

        return new ResponseEntity<>(response, HttpStatus.OK);

    }



    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity deletePersonInfo(@PathVariable String id) {
        personInfoService.deletePersonInfo(id);

        return new ResponseEntity(HttpStatus.OK);

    }


}
