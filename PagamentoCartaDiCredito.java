
public class PagamentoCartaDiCredito extends Pagamento {
	
	private String nome; //nome sulla carta
	private int mese; //mede della data di scandenza
	private int anno; //anno della data di scandenza
	private String numero_carta; //numero carta di credito; 
	private int saldo; // saldo del conto
	private String pin; // pin della carta

	public PagamentoCartaDiCredito(String nome, int mese, int anno, String numero_carta, double importo, int saldo, String pin) {
		super(importo);
		
		this.nome = nome;
		this.mese = mese;
		this.anno = anno;
		this.numero_carta = numero_carta;
		this.saldo = saldo;
		this.pin = pin;
	}

	public String getNome() {
		return nome;
	}

	public int getMese() {
		return mese;
	}

	public int getAnno() {
		return anno;
	}

	public String getNumero_carta() {
		return numero_carta;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public String getPin() {
		return pin;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMese(int mese) {
		this.mese = mese;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public void setNumero_carta(String numero_carta) {
		this.numero_carta = numero_carta;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void setPint(String pin) {
		this.pin = pin;
	}
	
	/*
	 * =======================================================================================================================
	 */
	
	public void dettagliPagamento() {
		
		System.out.println("I'importo del pagamento, con carta di credito, sarà di: " + getImporto() + "€, il nome sulla carta è: " + nome
				+ ", l'anno di scadenza della carta è: " + anno + " ed il mese è: " + mese + ", il numero della carta è: " + numero_carta + ", con saldo: "
				+ saldo);
	
		//non stampo il pin essendo che è privato
	}
	
	public double Fai_Prelievo(double prelievo) {
		
		saldo -= prelievo;
		return saldo;	
	}
	
	public double Fai_Deposito(double deposito) {
		
		saldo += deposito;
		return saldo;
	} 
}
