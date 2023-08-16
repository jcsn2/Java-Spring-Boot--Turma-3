package sef.module4.activity;

import javax.swing.JOptionPane;

public class Retangulo {

	private float lado1;
	private float lado2;
	private float area;
	private float perimetro;
	
    public void calcularArea() {
        area = lado1 * lado2;
        JOptionPane.showMessageDialog(null, "Área do retângulo: " + area);
    }

    public void calcularPerimetro() {
        perimetro = 2 * (lado1 + lado2);
        JOptionPane.showMessageDialog(null, "Perímetro do retângulo: " + perimetro);
    }
	
	public static void main(String[] args) {
		
		// Instacindo novoRetangulo
		Retangulo novoRetangulo = new Retangulo();
        novoRetangulo.lado1 = 10;
        novoRetangulo.lado2 = 5;
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();

        novoRetangulo.lado2 = 7;
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
        
        // Outras instâncias de Retangulo
        Retangulo retangulo2 = new Retangulo();
        retangulo2.lado1 = 8;
        retangulo2.lado2 = 3;
        retangulo2.calcularArea();
        retangulo2.calcularPerimetro();

        Retangulo retangulo3 = new Retangulo();
        retangulo3.lado1 = 15;
        retangulo3.lado2 = 10;
        retangulo3.calcularArea();
        retangulo3.calcularPerimetro();

        Retangulo retangulo4 = new Retangulo();
        retangulo4.lado1 = 5;
        retangulo4.lado2 = 5;
        retangulo4.calcularArea();
        retangulo4.calcularPerimetro();

        Retangulo retangulo5 = new Retangulo();
        retangulo5.lado1 = 12;
        retangulo5.lado2 = 6;
        retangulo5.calcularArea();
        retangulo5.calcularPerimetro();
	}

}
