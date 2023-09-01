package org.example.A1_02_Example_StereotypeAnnotations;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Parrot {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @PostConstruct
  public void init() {
    this.setName("Camila");
    System.out.println("Creating or executing something after beans initialization");
  }

  @PreDestroy //This annotation is not recommendable by any means
  public void end() {
    System.out.println("Destroying something before closing and clearing the context");
  }
}
