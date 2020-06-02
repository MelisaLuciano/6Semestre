import java.util.Scanner;
public class Principal
{
	public static void main(String args[]){
		Jardin gar = new Jardin();
		Planta pla = new Planta();
		Jardinero jar = new Jardinero();
		Maceta ma = new Maceta();
		
		//pla.estado=false;
		System.out.println("Seleccione la accion a realizar... \n 1.-Plantar \n 2.-Cuidar Planta \n 3.-Cambiar maceta\n\n");
		int n;
		Scanner lectura = new Scanner(System.in);
		n = lectura.nextInt();
	
		switch (n)
		{
		case 1:
		if(ma.Estado==false && jar.disp==true)
		jar.sembrarPlanta();
		gar.RecibirPlanta(ma);
		break;
		
		case 2:
		if(pla.estado==true && jar.disp==true){
		jar.regarPlanta();
		jar.abonarPlanta();
		pla.florecer();}
		else if(pla.estado==false && jar.disp==true){
		pla.morir();
		}
		break;
		
		case 3:
		Maceta m2 = new Maceta();
		m2.numMac=2;
		if(m2.Estado==false && jar.disp==true)
		jar.cambiarMaceta(ma);
		gar.RecibirPlanta(m2);
		break;
	}
}
}