package com.example.multitable.mapper;

import com.example.multitable.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author nvdat2
 */
@Mapper
@Component
public interface UserMapper {
    /*
     * One-to-one query
     * property: the result of the query is assigned to this entity property
     * column: corresponds to the database table field, as the following @One (select method query parameters
     * one: one-to-one query
     * @One(select = method full path): the method called
     */
    @Select("select * from user where id = #{id}")
    @Results({@Result(property = "company", column = "company_id", one = @One(select =
            "com.example.multitable.mapper.CompanyMapper.getCompanyById"))})
    User getUserWithCompany(@Param("id") Long id);

    /*
     * One-to-many query
     * property: the result of the query is assigned to this entity property
     * column: the table field corresponding to the database, can be used as the query parameter of @One (select method) below
     * many: one-to-many query
     * @Many(select = method full path): the method called
     */
    @Select("select * from user where id = #{id}")
    @Results({@Result(property = "accounts", column = "id", many = @Many(select =
            "com.example.multitable.mapper.AccountMapper.getAccountByUserId"))})
    User getUserWithAccount(@Param("id") Long id);

    /*
     * One-to-one, one-to-many query at the same time
     */
    @Select("select * from user")
    @Results({@Result(property = "company", column = "company_id", one = @One(select =
            "com.example.multitable.mapper.CompanyMapper.getCompanyById")),
            @Result(property = "accounts", column = "id", many = @Many(select =
                    "com.example.multitable.mapper.AccountMapper.getAccountByUserId"))})
    List<User> getAllUsers();

}
