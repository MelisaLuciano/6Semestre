//Se importa las clases de util, son todas las que contiene por el *
import java.util.*;

//la clase se declara publica porque se utilizará en la clase principal asignandole el nombre de Jardin
public class Jardin{
	
	//Este es uno de los atributos de la clase sin valor
    public int NumMacetas;

    //Aqui se declara un metodo el cual recibirá como parámetro un objeto de tipo Maceta 
    public void RecibirPlanta(Maceta m){
    	//m es el objeto de tipo maceta, utiliza el metodo llenar espacio 
        m.LlenarEspacio();
        //Se imprime el atributo de la maceta del objeto m
		System.out.println("La maceta "  + m.numMac + " esta ocupada");
    }

    
}
