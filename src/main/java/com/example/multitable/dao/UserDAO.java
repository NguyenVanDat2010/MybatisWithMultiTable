package com.example.multitable.dao;

import com.example.multitable.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author nvdat2
 */
@Mapper
@Component
public interface UserDAO {

//    @Select("select * from user where id = #{id}")
//    @Results({@Result(property = "company", column = "company_id", one = @One(select =
//            "com.example.multitable.dao.CompanyDAO.getCompanyById"))})
    User getUserWithCompany(@Param("id") Long id);


//    @Select("select * from user where id = #{id}")
//    @Results({@Result(property = "accounts", column = "id", many = @Many(select =
//            "com.example.multitable.dao.AccountDAO.getAccountByUserId"))})
    User getUserWithAccount(@Param("id") Long id);


//    @Select("select * from user")
//    @Results({@Result(property = "company", column = "company_id", one = @One(select =
//            "com.example.multitable.dao.CompanyDAO.getCompanyById")),
//            @Result(property = "accounts", column = "id", many = @Many(select =
//                    "com.example.multitable.dao.AccountDAO.getAccountByUserId"))})
    List<User> getAllUsers();

}
