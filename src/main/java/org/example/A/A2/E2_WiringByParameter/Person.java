package org.example.A.A2.E2_WiringByParameter;

import org.example.A.A2.E1_DirectWiring.Parrot;

public class Person {
  private String name;
  private Parrot parrot;

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
