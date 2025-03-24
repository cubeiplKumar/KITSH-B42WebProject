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
  #feature201 changes by Ethan on oct 2024 on reports module
   public static void main(String[] args) {
    
    int num1 = 25;
    int num2 = 15;

    // create an object of Main
    Main obj = new Main();
    // calling method
    int result = obj.addNumbers(num1, num2);
    System.out.println("Sum is: " + result);
  }
}
#end of feature202

}