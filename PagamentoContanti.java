
public class PagamentoContanti extends Pagamento {

	public PagamentoContanti(double importo) {
		super(importo);
		
	}
	
	public void dettagliPagamento() {
		
		System.out.println("I'importo del pagamento, in contanti, sarà di: " + getImporto() + "€");
	}
}
