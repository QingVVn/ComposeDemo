package com.lkp.composedemo.jpa;

import com.lkp.composedemo.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserReporsitoryTest {
	
	@Autowired
	UserReporsitory userReporsitory;
	@Test
	public void findByName() throws Exception {
		//UserEntity name = userReporsitory.findByName("aa");
		System.out.println("");
	}
	
	@Test
	public void save() throws Exception {
		userReporsitory.save(new UserEntity("aa",18,"13838385438"));
	}
}