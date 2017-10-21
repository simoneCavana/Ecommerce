package pannelli;

import java.awt.Color;
import java.awt.event.ActionEvent;

public class Carrello extends DefaultPanel {
	
	/**
	 * @var TAG
	 * Tag univoco utilizzato per identificare questa schermata
	 */
	public static final String TAG = "carrello";
	
	/**
	 * @brief costruttore
	 * @param handlePanel
	 * Costruttore che definisce e setta tutti gli oggetti della finestra.
	 */
	public Carrello(HandlePanel handlePanel) {
		
		super(handlePanel);
		setBackground(Color.magenta);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){ 
		
	}		

}
