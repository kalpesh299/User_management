package com.example.User_Man.Controller;

import com.example.User_Man.Model.User;
import com.example.User_Man.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
//@GetMapping("/message")
//public String msg(){
//    return"nuthing is impossible";
//}
@Autowired //Dependancy injection
private UserService userservice;


    //http://localhost:8085/getAllUser
    @GetMapping("/getAllUser")//Get all User
    public List<User>Allusers(){
       return userservice.displayAll();
   }

   //http://localhost:8085/getUser/2
   @GetMapping("/getUser/{id}")//geting user by id
    public User user(@PathVariable int id){
        return userservice.user_by_id(id);
   }

   //http://localhost:8085/addUser

   @PostMapping("addUser")//adding user
public void addUser(@RequestBody User user){
        userservice.addUser(user);
   }

    //http://localhost:8085/updateUserInfo/1
@PutMapping("updateUserInfo/{id}")//updating user
    public void udateUser(@PathVariable int id,@RequestBody User user){
    userservice.updateUser(id,user);
}

    //http://localhost:8085/deleteUser/1
@DeleteMapping("deleteUser/{id}")  //deleteing user
    public void deletrUser(@PathVariable int id){
        userservice.deleteUser(id);
}



}
