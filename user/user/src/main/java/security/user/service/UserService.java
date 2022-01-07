package security.user.service;

import security.user.model.User;

public interface UserService {
User saveUser(User user);
void deleteUser(int id);

}
