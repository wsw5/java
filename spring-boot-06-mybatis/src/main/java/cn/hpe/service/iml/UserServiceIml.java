package cn.hpe.service.iml;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hpe.mapper.UserMapper;
import cn.hpe.pojo.User;
import cn.hpe.service.UserService;
@Service
public class UserServiceIml implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> queryUsers() {
		return userMapper.queryUsers();
	}
	@Override
	public List<User> queryUseyByName(String name) {
		return userMapper.queryUseyByName(name);
	}

}
