package cn.hpe.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.hpe.pojo.User;

@Mapper
public interface UserMapper {
	//第一种方式,用注释
	@Select("select* from tb_user where user_name like '%${name}%'")
	public List<User> queryUseyByName(@Param("name") String name);
	
	//第二种方式，用映射文件
	public List<User> queryUsers();
	
	
}
