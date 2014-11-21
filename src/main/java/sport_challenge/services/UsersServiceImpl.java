package sport_challenge.services;

import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sport_challenge.dao.UserDao;
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

  private UserDao userDao;

  @Transactional
  public List<Users> getUsers() {
    return this.userDao.getUsers();
  }
}
