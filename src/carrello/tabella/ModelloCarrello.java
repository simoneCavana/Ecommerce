package carrello.tabella;

import javax.swing.table.AbstractTableModel;

import carrello.HandleCarrello;

import prodotto.Prod3x2;
import prodotto.Prodotto;
import prodotto.tabella.ModelloProdotto;

/**
 * @author Simone Cavana
 * @brief classe che implementa il modello della tabella presente nel 
 * pannello carrello, del tutto simile a quella presente negli altri 
 * pannelli ma prende i dati dall'array di carrello. 
 */
public class ModelloCarrello extends AbstractTableModel{

	/**
	 * @var ColName
	 * array di stringhe nel quale ogni elemento rappresenta l'intestazioni di una colonna.
	 */
	private String[] ColName = {"Nome","Marca","Categoria","Prezzo","Quantità","Immagine","Offerta"};
	
	/**
	 * @var NAME_COL
	 * Indice della colonna contenente il nome dei prodotti
	 */
	public static final int NOME_COL = 0;
	
	/**
	 * @var BRAND_COL
	 * Indice della colonna contenente la marca dei prodotti
	 */
	public static final int MARCA_COL = 1;
	
	/**
	 * @var CATEGORY_COL
	 * Indice della colonna contenente la categoria dei prodotti
	 */
	public static final int CAT_COL = 2;
	
	/**
	 * @var PRICE_COL
	 * Indice della colonna contenente il prezzo dei prodotti
	 */
	public static final int PRZ_COL = 3;
	
	/**
	 * @var QUAN_COL
	 * Indice della colonna contenente la quantità dei prodotti
	 */
	public static final int QUAN_COL = 4;
	
	/**
	 * @var IMG_COL
	 * Indice della colonna contenente le immagini dei prodotti
	 */
	public static final int IMG_COL = 5;
	
	/**
	 * @var OFFER_COL
	 * Indice della colonna contenente le offerte dei prodotti 
	 */
	public static final int OFFER_COL = 6;
	
	/**
	 * @brief costruttore
	 */
	public ModelloCarrello() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @brief Implementazione del metodo di {@link AbstractTableModel}
	 * @return Numero di righe della tabella
	 */
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return HandleCarrello.getCarrelloCount();
	}
	
	/**
	 * @brief Implementazione del metodo di {@link AbstractTableModel}
	 * @return Numero di colonne della tabella
	 */
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return ColName.length;
	}
	
	/**
	 * @brief Serve a recuperare il nome della colonna con indice col
	 * @param col
	 * @return nome della colonna passata come parametro
	 */
	public String getColumnName(int col) {
	    return ColName[col];
	}
	
	/**
	 * @brief Implementazione del metodo di {@link AbstractTableModel}
	 * @param riga Indice della riga
	 * @param col Indice della colonna
	 * @return Ritorna l'oggetto contenuto in una cella della tabella
	 */
	@Override
	public Object getValueAt(int riga, int col) {
		// TODO Auto-generated method stub
		Prodotto p = HandleCarrello.getProductAt(riga);
		
		if(p != null){
			switch (col){	
				case NOME_COL:
					return p.getNome();
					
				case MARCA_COL:
					return p.getMarca();
					
				case CAT_COL:
					return p.getCategoria();
					
				case PRZ_COL:
					return "€ " + String.format("%.2f", p.getPrezzo());
				
				case QUAN_COL:
					return HandleCarrello.getQcarrelloAt(riga);		
				
				case IMG_COL:
					//caricare l'immagine se il path è settato altrimenti niente
					return null;
				
				case OFFER_COL:
					if(p instanceof Prod3x2){
						return "3x2";
					}
					else if(p.getSconto() > 0){
						return Integer.toString(p.getSconto()) + "%";
					}
					return "";
			}
		}
		
		return "";
	}

}
