#package com.opensource.example;

public class Example {
  public static void main(String[] args) {
    // generate some data
    long myTime = System.currentTimeMillis();
    String weather;

    if ( myTime%2 == 0 ) {
      weather = "party";
    } else {
      weather = "apocalypse";
    }

    // call the other method
    report(weather);
  }

  private static void report(String day) {
    System.out.printf("Welcome to the zombie %s\n", day);
  }
}