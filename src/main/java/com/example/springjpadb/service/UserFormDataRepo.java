package com.example.springjpadb.service;

import com.example.springjpadb.model.UserFormData;
import org.springframework.data.repository.CrudRepository;

public interface UserFormDataRepo extends CrudRepository<UserFormData, Long> {

}
