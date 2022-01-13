package com.example.chat.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.chat.model.authlogin;
import com.example.chat.model.response;
import com.example.chat.model.user;
import com.example.chat.repository.userRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/auth")

public class userController {
    @Autowired
    
    userRepository userrepository;  


    List<user> userList = new ArrayList<>();
    @PostMapping("/register")
    public response register(@RequestBody user u) {
        
        user us=userrepository.insert(u);
        if(userList.add(us)) {
            return new response(200, "Registered User Successfully", us.getUserId());
            
        }
        return new response(404, "Error Occured", null);
    }


    @PostMapping("/login")
	public response Login(@RequestBody authlogin authModel) {
    if(userrepository.count() > 0){
        List<user> list=userrepository.findAll();
        for(user u : list){
            if(u.getEmail().equals(authModel.getEmail()) && u.getPassword().equals(authModel.getPassword())){
               return new response(200,"Logged succesfully",u);
            }
            else{
                return new response(400,"Login unsuccesfull",u);
            }
            
        }
    }   
        return new response(404,"no user in db",authModel);
    }

    @GetMapping("/allUser")
    public List<user> getallUsers() {
        return userrepository.findAll();
    }
}
