package lab1;

public class Rectangulo {

    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = c1;
        this.esquina2 = c2;
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public double calculoArea() {

        double base = Math.max(esquina1.getX(), esquina2.getX()) -
                      Math.min(esquina1.getX(), esquina2.getX());

        double altura = Math.max(esquina1.getY(), esquina2.getY()) -
                        Math.min(esquina1.getY(), esquina2.getY());

        return base * altura;
    }

    @Override
    public String toString() {
        return "(" + esquina1 + ", " + esquina2 + ")";
    }
}