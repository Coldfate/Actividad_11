import java.util.Scanner;

public class Square implements Shape {

    protected static double lado;

    @Override
    public double getArea(double lado,double param2, double param3) {
        return Math.pow(lado,2);
    }

    @Override
    public double getPerimeter(double lado, double param2, double param3) {
        return 4*lado;
    }
}
