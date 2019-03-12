package com.springboot.mapper;

import com.springboot.entity.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface StaffMapper {

    @Select("select * from staff where username=#{username} and password=#{password}")
    public Staff staffLogin(@Param("username") String username, @Param("password") String password);

}
