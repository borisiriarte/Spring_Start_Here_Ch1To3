package org.example.A.A2.E0_NoWiring;

public class Parrot {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Parrot{" +
        "name='" + name + '\'' +
        '}';
  }
}
