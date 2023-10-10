package br.com.andrefernando.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {
  

  /**
   * String (texto)
   * Integet (int) numeros inteiros
   * Double (double) Número 0.0000
   * Float (float) Números 0.000
   * char (A C)
   * date (data)
   * void
   */
  /*
   * Body 
   */
  @PostMapping("/")
  public void create(@RequestBody UserModel userModel){
      System.out.println(userModel.name);
  } 
}
