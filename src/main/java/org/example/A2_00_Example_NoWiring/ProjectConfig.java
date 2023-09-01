package org.example.A2_00_Example_NoWiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
  @Bean
  public Person person() {
    var p = new Person();
    p.setName("Juan");
    return p;
  }

  @Bean
  public Parrot parrot() {
    var pt = new Parrot();
    pt.setName("Ruth");
    return pt;
  }
}
