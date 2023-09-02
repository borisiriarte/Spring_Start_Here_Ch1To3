package org.example.A.A2.E3_AutoWiringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Autowired annotation can be omitted
public class Person {
  private String name = "Camila";
  @Autowired
  private final Parrot parrot;

  @Autowired //This is the most recommendable approach. Via Constructor
  public Person(Parrot parrot) {
    this.parrot = parrot;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Parrot getParrot() {
    return parrot;
  }

  /*@Autowired
  public void setParrot(Parrot parrot) {
    this.parrot = parrot;
  }*/
}
