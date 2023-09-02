package org.example.A.A2.E5_InBtwnMultipleBeans.E2;


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
