package org.example.A.A2.E3_AutoWiringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
  private String name = "Charlie";

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
