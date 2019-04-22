package com.springbootmssqldemo.springbootmssqldemo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.springbootmssqldemo.springbootmssqldemo.model.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Long>{

}
