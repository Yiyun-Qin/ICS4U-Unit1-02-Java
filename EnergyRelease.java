import java.lang.Math;
import java.util.Scanner;

/**
 * The HelloWorld program implements an application that
 * simply displays log number question to the standard output.
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since   2022-10-23
 */

class EnergyRelease {
  public static void main(String[] args) {
    String massString;
    double mass = -1;
    double energy = -1;
    double speedLight = 2.998 * Math.pow(10, 8);
    String logLength = "";
    Scanner myObj = new Scanner(System.in);
    System.out.print("Enter the mass of an object in kilograms: ");
    massString = myObj.next() + myObj.nextLine();

    try {
      mass = Double.parseDouble(massString);
      energy = mass * speedLight;
      System.out.println(mass + " kg of mass would produce " + energy + " of energy.");
    } catch (Exception e) {
      System.out.println("Invalid number!");
    } finally {
      System.out.println("\nDone.");
    }
  }
}
