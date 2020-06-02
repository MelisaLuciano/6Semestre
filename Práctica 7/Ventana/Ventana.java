import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
/**
 *
 * @author alumno
 */    
   /**
     * Programa que implementa la interfaz
     */
public class Ventana extends JFrame implements ActionListener{
		/**
		 * Variables
		 */
	Container contentpane;
	JButton boton1, boton2, boton3;
	
	Ventana(){
		setTitle("Ventana");
		setBounds(300,300,500,500);
		setVisible(true);
		contentpane = getContentPane();
		contentpane.setLayout(null);
		boton1 = new JButton(new ImageIcon("azul.png"));
		boton1.setRolloverIcon(new ImageIcon("azul2.png"));
		boton2 = new JButton(new ImageIcon("rojo.png"));
		boton2.setRolloverIcon(new ImageIcon("rojo2.png"));
		boton3 = new JButton(new ImageIcon("verde.png"));
		boton3.setRolloverIcon(new ImageIcon("verde2.png"));
		contentpane.setLayout(new GridLayout(2,2));
		boton1.setBorderPainted(false);
		boton2.setBorderPainted(false);
		boton3.setBorderPainted(false);
		contentpane.add(boton1);
		contentpane.add(boton2);
		contentpane.add(boton3);
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);




	}

	public static void main(String [] args){
		Ventana v = new Ventana();
	}

	@Override
	public void actionPerformed(ActionEvent e){

		Color color = null;

		if(e.getSource() == boton1){
			color = Color.blue;
			System.out.println("click en azul");
		}

		if(e.getSource() == boton2){
			color = Color.red;
			System.out.println("click en rojo");
		}
		if(e.getSource() == boton3){
			System.out.println("click en verde");
			color = Color.green;
		}

		contentpane.setBackground(color);
	}
}
