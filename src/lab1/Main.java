package lab1;

public class Main {
	 public static void main (String[] args) {
		 
		 Coordenada c1 = new Coordenada(7.6, 2.2);
		 Coordenada c2 = new Coordenada(1.5,0.3);
		 Rectangulo ra = new Rectangulo(c1,c2);
		 
		 Coordenada c3 = new Coordenada(9.4,-2.5);
		 Coordenada c4 = new Coordenada(4.0,4.2);
		 Rectangulo rb = new Rectangulo(c3,c4);
		 
		 System.out.println("Rectangulo A = " + ra);
		 System.out.println("Rectangulo B = " + rb);
		 

		 
		 if (Verificador.esDisjunto(ra, rb)) {
			 System.out.println("Rectangulos A Y B son disjuntos");
		 }
		 
		 if (Verificador.esJunto(ra, rb)) {
			 System.out.println("Rectangulos A Y B se juntan");
		 }
		 
		 if (Verificador.esSobrePos(ra, rb)) {
			 System.out.println("Rectangulos A y B se sobreponen");
			 Rectangulo rsobre = rectanguloSobre(ra,rb);
			 System.out.println("Area de sobreposicion = " + rsobre.calcularArea());
		 }
	 }
	 
	 public static Rectangulo rectanguloSobre(Rectangulo r1, Rectangulo r2) {

		    double xmin1 = Math.min(r1.getEsquina1().getX(), r1.getEsquina2().getX());
		    double xmax1 = Math.max(r1.getEsquina1().getX(), r1.getEsquina2().getX());
		    double ymin1 = Math.min(r1.getEsquina1().getY(), r1.getEsquina2().getY());
		    double ymax1 = Math.max(r1.getEsquina1().getY(), r1.getEsquina2().getY());

		    double xmin2 = Math.min(r2.getEsquina1().getX(), r2.getEsquina2().getX());
		    double xmax2 = Math.max(r2.getEsquina1().getX(), r2.getEsquina2().getX());
		    double ymin2 = Math.min(r2.getEsquina1().getY(), r2.getEsquina2().getY());
		    double ymax2 = Math.max(r2.getEsquina1().getY(), r2.getEsquina2().getY());

		    double xmin = Math.max(xmin1, xmin2);
		    double xmax = Math.min(xmax1, xmax2);
		    double ymin = Math.max(ymin1, ymin2);
		    double ymax = Math.min(ymax1, ymax2);

		    Coordenada c1 = new Coordenada(xmin, ymin);
		    Coordenada c2 = new Coordenada(xmax, ymax);

		    return new Rectangulo(c1, c2);
		}

}
