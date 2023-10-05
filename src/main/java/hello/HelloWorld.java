package hello;

import java.time.*;

public class HelloWorld {
  /**
 * @param args
 */
public static void main(String[] args) {
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}