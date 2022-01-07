package security.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import security.user.model.User;
import security.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	@PostMapping("/create")
	public User saveUser(@RequestBody User user) {
		user=userService.saveUser(user);
		return user;
	}
	@DeleteMapping(value="/delete/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		userService.deleteUser(id);
}
}