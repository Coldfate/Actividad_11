public class Circle implements Shape{
    protected static final double pi = 3.1416;
    protected static double radio;
    protected static final double constant = 2;

    @Override
    public double getArea(double radio, double constant,double param3) {
        return pi*(Math.pow(radio,2));
    }

    @Override
    public double getPerimeter(double radio, double constant,double param3) {
        return constant*pi*radio;
    }
}
