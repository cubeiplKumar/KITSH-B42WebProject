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
  #feature202 changes by vivek on october 2024 on reports module
  public static int square(int num) {

    // return statement
    return num * num;
  }

  public static void main(String[] args) {
    int result;

    // call the method
    // store returned value to result
    result = square(10);

    System.out.println("Squared value of 10 is: " + result);
  }
}
#feature202 code ends here

}