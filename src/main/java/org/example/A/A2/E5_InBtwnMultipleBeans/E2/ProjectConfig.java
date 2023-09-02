package org.example.A.A2.E5_InBtwnMultipleBeans.E2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.A2_05_Example_InBtwnMultipleBeans.E2")
public class ProjectConfig {
  @Bean
  public Parrot parrotA() {
    var p = new Parrot();
    p.setName("Ruth");
    return p;
  }

  @Bean
  public Parrot parrotB() {
    var pt = new Parrot();
    pt.setName("Charlie");
    return pt;
  }
}
