package controlador;

import java.io.IOException;
import java.util.Scanner;

import servicios.MenuInterfaz;
/**
 * Implementacion del los metodos del menu
 * @author nrojlla 071024
 */
public class MenuImplementacion implements MenuInterfaz {
	Scanner sc = new Scanner(System.in);
	@Override
	public byte MostrarMenuPrincipal() throws IOException{

		System.out.println("------------------");
		System.out.println("--MENU PRINCIPAL--");
		System.out.println("0.Cerrar sesion");
		System.out.println("1.Agregar venta");
		System.out.println("2.Agregar gasto");
		System.out.println("3.Mostrar total");
		System.out.println("------------------");
		
		byte opcionSeleccionada = sc.nextByte();
		
		return opcionSeleccionada;
	}

}
