package org.example.A1_01_Example;

import org.example.A1_00_Example.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Parrot p = ctx.getBean("parrot2",Parrot.class);

    System.out.println(p.getName());
  }
}
