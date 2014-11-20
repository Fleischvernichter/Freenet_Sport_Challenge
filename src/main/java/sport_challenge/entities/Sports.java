package sport_challenge.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by aschulz1 on 21.11.14.
 */
@Entity
@Table(name = "sports")
public class Sports {

  @Id
  @GeneratedValue
  private int id;



}
