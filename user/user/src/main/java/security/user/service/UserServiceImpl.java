package security.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import security.user.entity.UserEntity;
import security.user.model.User;
import security.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepository userRepository;
	@Override
	public User saveUser(User user) {
		UserEntity u=new UserEntity();
		u.setAddress(user.getAddress());
		u.setEmail(user.getEmail());
		u.setGender(user.getGender());
		u.setName(user.getName());
		userRepository.save(u);
		return user;
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
		
	}

}
