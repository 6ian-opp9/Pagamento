import java.util.Scanner;
public class TestPagamento {

	public static void main(String[] args) {
		
		
		PagamentoContanti contanti = new PagamentoContanti(100.00);
		
		PagamentoContanti contanti1 = new PagamentoContanti(50.00);
		
		PagamentoCartaDiCredito carta1 = new PagamentoCartaDiCredito("Edoardo Banfi", 05, 2023, "4321876556781234", 152.30, 100000, "45652");
		
		contanti.dettagliPagamento();

		contanti1.dettagliPagamento();
		
		carta1.dettagliPagamento();
		
		// inizio implementazione
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		
		boolean check = true;
		
		System.out.println(" ");
		
		System.out.print("Inserisci nome e congnome dell'intestatario: ");
		String generalita = s1.nextLine();
		
		System.out.print("inserisci il mese di scandeza della carta: ");
		int mese = s2.nextInt();
		
		if (mese < 0 || mese > 13) {
			
			System.out.println(" ");
			
			System.out.println("Non esiste il mese numero: " + mese);
			
			System.out.println(" ");
			
			System.out.print("Inserire un mese valido (1 - 12): ");
			mese = s2.nextInt();
		}
		
		System.out.print("inserisci l'anno di scandeza della carta: ");
		int anno = s2.nextInt();
		
		System.out.print("inserisci il numero della carta: ");
		String numero_carta = s1.nextLine();
		
		System.out.print("Inserisci il saldo sul conto: ");
		int saldo = s2.nextInt();
		
		System.out.print("Inserisci il pin della carta: ");
		String passcode = s3.nextLine();
		
		
		PagamentoCartaDiCredito carta = new PagamentoCartaDiCredito(generalita, mese, anno, numero_carta, 0, saldo, passcode);
		
		System.out.println(" ");

		System.out.println("Digita 1 se vuoi prelevare; 2 se vuoi depositare o 3 per stampare dati carta.");
		int operazione = s1.nextInt();
		
		switch(operazione) {
		    
		case 1:
			
			System.out.print("Inserisci quanto vuoi prelevare: ");
			int prelievo = s2.nextInt();
			
			carta.setImporto(prelievo);
			
			if (prelievo > saldo) {
				System.out.println(" ");
				System.out.println("Il prelievo supera il saldo sul conto.");
				break;
			}
			
			System.out.println(" ");
			
            System.out.println("Attenzione, se si sbaglia il pin 5 volte la carta verrà bloccata.");
            
            System.out.println(" ");
            
			for (int i = 0; i < 6; i++) {
				
				if (i == 5) {
					System.out.println(" ");
					System.out.println("Troppi tentativi, carta bloccata.");
					break;
				}
				
				System.out.print("Inserisci pin: ");
				String codice = s3.nextLine();
				
				if (codice.equals(passcode)) {
					System.out.println(" ");
					System.out.println("Il conto, dopo aver prelevato, contiene: " + carta.Fai_Prelievo(prelievo) + "€."); 
					break;
				}
				else if (i < 4){
					System.out.println("Riprova");
				}
			}
		break;	
		
		case 2: 
			
			System.out.println("Inserisci quanto vuoi depositare: ");
			int deposito = s2.nextInt();
			
			System.out.println(" ");
			
            System.out.println("Attenzione, se si sbaglia il pin 5 volte la carta verrà bloccata.");
            
            System.out.println(" ");
            
			for (int i = 0; i < 6; i++) {
				
				if (i == 5) {
					System.out.println(" ");
					System.out.println("Troppi tentativi, carta bloccata.");
					break;
				}
				
				System.out.print("Inserisci pin: ");
				String codice = s3.nextLine();
				
				if (codice.equals(passcode)) {
					System.out.println(" ");
					System.out.println("Il conto, dopo aver depositato, contiene: " + carta.Fai_Deposito(deposito) + "€.");
					break;
				}
				else if (i < 4){
					System.out.println("Riprova");
				}
			}
		 break;	
		 
		 case 3:
			 
			 System.out.println(" ");
			 
			 carta.dettagliPagamento();
			 
		 break;
			
		 default:
			
			 System.out.println(" ");
			 System.out.println("Selezione sbagliata.");
			 break;
			 
		}
		
	}

}
