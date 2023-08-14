package alura;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		Function monedas = new Function();

		Function temperaturas = new Function();

		String opciones = JOptionPane.showInputDialog(null, "Seleccione una opcion", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, new Object[] {
						"Conversor de Moneda", "Conversor de Temperatura"
				}, "Seleccion").toString();


		switch (opciones) {
		case "Conversor de Moneda":
			String inputMoneda = JOptionPane.showInputDialog("Ingrese la cantidad de dinero a convertir");

			double valorRecibidoMoneda = Double.parseDouble(inputMoneda);
			monedas.convertirMonedas(valorRecibidoMoneda);

			int seleccionMoneda = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion?");

			System.out.println("seleccionMoneda_FUERA DEL IF ==> " + seleccionMoneda);
			System.out.println("JOptionPane.OK_OPTION_FUERA DEL IF ==> " + JOptionPane.OK_OPTION);
			if (JOptionPane.OK_OPTION == seleccionMoneda){
				System.out.println("JOptionPane.OK_OPTION_DENTRO_DEL_IF ==>" + JOptionPane.OK_OPTION);
				int seleccionMoneda1;
				do{
					String nuevoValorMoneda = JOptionPane
							.showInputDialog("Ingrese un nuevo valor en Pesos a convertir");
					double nuevoValorRecibidoMoneda = Double.parseDouble(nuevoValorMoneda);
					monedas.convertirMonedas(nuevoValorRecibidoMoneda);
					seleccionMoneda1 = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion?");

					System.out.println("JOptionPane.OK_OPTION_DENTRO_DEL_DO ==>" + JOptionPane.OK_OPTION);
				} while (seleccionMoneda1 == 0);
				System.out.println("JOptionPane.OK_OPTION_FUERA_DEL_DO ==>" + JOptionPane.OK_OPTION);
				JOptionPane.showMessageDialog(null, "Programa terminado");
			}
			JOptionPane.showMessageDialog(null, "Programa terminado");
			break;




		case "Conversor de Temperatura":
			String inputTemperatura = JOptionPane.showInputDialog("Ingrese el valor de la temperatura");

			double valorRecibidoTemperatura = Double.parseDouble(inputTemperatura);
			temperaturas.ConvertirTemperaturas(valorRecibidoTemperatura);

			int seleccionTemperatura = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion?");

			System.out.println("JOptionPane.OK_OPTION_FUERA DEL IF ==> " + JOptionPane.OK_OPTION);
			System.out.println("seleccionMoneda_FUERA DEL IF ==> " + seleccionTemperatura);

			if (JOptionPane.OK_OPTION == seleccionTemperatura){
				System.out.println("JOptionPane.OK_OPTION_DENTRO_DEL_IF ==>" + JOptionPane.OK_OPTION);

				int seleccionTemperatura1;
				do{
					String nuevoValorTemperatura = JOptionPane.showInputDialog("Ingrese un nuevo valor de temperatura");

					double nuevoValorRecibido = Double.parseDouble(nuevoValorTemperatura);
					temperaturas.ConvertirTemperaturas(nuevoValorRecibido);

					seleccionTemperatura1 = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion?");
					System.out.println("JOptionPane.OK_OPTION_DENTRO_DEL_DO ==>" + JOptionPane.OK_OPTION);
				} while (seleccionTemperatura1 == 0);

				System.out.println("JOptionPane.OK_OPTION_FUERA_DEL_DO ==>" + JOptionPane.OK_OPTION);
				JOptionPane.showMessageDialog(null, "Programa terminado");
			}
			JOptionPane.showMessageDialog(null, "Programa terminado");
			break;



		}


	}
}

