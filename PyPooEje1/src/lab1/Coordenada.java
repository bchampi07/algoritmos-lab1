package lab1;

public class Coordenada {

    private double x;
    private double y;

    public Coordenada() {
        x = 0;
        y = 0;
    }

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Coordenada(Coordenada c) {
        this.x = c.getX();
        this.y = c.getY();
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double distancia(Coordenada c) {
        return Math.sqrt(Math.pow(c.getX() - this.x, 2) +
                         Math.pow(c.getY() - this.y, 2));
    }

    static double distancia(Coordenada c1, Coordenada c2) {
        return Math.sqrt(Math.pow(c2.getX() - c1.getX(), 2) +
                         Math.pow(c2.getY() - c1.getY(), 2));
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}