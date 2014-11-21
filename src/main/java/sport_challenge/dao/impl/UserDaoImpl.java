package sport_challenge.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sport_challenge.entities.Users;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aschulz1
 * Date: 21.11.14
 * Time: 15:51
 * To change this template use File | Settings | File Templates.
 *
 */

@Repository
public class UserDaoImpl {

  @Autowired
  private SessionFactory sessionFactory;

  public List<Users> getUsers() {
    Session session = this.sessionFactory.getCurrentSession();

    List<Users> userList = session.createQuery("from sport_challenge.entities.Users").list();

    return userList;
  }

  public void addUser(Users user) {
    Session session = this.sessionFactory.getCurrentSession();
    session.saveOrUpdate(user);
  }
}
