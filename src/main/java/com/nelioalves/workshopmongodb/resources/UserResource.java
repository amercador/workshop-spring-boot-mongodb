package com.nelioalves.workshopmongodb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.workshopmongodb.domain.User;
import com.nelioalves.workshopmongodb.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		//User maria = new User("1", "Maria Brown", "maria@email.com");
		//User alex = new User("2", "Alex Green", "alex@email.com");
		List<User> list = service.findAll();
		//list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);
	}

}
