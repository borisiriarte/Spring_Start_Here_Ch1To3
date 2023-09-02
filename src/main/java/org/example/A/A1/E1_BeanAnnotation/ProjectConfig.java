package org.example.A.A1.E1_BeanAnnotation;

import org.example.A.A1.E0.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
  //You can change the name of the bean by setting a name, value or simply a string with the name you want, either
  // way you can use the default name of the method
  @Bean
  Parrot parrot1() {
    var p = new Parrot();
    p.setName("Camila");
    return p;
  }
  @Bean(name = "p1")
  /*@PrimaryThis primary annotation makes that spring choses this one among the others*/
  Parrot parrot2() {
    var p = new Parrot();
    p.setName("Antonella");
    return p;
  }
  @Bean(value = "p2")
  Parrot parrot3() {
    var p = new Parrot();
    p.setName("Brian");
    return p;
  }
  @Bean("p3")
  Parrot parrot4() {
    var p = new Parrot();
    p.setName("Brian");
    return p;
  }
}
