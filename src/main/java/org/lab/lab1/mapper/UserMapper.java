package org.lab.lab1.mapper;

import org.apache.ibatis.annotations.*;
import org.lab.lab1.pojo.User;

import java.util.List;

@Mapper
public interface UserMapper {
    //    查看用户信息
    @Select("select * from user where id = #{id}")
    public User findById(Integer id);

    //    查看所有用户
    @Select("select * from user")
    public List<User> findAll();

    @Insert("insert into user(id,name,gender,age)" + "values(#{id},#{name},#{gender},#{age})")
    public void addUser(User user);

    @Update("update user set name=#{name},gender=#{gender},age=#{age} where id=#{id}")
    public void changeUser(User user);

    @Delete("delete from user where id=#{id}")
    void deleteUser(Integer id);
}
