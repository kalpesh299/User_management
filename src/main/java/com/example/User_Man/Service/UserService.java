package com.example.User_Man.Service;


import com.example.User_Man.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserService {
    public static List<User>users=new ArrayList<>();

    private static int id_=0;
    static {
        users.add(new User(++id_,"kalpesh","kalp","kalyan","12347890"));
        users.add(new User(++id_,"Ajay","Aj123","Mumbai","22247890"));
        users.add(new User(++id_,"Satya","saty","Murbad","91780090"));
        users.add(new User(++id_,"Rohit","rohya","kalyan","12347890"));
    }
public List<User>displayAll(){
        return users;
}

public static User user_by_id(int id){
    Predicate<? super User> predicate= user->user.getUser_id()==id;

    User user=users.stream().filter(predicate).findFirst().get();
    return user;
}

public void addUser(User user){
        users.add(user);
}

public void updateUser(int id,User new_user){
User user=user_by_id(id);
user.setName(new_user.getName());
user.setUsername(new_user.getUsername());
user.setPh_number(new_user.getPh_number());
user.setAddress(new_user.getAddress());
    }

  public void deleteUser(int id){
      Predicate <? super User>predicate=todo->todo.getUser_id()==id;
      users.removeIf(predicate);
  }
}
