package org.example.A.A1.E0;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

  @Bean
  public Parrot parrot(){
    var p = new Parrot();
    p.setName("Camila");

    return p;
  }

  @Bean
  public String hello() {
    return "Hello";
  }

  @Bean
  public Integer ten(){
    return 10;
  }
}
