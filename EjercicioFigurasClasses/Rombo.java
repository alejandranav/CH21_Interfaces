package EjercicioFigurasClasses;
import InterfaceFig.Standar;

public class Rombo implements Standar{
	private String name;
	private double lado;
	private double diag;
	private double diagmay;
	
	public Rombo(String name, double lado, double diag, double diagmay) {
		this.name = name;
		this.lado = lado;
		this.diag = diag;
		this.diagmay = diagmay;
	}//Constructor
	
	public double calcularArea() {
		return (getLado() *4);	
	}//calcularArea
	public double calcularPerimetro() {
		return (getDiag() * getDiagmay()/2);
	}// calcularPerimetro
		
	
	public double getDiag() {
		return diag;
	}

	public void setDiag(double diag) {
		this.diag = diag;
	}

	public double getDiagmay() {
		return diagmay;
	}

	public void setDiagmay(double diagmay) {
		this.diagmay = diagmay;
	}

	public String getName() {
		return name;
	}//getName
	public void setName(String name) {
		this.name = name;
	}//setName
	
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	@Override
	public String toString() {
		return "Rombo [name=" + name + ", diag=" + diag + ", diagmay=" + diagmay + ", lado=" + lado + "]";
	}//toString
}//class Triangulo