package com.example.multitable.mapper;

import com.example.multitable.model.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author nvdat2
 */
@Mapper
public interface AccountMapper {
    @Select("select * from account where user_id = #{userId}")
    @Results({@Result(property = "accountName", column = "name")})
    List<Account> getAccountByUserId(@Param("userId") Long userId);

}
