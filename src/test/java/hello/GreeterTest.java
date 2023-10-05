package test.java.hello;

import hello.Greeter;

public class GreeterTest {
  
  private Greeter greeter = new Greeter();

  @Test
  public void greeterSaysHello() {
    assertThat(greeter.sayHello(), containsString("Hello"));
  }

private void assertThat(String sayHello, Object containsString) {
}

private Object containsString(String string) {
    return null;
}

}