package sef.module3.sample;
import java.util.Scanner;

public class SwitchExemplo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int number = input.nextInt();
		
		switch (number) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		default:
			System.out.println("Número digitado não é 10, 20 ou 30");
			break;
		}
		
		input.close();
	}
}
