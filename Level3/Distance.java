package Level3;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        double d4 = sc.nextDouble();
        double distance = Distance(d1, d2, d3, d4);
        double[] line = LineEquation(d1, d2, d3, d4);
        System.out.println("Euclidean Distance: " + distance);
        System.out.println("Slope (m): " + line[0]);
        System.out.println("Y-intercept (b): " + line[1]);
        System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);
        sc.close();
    }

    public static double Distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] LineEquation(double d1, double d2, double d3, double d4) {
        double slope = (d4 - d2) / (d3 - d1);
        double constant = d4 - slope * d1;
        return new double[]{slope, constant};
    }
    
}
