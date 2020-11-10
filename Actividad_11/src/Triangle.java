public class Triangle implements Shape {
    protected static double lado;
    protected static double base;
    protected static double altura;
    protected static final double div = 2;

    @Override
    public double getArea(double lado, double altura, double base) {
        return (lado*altura)/2;
    }

    @Override
    public double getPerimeter(double lado, double altura, double base) {
        return lado*3;
    }
}
