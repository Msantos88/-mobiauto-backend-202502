package com.mobiauto.demo.resources;

import com.mobiauto.demo.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Marcelo", "mreis@gmail.com", "11999999999", "123456", null);
        return ResponseEntity.ok().body(user);
    }
}
