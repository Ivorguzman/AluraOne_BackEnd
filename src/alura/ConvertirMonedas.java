package alura;

import javax.swing.JOptionPane;


public class ConvertirMonedas {

	private double monedaDolar;
	private double monedaBolivar;
	private double monedaPeso;



	public void convertirPesosDolar(double monedaPeso) {
		this.monedaPeso = monedaPeso / 3900;
		this.monedaPeso = (double) Math.round(this.monedaPeso * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes ==> " + this.monedaPeso + " Dolares ($)");
	}

	public void convertirDolarPesos(double monedaDolar) {
		this.monedaDolar = monedaDolar * 4009;
		this.monedaDolar = (double) Math.round(this.monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes ==> " + this.monedaDolar + " Pesos (COP)");
	}



	public void convertirPesosBolivar(double monedaPeso) {
		this.monedaBolivar = monedaPeso / 123;
		this.monedaBolivar = (double) Math.round(this.monedaBolivar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes ==>  " + this.monedaBolivar + " Bolivares (BSF) Devaluados");
	}

	public void convertirBolivarPeso(double monedaBolivar) {
		this.monedaBolivar = monedaBolivar * 109;
		this.monedaBolivar = (double) Math.round(this.monedaBolivar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes ==>  " + this.monedaBolivar + " Pesos (COP) Devaluados");
	}

	public void convertirBolivarDolar(double monedaBolivar) {
		this.monedaBolivar = monedaBolivar / 33.36;
		this.monedaBolivar = (double) Math.round(this.monedaBolivar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes ==>  " + this.monedaBolivar + " Dolares ($) Devaluados");
	}

	public void convertirDolarBolivar(double monedaDolar) {
		this.monedaDolar = monedaDolar * 33.36;
		this.monedaDolar = (double) Math.round(this.monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes ==>  " + this.monedaDolar + " Bolivares (BSF) Devaluados");
	}


}

