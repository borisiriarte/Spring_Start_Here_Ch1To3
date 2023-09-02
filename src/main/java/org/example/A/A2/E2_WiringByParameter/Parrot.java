package org.example.A.A2.E2_WiringByParameter;

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
