package com.springbootmssqldemo.springbootmssqldemo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.springbootmssqldemo.springbootmssqldemo.web.dto.UsersDto;

@Service
public interface UserService {

	List<UsersDto> findAll();
	UsersDto findByUserId(Long userId);

}
