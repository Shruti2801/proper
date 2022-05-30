package com.example.proper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonInfoService {

    @Autowired
    PersonInfoRepo personInfoRepo;

    public PersonInfo createPersonInfo(PersonInfo personInfo) {
        return personInfoRepo.save(personInfo);
    }

    public List<PersonInfo> getPersonInfo() {
        return personInfoRepo.findAll();
    }

    public PersonInfo getPersonInfoById(String id) {
        return personInfoRepo.findById(id).orElseThrow();
    }

    public void deletePersonInfo(String id) {
        personInfoRepo.deleteById(id);
    }
}
