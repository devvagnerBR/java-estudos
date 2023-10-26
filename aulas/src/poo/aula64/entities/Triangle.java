package poo.aula64.entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area() {

        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void getLargerArea(double areaX, double areaY) {

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

    }
}
