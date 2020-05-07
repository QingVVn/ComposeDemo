package com.lkp.composedemo.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
	
	//private final UserReporsitory userReporsitory;

	@Resource
	private RedisTemplate redisTemplate;
	
	/*public TestController(UserReporsitory userReporsitory) {
		this.userReporsitory = userReporsitory;
	}
	
	@GetMapping("getUserInfo")
	public String getUserInfo(String name){
		UserEntity userEntity = userReporsitory.findByName(name);
		return userEntity.toString();
	}*/
	
	@GetMapping("setRedis")
	public String setRedis(String key,String val){
		redisTemplate.opsForValue().set(key,val);
		
		return "成功";
	}
	
	@GetMapping("getRedisName")
	public Object getRedisName(String key){
		Object o = redisTemplate.opsForValue().get(key);
		return o;
	}

	@GetMapping("test")
	public String test(){
		return "test";
	}
}
