package cn.hpe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hpe.pojo.User;
import cn.hpe.service.UserService;

@RequestMapping("user")
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("queryUserByName/{userName}")
	public List<User> queryUserByName(@PathVariable String userName){
		return userService.queryUseyByName(userName);
		
	}
	@RequestMapping("queryUsers")
	public List<User> queryUsers(){
		return userService.queryUsers();
		
	}

}
