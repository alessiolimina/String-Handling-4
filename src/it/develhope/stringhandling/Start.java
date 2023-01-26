package it.develhope.stringhandling;

public class Start {
    public static void main(String[] args) {

      System.out.println("----------------Starting--------------------");

      String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit,sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

      veryLongString = veryLongString.replaceAll("um","HUM");

      System.out.println(veryLongString);

      System.out.println(veryLongString.indexOf("aliquip"));

      String sub1 = veryLongString.substring(0,199);
      String sub2 = veryLongString.substring(199);

      System.out.println(sub1.trim());
      System.out.println(sub2.trim());

      System.out.println(sub1.contains("est") ^ sub2.contains("est"));

      System.out.println("----------------------------------------------");

    }
}
