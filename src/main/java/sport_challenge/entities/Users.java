package sport_challenge.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: aschulz1
 * Date: 20.11.14
 * Time: 16:06
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table (name = "users")
public class Users {

  @Id
  @GeneratedValue
  private int id;

  private String name;

  private String mail;

  private String color;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
