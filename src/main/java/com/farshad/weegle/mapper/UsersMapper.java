package com.farshad.weegle.mapper;

import com.farshad.weegle.model.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface UsersMapper {

    @Select("select * from customers")
    List<Users> findAll();

    @Insert("insert into customers(first_name,last_name) values(#{first_name},#{last_name})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()",keyProperty = "customer_id",
    before = false, resultType = Integer.class)
    void insert(Users users);
}
