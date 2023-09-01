package org.example.A2_01_Example_DirectWiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
  @Bean
  public Person person() {
    var p = new Person();
    p.setName("Juan");
    p.setParrot(parrot()); //We define the relationship between both by directly calling the method that returns the
    // bean we want to set
    return p;
  }

  @Bean
  public Parrot parrot() {
    var pt = new Parrot();
    pt.setName("Ruth");
    return pt;
  }
}
