package cn.jasmine.entity.admin;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


/**
 * 用户ENTITY
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "user")
public class User {

  @Id
  @Column(name = "id")
  @GenericGenerator(name = "generator",strategy = "native")
  @GeneratedValue(generator = "generator")
  private Long id;

  @Column(name = "username")
  private String username;

  @Column(name = "password")
  private String password;

  @Column(name = "nickname")
  private String nickname;

}
