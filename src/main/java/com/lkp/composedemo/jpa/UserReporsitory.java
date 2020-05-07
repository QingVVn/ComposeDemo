package com.lkp.composedemo.jpa;

import com.lkp.composedemo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReporsitory extends JpaRepository<UserEntity,String>{
	UserEntity findByName(String name);
}
