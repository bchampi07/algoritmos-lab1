package lab1;

public class Main {

    public static void main(String[] args) {

        ContainerRect cont = new ContainerRect(10);

        Coordenada c1 = new Coordenada(7.6, 2.2);
        Coordenada c2 = new Coordenada(1.5, 0.3);
        Rectangulo ra = new Rectangulo(c1, c2);
        cont.addRectangulo(ra);

        Coordenada c3 = new Coordenada(9.4, -2.5);
        Coordenada c4 = new Coordenada(4.0, 4.2);
        Rectangulo rb = new Rectangulo(c3, c4);
        cont.addRectangulo(rb);

        System.out.println("Rectangulo A = " + ra);
        System.out.println("Rectangulo B = " + rb);

        if (Verificador.esDisjunto(ra, rb)) {
            System.out.println("Rectangulos A y B son disjuntos");
        }
        else if (Verificador.esJunto(ra, rb)) {
            System.out.println("Rectangulos A y B se juntan");
        }
        else if (Verificador.esSobrePos(ra, rb)) {
            System.out.println("Rectangulos A y B se sobreponen");

            Rectangulo r = rectanguloSobre(ra, rb);
            System.out.println("Area de sobreposicion = " + r.calculoArea());
        }

        System.out.println("\n--- CONTENEDOR ---");
        System.out.println(cont);
    }

    public static Rectangulo rectanguloSobre(Rectangulo r1, Rectangulo r2) {

        double xmin = Math.max(
            Math.min(r1.getEsquina1().getX(), r1.getEsquina2().getX()),
            Math.min(r2.getEsquina1().getX(), r2.getEsquina2().getX())
        );

        double xmax = Math.min(
            Math.max(r1.getEsquina1().getX(), r1.getEsquina2().getX()),
            Math.max(r2.getEsquina1().getX(), r2.getEsquina2().getX())
        );

        double ymin = Math.max(
            Math.min(r1.getEsquina1().getY(), r1.getEsquina2().getY()),
            Math.min(r2.getEsquina1().getY(), r2.getEsquina2().getY())
        );

        double ymax = Math.min(
            Math.max(r1.getEsquina1().getY(), r1.getEsquina2().getY()),
            Math.max(r2.getEsquina1().getY(), r2.getEsquina2().getY())
        );

        return new Rectangulo(new Coordenada(xmin, ymin),
                              new Coordenada(xmax, ymax));
    }
}