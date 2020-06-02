import java.util.ArrayList;

public class CarritoCompra{

	private ArrayList<Item> items = new ArrayList<Item>();
    /**
     * M.A: Public 
     * Tipo: void
     * Metodo que funciona para agregar producto al carrito
     */
	public void agregarProducto(int idProd,int cant){
		Item item = new Item(idProd, cant);
		this.items.add(item);
	}

    /**
     * M.A: Public 
     * Tipo: boolean
     * Metodo que funciona para modificar la compra
     * Donde solo se solicita el idProd para buscarlo y solo 
     * cambiar el valor
     */
	public boolean modificarCompra(int idProd, int cantNue){
		Item itemMod = new Item();
		int idaux = 0;
		boolean flag = true;
		int i = 0;

		while(flag == true){
			itemMod = items.get(i);
			idaux = itemMod.getIdProdu();

			if(idProd == idaux){
				itemMod.setCantidad(cantNue);
				items.set(i, itemMod);
				flag = false;
				break;
			}
			i++;			
		}
		return true;
	}

    /**
     * M.A: Public 
     * Tipo: Item
     * Metodo que elimina el producto por medio del id que introduce 
     * el usuario 
     */
	public Item borrarProducto(int idProd){

		Item itemBorr = new Item();
		int idaux = 0;
		boolean flag = true;
		int i = 0;

		while(flag == true){
			itemBorr = items.get(i);
			idaux = itemBorr.getIdProdu();

			if(idProd == idaux){
				items.remove(i);
				flag = false;
				break;
			}
			i++;
		}
		return itemBorr;		
	}


    /**
     * M.A: Public 
     * Tipo: Item
     * Metodo que elimina los productos del carrito, vacía el carrito
     */
	public double calcularTotal(){
		return 0;
	}

    /**
     * M.A: Public 
     * Tipo: Item
     * Metodo que funciona para 
     */
	public boolean vaciarCarrito(){
		items.clear();
		return true;
	}

    /**
     * M.A: Public 
     * Tipo: Item
     * Metodo que elimina los productos del carrito, vacía el carrito
     */
	public void checkOut(){
		
	}

	public boolean comprobarId(int idUser){
		Item itemModd = new Item();
		int idaux = 0;
		boolean flag = true;
		boolean produSelec = false;
		int i = 0;

		while(flag == true){
			if(items.size() != 0){
				itemModd = items.get(i);
				idaux = itemModd.getIdProdu();

				if(idUser == idaux){
					produSelec = true;
					flag = false;
					break;
				}else if(i == (items.size() - 1)){
					produSelec = false;
					flag = false;
					break;
				}
			} else{
				produSelec = false;
				flag = false;
				break;
			}
			i++;			
		}
		return produSelec;
	}

	public boolean carritoVacio(){
		if(items.size() == 0){
			return true;
		} else{
			return false;
		}
	}

	public int carritoTam(){
		return this.items.size();
	}

	public Item ela(int posicion){
		return this.items.get(posicion);
	}
}