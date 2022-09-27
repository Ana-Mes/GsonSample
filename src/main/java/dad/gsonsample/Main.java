package dad.gsonsample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		Persona p = new Persona();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca su nombre:");
		String nombre = scanner.nextLine();
		p.setNombre(nombre);
		System.out.println("Introduzca sus Apellidos:");
		String apellidos = scanner.nextLine();
		p.setApellidos(apellidos);
		System.out.println("Introduzca su edad:");
		int edad = scanner.nextInt();
		p.setEdad(edad);

		scanner.close();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}
}
