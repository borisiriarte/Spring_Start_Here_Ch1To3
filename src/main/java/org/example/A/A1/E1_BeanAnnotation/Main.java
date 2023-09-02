package org.example.A.A1.E1_BeanAnnotation;

import org.example.A.A1.E0.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Parrot p = ctx.getBean("parrot2",Parrot.class);

    System.out.println(p.getName());
  }
}
