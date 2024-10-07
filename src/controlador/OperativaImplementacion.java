package controlador;

import java.io.IOException;
import java.util.Scanner;

import servicios.OperativaInterfaz;

/**
 * Logica de los metodos de la operativa
 * @author nrojlla 071024
 */
public class OperativaImplementacion implements OperativaInterfaz {
	Scanner sc = new Scanner(System.in);

	@Override
	public double AgregarVenta() throws IOException {
		System.out.println("Ingrese venta");
		double venta = sc.nextDouble();
		
		return venta;
	}

	@Override
	public double AgregarGasto() throws IOException {
		System.out.println("Ingrese gasto");
		double gasto = sc.nextDouble();

		return gasto;		
	}

}
