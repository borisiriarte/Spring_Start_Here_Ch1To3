package org.example.A.A2.E5_InBtwnMultipleBeans.E1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
  @Bean
  public Parrot parrotX() {
    var p = new Parrot();
    p.setName("Ruth");
    return p;
  }

  @Bean
  public Parrot parrotY() {
    var pt = new Parrot();
    pt.setName("Charlie");
    return pt;
  }

 /* @Bean
  public Person person( Parrot parrotX) {
    var p = new Person();
    p.setName("Juan");
    p.setParrot(parrotX);
    return p;
  }*/
  @Bean
  public Person person(@Qualifier("parrotX") Parrot parrot) {
    var p = new Person();
    p.setName("Juan");
    p.setParrot(parrot);
    return p;
  }
}
