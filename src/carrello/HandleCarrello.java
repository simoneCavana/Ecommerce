package carrello;

import java.util.Vector;

import prodotto.Prodotto;

/**
 * @author Simone Cavana
 * @brief classe che implementa il manipolatore del Carrello che gestisce
 * gli articoli scelti dal cliente e da la possibilità di procedere all'acquisto. 
 */
public class HandleCarrello {
	
	/**
	 * @var carrello
	 * Vettore che contiene le istanze dei prodotti nel carrello.
	 */	
	private static Vector<Prodotto> carrello = new Vector<Prodotto>();
	
	/**
	 * @brief Costruttutore private per evitare la creazione di un'istanza
	 */
	private HandleCarrello(){
		
	}
	
	/**
	 * @brief getter del numero di elementi nel Vector carrello  
	 * @return numero di elementi nel carrello
	 */
	public static int getCarrelloCount(){
		return carrello == null ? 0 : carrello.size();
	}
	
	/**
	 * @brief getter del prodotto nel carrello all'index
	 * @param index
	 * @return prodotto all'indice index
	 */
	public static Prodotto getProduct(int index){
		if(index < carrello.size()){
			return carrello.get(index);
		}
		return null;
	}
	
	/**
	 * raggruppare gli stessi prodotti in uno unico e inizializzare la quantità
	 * @brief
	 * @return
	 */
	public boolean checkProduct(){
		
		for(int i = 0; i < getCarrelloCount(); i++){
			
			//controllo di quanti prodotti dello stesso tipo sono presenti nel carrello
			//per settare la quantità
		}
		
		return true;
	}
	
	/**
	 * @brief aggiungere il prodotto passato come parametro al Vector carrello
	 * @param p
	 */
	public static void aggiungiProd(Prodotto p){
		System.out.println(p);
		carrello.addElement(p);
	}
	
	/**
	 * @brief eliminare il prodotto passato come parametro dal Vector carrello
	 * @param p
	 */
	public static void rimuoviProd(Prodotto p){
		System.out.println(p);
		carrello.removeElement(p);
	}
	
	/**
	 * @brief eliminare tutti gli elementi presenti nel Vector carrello
	 */
	public static void svuota(){
		carrello.removeAllElements();
	}

}
