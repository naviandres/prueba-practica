package com.prueba.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prueba.model.entitys.User;

public interface IUserDao extends  JpaRepository<User,Long>{

}
