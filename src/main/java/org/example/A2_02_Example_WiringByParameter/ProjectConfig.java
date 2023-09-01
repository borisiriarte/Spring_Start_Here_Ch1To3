package org.example.A2_02_Example_WiringByParameter;

import org.example.A2_01_Example_DirectWiring.Parrot;
import org.example.A2_01_Example_DirectWiring.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
  @Bean
  public org.example.A2_01_Example_DirectWiring.Person person(Parrot parrot) {
    var p = new Person();
    p.setName("Juan");
    p.setParrot(parrot); //Spring searches for a Parrot object to inject it to person
    return p;
  }

  @Bean
  public org.example.A2_01_Example_DirectWiring.Parrot parrot() {
    var pt = new Parrot();
    pt.setName("Camille");
    return pt;
  }
}
