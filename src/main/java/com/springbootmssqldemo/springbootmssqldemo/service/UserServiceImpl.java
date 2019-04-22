package com.springbootmssqldemo.springbootmssqldemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootmssqldemo.springbootmssqldemo.web.dto.UsersDto;
import com.springbootmssqldemo.springbootmssqldemo.model.Users;
import com.springbootmssqldemo.springbootmssqldemo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository; 
	
	@Override
	public UsersDto findByUserId(Long userId) {
		return null;
	}

	@Override
	public List<UsersDto> findAll() {

		System.out.println("Inside [Class :  UserServiceImpl ||  Method :  findAll] ");
		List<UsersDto> usersListDtos = new ArrayList<UsersDto>();
		List<Users> usersList = (List<Users>) userRepository.findAll();
		
		UsersDto dto = null; 
		if(usersList != null)
		{
			for (Users u : usersList) {
				dto = entityToDto(u);
				usersListDtos.add(dto);
			}
		}
		return usersListDtos;
	}
	
	
	

	private UsersDto entityToDto(Users u) {
		UsersDto dto;
		dto = new UsersDto();
		dto.setId(u.getId());
		dto.setEmail(u.getEmail());
		dto.setName(u.getName());
		return dto;
	}

}
