package org.example.A2_01_Example_DirectWiring;

public class Parrot {
  private String name;

  public Parrot() {
    System.out.println("Parrot created");
  }

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
