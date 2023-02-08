package com.example.userManagement.service;

import com.example.userManagement.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static List<User> user = new ArrayList<>();
    static{
        user.add(new User(1,"computer","mahadev","Mysore","9844165709"));
        user.add(new User(2,"bike","shiva","bengaluru","|243315229"));
        user.add(new User(3,"car","kumar","patna","5624358391"));
        user.add(new User(4,"cycle","rocky","delhi","7352826354"));
        user.add(new User(5,"mobile","kumar","kgf","9834561828"));
    }
    public List<User> findAll()
    {
        return user;
    }
    public User getUserById(int id)
    {
        for(User uss:user)
        {
            if(uss.getUserId()==id)
            {
                return uss;
            }
        }
        return user.get(1);
    }
     public void addUser(User use)
     {
         user.add(use);
     }

     public void  UpdateUser(int id,User user1)
     {
         User oldUser=getUserById(id);
         oldUser.setUserId(user1.getUserId());
         oldUser.setName(user1.getName());
         oldUser.setUserName(user1.getUserName());
         oldUser.setAddress(user1.getAddress());
         oldUser.setPhoneNumber(user1.getPhoneNumber());
     }

     public void deleteUser(int id)
     {
         User ur=getUserById(id);
         user.remove(ur);
     }




}
