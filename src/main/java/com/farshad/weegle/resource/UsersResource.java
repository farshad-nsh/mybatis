package com.farshad.weegle.resource;


import com.farshad.weegle.mapper.UsersMapper;
import com.farshad.weegle.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UsersMapper usersMapper;

    public UsersResource(UsersMapper usersMapper){
       this.usersMapper=usersMapper;
    }

    @GetMapping("/all")
    public List<Users> getAll(){
        return usersMapper.findAll();
    }

    @GetMapping("/update")
    private List<Users> update(){
        Users users=new Users();
        users.setFirst_name("farshad");
        users.setLast_name("noravesh");
        usersMapper.insert(users);
        return  usersMapper.findAll();
    }


}
