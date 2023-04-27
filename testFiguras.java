import EjercicioFigurasClasses.Triangulo;
import EjercicioFigurasClasses.Cuadrado;
import EjercicioFigurasClasses.Rectangulo;
import EjercicioFigurasClasses.Rombo;
import EjercicioFigurasClasses.Romboide;
import EjercicioFigurasClasses.Trapecio;
import InterfaceFig.Standar;

public abstract class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1 = new  Cuadrado("Cuadrado #1", 20);
		Cuadrado c2 = new  Cuadrado("Cuadrado #2", 70);
		Rectangulo r1 = new  Rectangulo("Rectangulo #1", 10, 15);
		Rectangulo r2 = new  Rectangulo("Rectangulo #2", 20, 8);
		Rombo ro1 = new  Rombo("Rombo #1", 10, 15, 12);
		Rombo ro2 = new  Rombo("Rombo #2", 5, 4, 6 );
		Romboide rom1 = new  Romboide("Romboide #1", 10, 15);
		Romboide rom2 = new  Romboide("Romboide #2", 5, 4 );
		Trapecio T1 = new  Trapecio("Trapecio #1", 3, 4, 6, 3, 10, 5, 7);
		Trapecio T2 = new  Trapecio("Trapecio #2", 2,2,2,2,5,6,2 );
		// TODO: Aquí se deben instanciar las otras figuras geométricas

		imprimirCalculo(t1); imprimirCalculo(t2);
		imprimirCalculo(c1); imprimirCalculo(c2);
		imprimirCalculo(r1); imprimirCalculo(r2);
		imprimirCalculo(ro1); imprimirCalculo(ro2);
		imprimirCalculo(rom1); imprimirCalculo(rom2);
		imprimirCalculo(T1); imprimirCalculo(T2);
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		
	}//main

	public static void imprimirCalculo(Standar e) {
		System.out.println(e);
		System.out.println("+========================================");
		System.out.println("|El área de ["+e.getName()+"] es: " + e.calcularArea() + 
				"\n" + "|El perímetro de ["+e.getName()+"] es: " + e.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras