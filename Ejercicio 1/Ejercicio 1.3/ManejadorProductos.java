import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;

public class ManejadorProductos{

	 private ArrayList<Producto> productos = new ArrayList<Producto>();

	 public boolean agregar (Producto prod){
	 	productos.add(prod);
	 	return true;
	 }

	 public Producto eliminar(int posicion){
	 	Producto aux = new Producto();
	 	aux = productos.get(posicion);
	 	productos.remove(posicion);
	 	return aux;
	 }

	 public Producto modificar(int posicion){
	 	Producto aux1 = new Producto();
	 	aux1 = productos.get(posicion);
	 	return aux1;
	 }

	 public boolean buscar(String nombre){
	 	boolean p = productos.contains(nombre);
	 	return p;
	 }

	 public int longitudArreglo(){
	 	return productos.size();
	 }

	 public Producto regresar (int posicion){
	 	Producto pr = new Producto();
	 	pr = productos.get(posicion);
	 	return pr;
	 }
		 
	public ArrayList getListaOb(){
	 	return this.productos;
	 }
	 
	 /*public void ordenar(ArrayList array){
	 	Collection.sort(array);

	 }*/
	
}