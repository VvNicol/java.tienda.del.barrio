package servicios;

import java.io.IOException;
/**
 * Lista de metodos de la operativa
 * @author nrojlla 071024
 */
public interface OperativaInterfaz {

	/**
	 * Agregar Venta
	 * @return double
	 * @throws IOException
	 * @author nrojlla 071024
	 */
	double AgregarVenta() throws IOException;
	/**
	 * Agregar Gasto
	 * @return double
	 * @throws IOException
	 * @author nrojlla 071024
	 */
	double AgregarGasto() throws IOException;

}
