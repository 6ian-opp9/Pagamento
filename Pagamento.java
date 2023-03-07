
public class Pagamento {
	
	private double importo; //Importo pagamento
	
	public Pagamento(double importo) {
		
		this.importo = importo;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}
	
	/*
	 * =======================================================================================================================
	 */
	
	public void dettagliPagamento() {
		
		System.out.println("I'importo del pagamento sarà di: " + importo + "€");
	}
}
