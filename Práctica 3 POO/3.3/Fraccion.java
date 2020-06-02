import java.lang.Math;

public class Fraccion{
	private int numerador;
	private int denominador;

	public Fraccion(){
		numerador = 0;
		denominador = 1;
	}

	public Fraccion(int x, int y){
		numerador = x;
		denominador = y;
	}

	public int getNumerador(){
		return this.numerador;
	}

	public int getDenominador(){
		return this.denominador;
	}

	public Fraccion sumar(Fraccion a, Fraccion b){
		Fraccion c = new Fraccion();
     	c.numerador = a.numerador * b.denominador + b.numerador * a.denominador;
     	c.denominador = a.denominador * b.denominador;
     	return c;
	}

	public Fraccion restar(Fraccion a, Fraccion b){
		Fraccion c = new Fraccion();
     	c.numerador = a.numerador * b.denominador - b.numerador * a.denominador;
     	c.denominador = a.denominador * b.denominador;
     	return c;
	}

	public Fraccion multiplicar(Fraccion a, Fraccion b){
		Fraccion c = new Fraccion();
     	c.numerador = a.numerador * b.numerador;
     	c.denominador = a.denominador * b.denominador;
     	return c;
	}

	public Fraccion dividir(Fraccion a, Fraccion b){
		return new Fraccion(a.numerador * b.denominador, a.denominador * b.numerador);
	}

	private int mcd(){
     	int u = Math.abs(numerador);
     	int v = Math.abs(denominador);
     	if(v == 0){
        	return u;
     	}
     	int r;
     	while(v != 0){
          	r = u % v;
          	u = v;
          	v = r;
     	}
     	return u;
  	}

  	public Fraccion simplificar(){
     	int dividir = mcd();
     	numerador /= dividir;
     	denominador /= dividir;
     	return this;
  	}

}