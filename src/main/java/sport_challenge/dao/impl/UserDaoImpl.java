package sport_challenge.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import sport_challenge.dao.UserDao;
import sport_challenge.entities.Users;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aschulz1
 * Date: 21.11.14
 * Time: 15:51
 * To change this template use File | Settings | File Templates.
 */
public class UserDaoImpl implements UserDao {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public List<Users> getUsers() {
    Session session = this.sessionFactory.getCurrentSession();

    List<Users> userList = session.createQuery("from Users").list();

    return userList;
  }
}
