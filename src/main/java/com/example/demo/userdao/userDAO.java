package com.example.demo.userdao;

import org.apache.catalina.User;


import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.demo.model.users;

public interface userDAO extends CrudRepository<users, Integer> {

}
