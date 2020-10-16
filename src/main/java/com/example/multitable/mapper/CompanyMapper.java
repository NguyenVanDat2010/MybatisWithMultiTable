package com.example.multitable.mapper;

import com.example.multitable.model.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @author nvdat2
 */
@Mapper
public interface CompanyMapper {
    @Select("select * from company where id = #{id}")
    @Results({@Result(property = "companyName", column = "name")})
    Company getCompanyById(Long id);
}
