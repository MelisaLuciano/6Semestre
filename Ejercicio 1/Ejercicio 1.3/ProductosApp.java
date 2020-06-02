import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;

public class ProductosApp{

	public static void main (String [] args)throws IOException{
 	
 	ArrayList<Producto> produ = new ArrayList<>();

	Producto prod = new Producto();
	Producto prod1 = new Producto();
	Producto prod2 = new Producto();
	Producto prod3 =  new Producto();

	ManejadorProductos manP = new ManejadorProductos();
	boolean agre;
	int delDo = 1;

	JOptionPane.showMessageDialog(null, "Bienvenido al ProductosApp ");
	String nombreProd = JOptionPane.showInputDialog("Ingrese el nombre del producto");
	String precioDelProducto = JOptionPane.showInputDialog("Ingrese el precio del producto: ");
	int precioProd = Integer.parseInt(precioDelProducto);
	String descripcionPro = JOptionPane.showInputDialog("Ingrese descripcion del producto");
	prod.setNombre(nombreProd);
	prod.setPrecio(precioProd);
	prod.setDesc(descripcionPro);

	manP.agregar(prod);
	JOptionPane.showMessageDialog(null, "Se ha agregado el producto");
	int opc;
	String opcion;

do{


	opcion = JOptionPane.showInputDialog("Que desea hacer?\n" +
														"Elija el numero de la opcion deseada\n" +
														"1.- Agregar el mismo tipo de producto\n" +
														"2.- Crear y agregar nuevo producto\n" +
														"3.- Buscar producto\n" +
														"4.- Ordenar\n" + 
														"5.- Borrar\n");
	opc = Integer.parseInt(opcion);
	switch (opc){

		case 1: 
			String productoRepetido = JOptionPane.showInputDialog("Cuantos objetos quiere agregar?");
			int productoRep = Integer.parseInt(productoRepetido);

			boolean pr = false;
			for(int j = manP.longitudArreglo(); j < manP.longitudArreglo() + productoRep; j++){
				pr = manP.agregar(prod);
				System.out.println (pr);
			}
			if(pr = true){
			JOptionPane.showMessageDialog(null, "Se agrego correctamente :D");
			System.out.println (manP.longitudArreglo());
			
			}else if(pr = false){
				JOptionPane.showMessageDialog(null, "Esta feo :(");
			}
			break;

		case 2:
			nombreProd = JOptionPane.showInputDialog("Ingrese el nombre del producto");
			precioDelProducto = JOptionPane.showInputDialog("Ingrese el precio del producto: ");
			precioProd = Integer.parseInt(precioDelProducto);
			descripcionPro = JOptionPane.showInputDialog("Ingrese descripcion del producto");
			prod.setNombre(nombreProd);
			prod.setPrecio(precioProd);
			prod.setDesc(descripcionPro);
			manP.agregar(prod);

			delDo = 1;
			break;
		case 3:
			String nombreProdd = JOptionPane.showInputDialog("Ingrese el nombre del producto a buscar");
			boolean buscado = manP.buscar(nombreProdd);
			if (buscado = true){
				JOptionPane.showMessageDialog(null, "El producto que busca si está");
			}else{
				JOptionPane.showMessageDialog(null, "No existe");
			}

			delDo = 1;
			break;

		case 4:
			int longitud = manP.longitudArreglo();
			for(int i = 0; i < longitud; i++){
				prod2 = manP.regresar(i);
				produ.add(prod2);
			}
			Collections.sort(produ);

			//manP.ordenar(produ);
			String melis;
			for(int i = 0; i < produ.size(); i++){
				prod3 = manP.regresar(i);
				melis = prod3.getNombre();
				JOptionPane.showMessageDialog(null, melis);
			}
			delDo = 1;
			break;

		case 5:

			String borrado = JOptionPane.showInputDialog("Cual es la posicion del elemento que va a borrar");
			int borr = Integer.parseInt(borrado);
			prod3 = manP.eliminar(borr);
			String nom = prod3.getNombre();
			JOptionPane.showMessageDialog(null, "El producto que se borro fue: " + nom);	
			break; 
		default:
			delDo = 0;
			break;

	}
}while(delDo == 1);
	/*agre = manP.agregar(prod);
	System.out.println (agre);
	agre = manP.agregar(prod1);
	System.out.println (agre);

	int longitud = manP.longitudArreglo();
	for(int i = 0; i < longitud; i++){
		prod2 = manP.regresar(i);
		produ.add(prod2);
	}

	//produ = manP.productos;


 	Collections.sort(produ);

 	prod2 = produ.get(0);
 	prod3 = produ.get(1);

 	System.out.println(prod2.getNombre() + "---" + prod3.getNombre());   */
	}
}