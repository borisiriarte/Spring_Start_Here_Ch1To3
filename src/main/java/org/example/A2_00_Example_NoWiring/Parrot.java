package org.example.A2_00_Example_NoWiring;

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
