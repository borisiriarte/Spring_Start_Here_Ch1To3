package org.example.A1_01_Example;

import org.example.A1_00_Example.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
  @Bean
  Parrot parrot1() {
    var p = new Parrot();
    p.setName("Camila");
    return p;
  }
  @Bean
  Parrot parrot2() {
    var p = new Parrot();
    p.setName("Antonella");
    return p;
  }
  @Bean
  Parrot parrot3() {
    var p = new Parrot();
    p.setName("Brian");
    return p;
  }



}
