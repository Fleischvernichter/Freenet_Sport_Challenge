package sport_challenge.services;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sport_challenge.dao.impl.UserDaoImpl;
import sport_challenge.entities.Users;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aschulz1
 * Date: 21.11.14
 * Time: 15:55
 * To change this template use File | Settings | File Templates.
 */

@Service
public class UsersServiceImpl {

  @Autowired
  private UserDaoImpl userDaoImpl;

//  public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
//    this.userDaoImpl = userDaoImpl;
//  }

  @Transactional
  public List<Users> getUsers() {
    return this.userDaoImpl.getUsers();
  }

  @Transactional
  public void addUser(Users user) {
    userDaoImpl.addUser(user);
  }
}
