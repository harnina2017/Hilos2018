public class Fuente extends Thread {

	// el alimento que produce
	private int alimento;
	// el intervalo de tiempo entre producciones
	private int intervalo = 0;

	public Fuente(int intervalo) {
		super();
		this.intervalo = intervalo;
	}

	

	public int getAlimento() {
		return alimento;
	}



	public void setAlimento(int alimento) {
		this.alimento = alimento;
	}



	public int getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}

	public int beber() {
		int retorno=0;
		if (alimento > 0) {
			alimento--;
			retorno=1;
		}
		return retorno;
	}
	
	@Override
	public void run() {
		super.run();
		while(true){
			try {
				sleep(intervalo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			alimento++;
		}
		
	}
}
