package me.fizal.MerlinBot;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

  static Bot botInstance;

  public static void main(String[] args) {

    try {
      botInstance = new Bot().main();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    SpringApplication app = new SpringApplication(MainApplication.class);
    app.setDefaultProperties(Collections.singletonMap("server.port", "8080"));
    app.run(args);
  }

}