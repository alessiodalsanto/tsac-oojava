package main.harbour;

import java.io.Console;

import com.sun.javafx.scene.layout.region.Margins.Converter;

/**
 * ************* * DA COMPLETARE * ************* *
 */
public class Sottomarino extends Invasore {

	private int stazza;
	private int nArmamenti;

	public int getStazza() {
		return stazza;
	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

	public int getnArmamenti() {
		return nArmamenti;
	}

	public void setnArmamenti(int nArmamenti) {
		this.nArmamenti = nArmamenti;
	}

	public int potenzaFuoco() {
		double pFuoco = ((stazza * nArmamenti) * 0.25d);
		return (int) Math.round(pFuoco);
	}

}
