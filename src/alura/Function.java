package alura;

import javax.swing.JOptionPane;

public class Function {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirTemperaturas temperaturas = new ConvertirTemperaturas();

	public void convertirMonedas(double valorRecibido) {
		Object[] posibilidadesMonedas = {
				"De Pesos (COP) a Dolares ($)", "De Dolares ($) a Pesos (COP)", "De Pesos (COP) a Bolivares (BSF)",
				"De Bolivares (BSF) a Pesos (COP)", "De Bolivares (BSF) a  Dolares ($)",
				"De Dolares ($) a Bolivares (BSF)"
		};

		String opcion = JOptionPane.showInputDialog(null, "Elige una moneda a la que deseas convertir tu dinero",
				"Monedase", JOptionPane.PLAIN_MESSAGE, null, posibilidadesMonedas, "Seleccion").toString();

		switch (opcion) {
		case "De Pesos (COP) a Dolares ($)":
			this.monedas.convertirPesosDolar(valorRecibido);
			break;
		case "De Dolares ($) a Pesos (COP)":
			this.monedas.convertirDolarPesos(valorRecibido);
			break;
		case "De Pesos (COP) a Bolivares (BSF)":
			this.monedas.convertirPesosBolivar(valorRecibido);
			break;
		case "De Bolivares (BSF) a Pesos (COP)":
			this.monedas.convertirBolivarPeso(valorRecibido);
			break;
		case "De Bolivares (BSF) a  Dolares ($)":
			this.monedas.convertirBolivarDolar(valorRecibido);
			break;
		case "De Dolares ($) a Bolivares (BSF)":
			this.monedas.convertirDolarBolivar(valorRecibido);
			break;
		}
	}


	public void ConvertirTemperaturas(double valorRecibido) {


		Object[] posibilidadesemperatura = {
				"De Celsius a Fahrenheit", "De Fahrenheit a Celsius"
		};

		int mensajeTemperatura = JOptionPane.PLAIN_MESSAGE;

		String opcionesTemperatura = "Elige una temperatura a convertir";

		String opcion = JOptionPane.showInputDialog(null, opcionesTemperatura, "Temperaturas",
				mensajeTemperatura, null, posibilidadesemperatura, "Seleccion").toString();

		switch (opcion) {
		case "De Celsius a Fahrenheit":
			this.temperaturas.convertirCelsiusAFahrenheith(valorRecibido);
			break;
		case "De Fahrenheit a Celsius":
			this.temperaturas.convertirFahrenheithACelsius(valorRecibido);
			break;

		}


	}
}
