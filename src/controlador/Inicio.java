package controlador;

import java.io.File;
import java.io.FileWriter;

import servicios.MenuInterfaz;
import servicios.OperativaInterfaz;

/**
 * Aplicacion tienda del barrio menu 
 * @author nrojlla 072024
 */
public class Inicio {

	public static void main(String[] args) {
		
		String ficheroLog = "ficheroLog.txt";
		
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		
		double banca = 0.0;
		
		byte opcionSeleccionada = 0;
		boolean esCerrado = false;
		
		do {
			
			try {
				
				File logFile = new File(ficheroLog);
				
				if(!logFile.exists()) {
					logFile.createNewFile();
					}
	            FileWriter fw = new FileWriter(logFile, true);

				opcionSeleccionada = mi.MostrarMenuPrincipal();
			
			
			switch (opcionSeleccionada) {
			case 0:
				
				fw.write("Ha cerrado la sesion \n ");
				System.out.println("Ha seleccionado la opcion 0 - Cerrar sesion");
				System.out.println("-------------------------------------------");
				esCerrado = true;
				System.out.println("Ha cerrado la sesion");
				
				break;
			
			case 1:
				fw.write("1- agregar venta");
				System.out.println("Ha seleccionado la opcion 1 - Agregar venta");
				System.out.println("-------------------------------------------");
				banca += oi.AgregarVenta();
				
				break;
				
			case 2:
				fw.write("2- agregar gasto");
				System.out.println("Ha seleccionado la opcion 2 - Agregar gasto");
				System.out.println("-------------------------------------------");
				banca -= oi.AgregarGasto();
				
				if (banca == 0) {
					System.out.println("Has llegado a 0");
				}else if (banca < 0) {
					System.out.println("Debe dinero");
				}
				
				break;
				
			case 3: 
				fw.write("3- Total");

				System.out.println("Ha seleccionado la opcion 3 - Mostrar total");
				System.out.println("-------------------------------------------");
				System.out.println(String.valueOf(banca).replace(".", ","));				
				
				if (banca == 0) {
					System.out.println("Vamos mal " + String.valueOf(banca).replace(".", ","));
				}else if (banca < 0) {
					System.out.println("Vamos muy mal " + String.valueOf(banca).replace(".", ","));
				}
				
				break;
				
			default:
				fw.write("No disponible");

				System.out.println("Opción " + opcionSeleccionada + " no disponible");
				System.out.println("-------------------------------------------");
				break;
			}
			fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} while (!esCerrado);
		
	}

}
