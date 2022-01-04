// Exercise 2. Hands-On:
// a. Calculate the area and the perimeter of triangle, rectangle, circle (either 3 programs or 6 programs for each shape)
// b. Conversion: Temperature (Celsius -> F and F -> to C || Centimeter to inches and Inches to centimeter)

public class jan4 {
  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Please enter arguments");
      return;
    }

    try {
      switch (args[0]) {
        case "triangle":
          if (args[1].equals("area"))
            System.out.println(Triangle.area(pd(args[2]), pd(args[3])));
          else if (args[1].equals("perimeter"))
            System.out.println(Triangle.perimeter(pd(args[2]), pd(args[3]), pd(args[4])));
          break;
        case "rectangle":
          if (args[1].equals("area"))
            System.out.println(Rectangle.area(pd(args[2]), pd(args[3])));
          else if (args[1].equals("perimeter"))
            System.out.println(Rectangle.perimeter(pd(args[2]), pd(args[3])));
          break;
        case "circle":
          if (args[1].equals("area"))
            System.out.println(Circle.area(pd(args[2])));
          else if (args[1].equals("perimeter"))
            System.out.println(Circle.perimeter(pd(args[2])));
          break;
        case "convert":
          switch (args[1]) {
            case "inches":
              System.out.println(Conversions.iToCm(pd(args[2])));
              break;
            case "centimeters":
              System.out.println(Conversions.cmToI(pd(args[2])));
              break;
            case "f":
              System.out.println(Conversions.fToC(pd(args[2])));
              break;
            case "c":
              System.out.println(Conversions.cToF(pd(args[2])));
              break;
          }
          break;
        default:
          System.out.println("Invalid argument");
      }
    } catch (Exception e) {
      System.out.println("You entered something incorrectly, try again");
    }
  }

  public static double pd(String s) {
    return Double.parseDouble(s);
  }

  private class Triangle {
    public static double area(double base, double height) {
      return 0.5 * base * height;
    }

    public static double perimeter(double a, double b, double c) {
      return a + b + c;
    }
  }

  private class Rectangle {
    public static double area(double length, double width) {
      return length * width;
    }

    public static double perimeter(double length, double width) {
      return (2 * length) + (2 * width);
    }
  }

  private class Circle {
    public static double area(double radius) {
      return radius * radius * Math.PI;
    }

    public static double perimeter(double radius) {
      return 2 * radius * Math.PI;
    }
  }

  private class Conversions {
    public static double fToC(double degrees) {
      return (degrees - 32) * (5.0 / 9.0);
    }

    public static double cToF(double degrees) {
      return (degrees * (9.0 / 5.0)) + 32;
    }

    public static double iToCm(double inches) {
      return inches * 2.54;
    }

    public static double cmToI(double centimeters) {
      return centimeters / 2.54;
    }
  }
}