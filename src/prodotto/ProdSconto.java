package prodotto;

public class ProdSconto extends Prodotto{

	/**
	 * @var sconto
	 * variabile intera fra 0 e 100 rappresentante lo sconto da
	 * applicare su un prodotto.
	 */
	private int sconto;
	
	/**
	 * 
	 * @param id
	 * @param nome
	 * @param marca
	 * @param categoria
	 * @param prezzo
	 * @param photoPath
	 * @param sconto
	 */
	public ProdSconto(int id, String nome, String marca, String categoria,
			float prezzo, String photoPath, int sconto) {
		
		super(id, nome, marca, categoria, prezzo, photoPath);
		// TODO Auto-generated constructor stub
		
		this.setPrezzo(applicaSconto(sconto));
	}
	
	/**
	 * @brief ritorna il valore attuale dello sconto.
	 */
	public int getSconto() {
		return sconto;
	}
	
	/**
	 * @brief setter dello sconto controllando che sia valido, ovvero che
	 * sia maggiore di zero e minore di cento, altrimento lo setta a zero. 
	 * @param sconto
	 */
	public void setSconto(int sconto) {
		if (sconto < 0)
			sconto = 0;
		else if(sconto > 100)
			sconto = 100;
			
		this.sconto = sconto;
	}
	
	/**
	 * @brief calcola il valore del nuovo prezzo dopo avergli applicato lo sconto.
	 * @param s
	 * @return nuovo prezzo scontato
	 */
	public float applicaSconto(int s){
		float p = this.getPrezzo(); 
		p -= super.getPrezzo() * s / 100;
		return p;
	}
}
