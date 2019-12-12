package cn.hpe.service;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.hpe.pojo.User;

public interface UserService {
	
	public List<User> queryUseyByName(String name);
	
	public List<User> queryUsers();

}
