package sport_challenge.entities;


import javax.persistence.*;

/**
 * Created by aschulz1 on 21.11.14.
 */
@Entity
@Table(name = "sports")
public class Sports {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
