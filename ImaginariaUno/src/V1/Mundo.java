package V1;

public class Mundo {
public static void main(String[] args) {
	Fuente fuente=new Fuente(10);
	fuente.start();
	Seres humano=new Seres(fuente,"Luis");
	humano.setVida(3);
	humano.start();
	Seres humanoDos=new Seres(fuente,"Arturo");
	humanoDos.setVida(3);
	humanoDos.start();
	System.out.println("vida despues de la muerte "+fuente.getVida());
}
}