public class AppEncendedor{
	public static void main (String [] args){

		Encendedor e = new Encendedor();
		
		boolean encendiendo;
		encendiendo = e.encender();

		int contenidoe;
		contenidoe = e.contiene();

		while(contenidoe > 0){

			int apagare;
			apagare = e.apagar();
		}
		
	}
}