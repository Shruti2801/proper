package com.example.proper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonInfoController {

    @Autowired
    PersonInfoService personInfoService;

    @PostMapping("/person-info")
    public ResponseEntity<PersonInfo> createPersonInfo(@RequestBody PersonInfo personInfo) {
        PersonInfo response = personInfoService.createPersonInfo(personInfo);

        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }

}
