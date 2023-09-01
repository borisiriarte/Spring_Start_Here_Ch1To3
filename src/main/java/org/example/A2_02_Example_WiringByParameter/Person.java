package org.example.A2_02_Example_WiringByParameter;

import org.example.A2_01_Example_DirectWiring.Parrot;

public class Person {
  private String name;
  private org.example.A2_01_Example_DirectWiring.Parrot parrot;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public org.example.A2_01_Example_DirectWiring.Parrot getParrot() {
    return parrot;
  }

  public void setParrot(Parrot parrot) {
    this.parrot = parrot;
  }
}
