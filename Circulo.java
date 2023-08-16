package sef.module4.activity;

import javax.swing.JOptionPane;

public class Circulo {

	private float raio;
	private float area;
	private float perimetro;
	
    public void calcularArea() {
        area = (float) (raio * raio * 3.14);
        JOptionPane.showMessageDialog(null, "Área do círculo: " + area);
    }

    public void calcularPerimetro() {
        perimetro = (float) (2 * 3.14 * raio);
        JOptionPane.showMessageDialog(null, "Perímetro do círculo: " + perimetro);
    }
	
	public static void main(String[] args) {
		
		Circulo novoCirculo = new Circulo();
        novoCirculo.raio = 10;
        novoCirculo.calcularArea();
        novoCirculo.calcularPerimetro();

        novoCirculo.raio = 4;
        novoCirculo.calcularArea();
        novoCirculo.calcularPerimetro();

        // Outras instâncias de Circulo
        Circulo circulo2 = new Circulo();
        circulo2.raio = 7;
        circulo2.calcularArea();
        circulo2.calcularPerimetro();

        Circulo circulo3 = new Circulo();
        circulo3.raio = 15;
        circulo3.calcularArea();
        circulo3.calcularPerimetro();

        Circulo circulo4 = new Circulo();
        circulo4.raio = 5;
        circulo4.calcularArea();
        circulo4.calcularPerimetro();

        Circulo circulo5 = new Circulo();
        circulo5.raio = 12;
        circulo5.calcularArea();
        circulo5.calcularPerimetro();
	}

}
