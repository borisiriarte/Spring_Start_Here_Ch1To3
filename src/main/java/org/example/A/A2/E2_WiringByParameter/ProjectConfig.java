package org.example.A.A2.E2_WiringByParameter;

import org.example.A.A2.E1_DirectWiring.Parrot;
import org.example.A.A2.E1_DirectWiring.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
  @Bean
  public Person person(Parrot parrot) {
    var p = new Person();
    p.setName("Juan");
    p.setParrot(parrot); //Spring searches for a Parrot object to inject it to person
    return p;
  }

  @Bean
  public Parrot parrot() {
    var pt = new Parrot();
    pt.setName("Camille");
    return pt;
  }
}
