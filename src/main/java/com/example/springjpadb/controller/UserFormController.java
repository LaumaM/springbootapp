package com.example.springjpadb.controller;

import com.example.springjpadb.model.UserFormData;
import com.example.springjpadb.service.UserFormDataRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFormController {

    private UserFormDataRepo userFormDataRepo;

    public UserFormController(UserFormDataRepo userFormDataRepo) {
        this.userFormDataRepo = userFormDataRepo;
    }

    //aizsūtīt datus uz datu bāzi
    @PostMapping("/addUserToDB")
    public String sendUserDataToDB(){
        UserFormData userFormData = new UserFormData();

        return "adminpage";
    }

}
