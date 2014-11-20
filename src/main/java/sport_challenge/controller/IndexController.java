package sport_challenge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by aschulz1 on 20.11.14.
 */

@Controller
@RequestMapping("/")
public class IndexController {

  @RequestMapping(value = "index", method = RequestMethod.GET)
  private String getIndexPage(ModelMap model) {


    return "index";
  }

}
