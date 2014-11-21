package sport_challenge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sport_challenge.entities.Users;
import sport_challenge.services.UsersServiceImpl;

import java.util.List;

/**
 * Created by aschulz1 on 20.11.14.
 */

@Controller
@RequestMapping
public class IndexController {

  private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

  @Autowired
  private UsersServiceImpl usersServiceImpl;

  @RequestMapping(value = "/index", method = RequestMethod.GET)
  private String getIndexPage(ModelMap model) {

    List<Users> userList = usersServiceImpl.getUsers();
    for (Users user : userList) {
      LOGGER.debug("User:"+user.getId()+"<>"+user.getName());
    }

    return "index";
  }

}
