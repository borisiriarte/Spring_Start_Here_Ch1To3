package org.example.A1_00_Example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var variable = ProjectConfig.class;
    var ctx = new AnnotationConfigApplicationContext(variable);

    Parrot p = ctx.getBean(Parrot.class);
    System.out.println(p.getName());

    String s = ctx.getBean(String.class);
    System.out.println(s);

    Integer i = ctx.getBean(Integer.class);
    System.out.println(i);

  }
}