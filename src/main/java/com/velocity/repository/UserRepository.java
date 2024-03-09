package com.velocity.repository;

import java.io.Serializable;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.velocity.model.*;

public interface UserRepository extends CrudRepository<User, Serializable>
{
	//public Employee findById(Integer id);
	public User findById(Integer id);
}