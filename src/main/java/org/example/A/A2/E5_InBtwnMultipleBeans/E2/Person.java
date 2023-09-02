package org.example.A.A2.E5_InBtwnMultipleBeans.E2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
  private String name = "Ella";
  private Parrot parrot;

 /* public Person(Parrot parrot1) {
    this.parrot = parrot1;
  }*/
  public Person(@Qualifier("parrotA") Parrot parrot) {
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

  public void setParrot(Parrot parrot) {
    this.parrot = parrot;
  }
}
