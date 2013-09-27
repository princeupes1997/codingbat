package codingbat.string1;

//Given a string, return a string length 1 from its front, unless front is false, 
//in which case return a string length 1 from its back. The string will be non-empty. 
//
//theEnd("Hello", true) = "H"
//theEnd("Hello", false) = "o"
//theEnd("oh", true) = "o"

public class TheEndTest {

  public static void main(String[] args) {

    TheEndTest test = new TheEndTest();

    System.out.println(">" + test.theEnd("Hello", true) + "<");
    System.out.println(">" + test.theEnd("Hello", false) + "<");
    System.out.println(">" + test.theEnd("oh", true) + "<");
  }

  public String theEnd(String str, boolean front) {
    if (front) {
      return str.substring(0, 1);
    }
    else {
      return str.substring(str.length() - 1, str.length());
    }
  }

}