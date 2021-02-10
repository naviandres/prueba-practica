package com.prueba.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.model.dao.IUserDao;
import com.prueba.model.entitys.User;

@RestController
@RequestMapping(value = "users-rest")
public class UserRest {
	@Autowired
	private IUserDao userDao;

	/**
	 * consulta todos los usuarios
	 * 
	 * @return
	 */
	@GetMapping
	public ResponseEntity<List<User>> getUsers() {
		return ResponseEntity.ok(userDao.findAll());
	}

	/**
	 * crea nuevo usuario
	 * 
	 * @param newUser
	 * @return
	 */
	@PostMapping
	public ResponseEntity<String> createUser(User newUser) {
		try {
			userDao.save(newUser);
			return ResponseEntity.ok("200");
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}

	}

	/**
	 * edita procesar
	 * 
	 * @param users
	 * @return
	 */
	@PutMapping
	public ResponseEntity<String> updateUsers(@RequestBody List<String> users) {
		try {
			for (String idUser : users) {
				Optional<User> user = userDao.findById(Long.parseLong(idUser));
				User userUpdate = user.get();
				userUpdate.setProcesar(true);
				userDao.save(userUpdate);
			}
			return ResponseEntity.ok("200");
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
}
