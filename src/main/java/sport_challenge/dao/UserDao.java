package sport_challenge.dao;

import sport_challenge.entities.Users;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aschulz1
 * Date: 21.11.14
 * Time: 15:51
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao {

  public List<Users> getUsers();

}
