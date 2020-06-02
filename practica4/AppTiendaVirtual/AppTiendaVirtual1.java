import javax.swing.*; ///Importacion de los paquetes que permite el uso de JoptionPane
import java.util.ArrayList;
import ipn.escom.poo.catalogo.*;
import ipn.escom.poo.auxiliares.*;
import ipn.escom.poo.activoFijo.*;

public class AppTiendaVirtual1{

	public static void main (String[]args){
		/**
		 * Arraylist para hacer una lista de los productos que recibira del usuario
		 */
	ArrayList<Producto>  listaProdu = new ArrayList<Producto>();

	Producto libreta = new Producto(1, 13.5f, "cuadros", 80, "Papeleria");
	Producto vaso = new Producto(2, 7.8f, "Vaso de vidrio fino", 100, "Vidrieria");
	Producto pijama = new Producto(3, 208.75f, "Pijama de algodon suave para hombre", 4, "Ropa para dormir");
	Producto galletas = new Producto(4, 43.56f, "Ricas galletas :D", 22, "Abarrotes");
	Producto lechera = new Producto(5, 50.32f, "Rica leche..", 1, "Abarrotes");
	Producto chanclas = new Producto(6, 42.10f, "Muy comodas y de moda", 80, "Papeleria");
	Producto pasta_dental = new Producto(7, 24.33f, "Colgate", 39, "Higiene personal");
	Producto comida_Gatos = new Producto(8, 100.49f, "Purina cat-chow", 10, "Mascotas");
	Producto jugo = new Producto(9, 80.99f, "Jugo natural de la india", 29, "Abarrotes");
	Producto x_box = new Producto(10, 10982.89f, "El mejor aparato del mundo :3", 10, "Videojuegos");

	listaProdu.add(libreta); 
	listaProdu.add(vaso); 
	listaProdu.add(pijama); 
	listaProdu.add(galletas); 
	listaProdu.add(lechera); 
	listaProdu.add(chanclas); 
	listaProdu.add(pasta_dental); 
	listaProdu.add(comida_Gatos); 
	listaProdu.add(jugo); 
	listaProdu.add(x_box); 

	ArrayList<CarritoCompra> carritos = new ArrayList<CarritoCompra>();

	CarritoCompra carritocompra1 = new CarritoCompra();
	CarritoCompra carritocompra2 = new CarritoCompra();
	CarritoCompra carritocompra3 = new CarritoCompra();
	CarritoCompra carritocompra4 = new CarritoCompra();
	CarritoCompra carritocompra5 = new CarritoCompra();

	carritos.add(carritocompra1);
	carritos.add(carritocompra2);
	carritos.add(carritocompra3);
	carritos.add(carritocompra4);
	carritos.add(carritocompra5);

	boolean flag = true;
		do{
				String opcion = JOptionPane.showInputDialog("Bienvenido a su tienda virtual :D\n" +
															"Elija el numero de la opcion deseada\n" +
															"1.- Tomar un carrito\n" +
															"2.- Agregar a mi carrito\n" +
															"3.- Modificar mi carrito\n" +
															"4.- Borrar producto de mi carrito\n" +
															"5.- Borrar mi carrito\n" +
															"6.- Confimar mi compra\n" +
															"7.- Salir :c");
				int opcionUsuario = Integer.parseInt(opcion);

				int cont = 0;
				switch(opcionUsuario){
					case 1:
						cont ++;
						if (cont > 0){
							JOptionPane.showMessageDialog(null, "Ya tiene un carrito");
						}
						JOptionPane.showMessageDialog(null, "Ha tomado un carrito :o!");
						
						break;

					case 2:

						String idItem = JOptionPane.showInputDialog("Ingresa el ID del producto que desea agregar al carrito");
						int opcion2 = Integer.parseInt(idItem);

						Item np = new Item(0, 0);
						Producto comp;
						int guardaID, stock, h = 0;
						boolean ban = true;
						boolean auxcomp = false;
						boolean pw = true;
						auxcomp = (carritos.get(0)).comprobarId(opcion2);

						while(ban == true){
						 	comp = listaProdu.get(h);
						 	guardaID = comp.getIdProdu();
						 	stock = comp.getCant();	
						 	if (guardaID == opcion2 && auxcomp == false) {
						 		do{
						 			String cantItem = JOptionPane.showInputDialog("Ingresa la cantidad de productos que quieres");
									int opcion3 = Integer.parseInt(cantItem);

									if (opcion3 > stock) {
										JOptionPane.showMessageDialog(null, "No hay tantas unidades disponibles de ese producto");	
									} else if(opcion3 <= stock){
							 			np.setId(opcion2);
							 			np.setCantidad(opcion3);
							 			(carritos.get(0)).agregarProducto(np.getIdProdu(), np.getCantidad());
							 			JOptionPane.showMessageDialog(null, "Se agrego el producto :D");
							 			ban = false;
							 			pw = false;
						 			}
						 		}while(pw != false);
						 	} else if (listaProdu.size() == (h + 1) && auxcomp == true) {
						 		JOptionPane.showMessageDialog(null, "El producto ya esta en su carrito :(");
						 		ban = false;
						 	}
							h++;
						}
					break;

					case 3:
						String idItemM = JOptionPane.showInputDialog("Ingresa el ID del producto que desea modificar del carrito");
						int modiItem = Integer.parseInt(idItemM);
						auxcomp = (carritos.get(0)).comprobarId(modiItem);
						
						if (auxcomp == true) {	
							String cantidadNueva = JOptionPane.showInputDialog("Ingresa la nueva cantidad");
							int canti = Integer.parseInt(cantidadNueva);
							(carritos.get(0)).modificarCompra(modiItem, canti);	
						}else{
							JOptionPane.showMessageDialog(null, "El producto no esta en su carrito :(");
						}
					break;

					case 4:
						boolean carritoV = (carritos.get(0)).carritoVacio();
						if (carritoV != true) {
					
							String idItemB = JOptionPane.showInputDialog("Ingresa el ID del producto que desea borrar del carrito");
							int BorrItem = Integer.parseInt(idItemB);
							auxcomp = (carritos.get(0)).comprobarId(BorrItem);
							
							Item prodB = new Item();

							if (auxcomp == true && carritoV == false) {
								prodB = (carritos.get(0)).borrarProducto(BorrItem);
								JOptionPane.showMessageDialog(null, "El producto con el ID " + prodB.getIdProdu() + " ha sido eliminado" );
							}else if(auxcomp == false){
								JOptionPane.showMessageDialog(null, "El producto no esta en su carrito :(");
							}
						}else{
							JOptionPane.showMessageDialog(null, "El carrito esta vacio, no puede borrar nada :(");	
						}
					break;

					case 5:

						boolean vacioCarrito = (carritos.get(0)).carritoVacio();
						boolean carritoBorrado;
						
						if (vacioCarrito == true) {
							JOptionPane.showMessageDialog(null, "Su carrito ya esta vacio XD");	
						} else{
							carritoBorrado = (carritos.get(0)).vaciarCarrito();
							JOptionPane.showMessageDialog(null, "Borro su carrito :v");
						}
					break;

					case 6:
						Item guardarProdu = new Item();
						Producto productoF = new Producto();
						ArrayList<Integer> id = new ArrayList<Integer>();
						ArrayList<Integer> ca = new ArrayList<Integer>();
						ArrayList<Float> precio = new ArrayList<Float>();
						ArrayList<Float> precioTotal = new ArrayList<Float>();

						int tam = (carritos.get(0)).carritoTam();

						int idF, cantF;
						float precioF, precioTotalProductoF;
						float totalPagar = 0;
						boolean auxs = true;

						for (int i = 0; i < tam; i++) {
							guardarProdu = (carritos.get(0)).ela(i);
							idF = guardarProdu.getIdProdu();
							cantF = guardarProdu.getCantidad();

							id.add(idF);
							ca.add(cantF);

							for (int j = 0; j < listaProdu.size(); j++) {
								productoF = listaProdu.get(j);
								if (idF == productoF.getIdProdu()) {
									precioF = productoF.getPrec();
									precio.add(precioF);
									precioTotalProductoF = precioF * cantF;
									precioTotal.add(precioTotalProductoF);
									totalPagar = precioTotalProductoF + totalPagar;
								}

							}
						}
						for (int z = 0; z < id.size(); z++) {
							JOptionPane.showMessageDialog(null, "Ticket de compra\n" +
																"  ID  |  Cantidad de productos  |  Precio por unidad  |  Precio total por poductos  \n" +
																"  " + id.get(z) + "  " + "                         " + ca.get(z) + "  " + "                             " + precio.get(z) + "  " + "                                             " + precioTotal.get(z) + "  \n");
						}

						JOptionPane.showMessageDialog(null, "Ticket de compra\n" +
															"Total a pagar: $" + totalPagar);

						carritoBorrado = carritocompra1.vaciarCarrito();
						
						if (carritoBorrado == true) {
							JOptionPane.showMessageDialog(null, "Gracias por su compra, su carrito se ha borrado :v");	
						}
					break;	

					case 7:
						System.exit(0);
					break;

					default:
						JOptionPane.showMessageDialog(null, "La opcion no es valida\n\n ");

						break;
				}
			} while(flag != false);

	}	

}

	