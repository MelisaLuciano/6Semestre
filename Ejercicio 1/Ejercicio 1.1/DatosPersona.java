import escom.poo.doscv2.Personas.Persona;
import javax.swing.JOptionPane;///Importacion del paquete que permite el uso de JoptionPane
   /**
     * Programa diseniado para pedir y mostrar los datos de una persona
     * con difernetes tipos de registros y sobrecarga de constryctores
     */
public class DatosPersona
{
	public static void main(String args[])
	{
		/**
		 * Variables que RECIBIRAN valores a traves de JOptionPane
		 */
		String name;
		String age;
		String ocupation;
		String gen;
		/**
		 *Variables SETEABLES con JOptionPane
		 */
		int resp;
		int i;
		 /**
          * Segmento que permite al usuario elegir si quiere realizar un registro simple(nombre y edad)
          * o si prefiere un registro mas detallado(nombre, edad, ocupacion y genero)
          */
		String[] options = {"Registro Simple", "Registro Avanzado"};
		int seleccion = JOptionPane.showOptionDialog(null, "Seleccione un tipo de registro", "REGISTRO", 
		JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,  options, options[0]);
		/**
		 * Verificacion de seleccion, seleccion de tipo de  registro a traves de un JOptionPane
		 * caso 0 registro simple
		 */
		if(seleccion==0)
		{
			resp = JOptionPane.showConfirmDialog(null, "Desea registrar a una persona?", "REGISTRO", JOptionPane.YES_NO_OPTION);
			/**
			 * Verificacion de proceso a realizar(Confirmacion)
			 * realizado a traves de JOptionPane
			 */
			if(resp==0)
			{
				name = JOptionPane.showInputDialog("Por favor introduzca su nombre");
				age = JOptionPane.showInputDialog("Por favor introduzca su edad");
				int ag = Integer.parseInt(age);
				Persona p1 = new Persona(name, ag);
				System.out.println(p1.nombre + p1.edad);
			}
			else
			return;
		}
		/**
		 * Verificacion de seleccion, seleccion de tipo de  registro a traves de un JOptionPane
		 * caso 1 registro avanzado
		 */
		else if(seleccion==1)
		{
			Persona p[] = null; //Creacion de un array de objetos, registro multiple de personas
			p = new Persona [5];
			for(i=0; i<p.length;i++)
			{
				/**
				 * Confirmacion de registro nuevo, puede terminar el registro de personas
				 */
				resp = JOptionPane.showConfirmDialog(null, "Desea registrar a una persona?", "REGISTRO", JOptionPane.YES_NO_OPTION);
				if(resp==0)
				{
					/**
					 * Obtencion de datos a traves de JOptionPane
					 * asignacion de valores y conversion de datos para uso de metodos
					 */
					name = JOptionPane.showInputDialog("Por favor introduzca su nombre");
					age = JOptionPane.showInputDialog("Por favor introduzca su edad");
					ocupation = JOptionPane.showInputDialog("Por favor Introduzca su ocupacion");
					gen = JOptionPane.showInputDialog("Introduzca su genero");						
					int ed = Integer.parseInt(age);
					p[i] = new Persona(name, ed, ocupation, gen);
					System.out.println(p[i].nombre + p[i].edad + p[i].ocupacion + p[i].sexo);
				}
				else
				System.exit(0);//Termina el proceso si se desea detener el registro de personas
			}
		}
	}
}
