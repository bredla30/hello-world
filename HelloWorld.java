
package javaapplication1;

public class HelloWorld {

  public static void main (String[] args) {
    System.out.println("Welcome to Java");
    System.out.println("Welcome to Github");

    new HelloWorld ().printText();
}
  
  private void printText() {
  
    System.out.println("my printtext method call");
  }
}
