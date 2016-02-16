package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {
	
	private Porto porto;
	
	public Gioco(Porto p){
		this.porto = p;
	}
	
	public void attacco(Invasore invasori[]){
		for(Invasore inv: invasori){
			int potenzaDiFuoco=inv.potenzaFuoco();
			porto.addMetriQuadriDistrutti(potenzaDiFuoco * 2.5);
		}
	}
	
	public boolean portoDistrutto(){
		return porto.getDimensioneSqMetersNonDistrutta() <= 0;
	}
}
