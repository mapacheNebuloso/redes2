package proy_datagrama;

import java.util.Scanner;

public class Datagrama {

	public void fragmentar() {
		int tam_datagrama = 0;
		int mtu = 0;

		Scanner scn = new Scanner(System.in);
		System.out.println("Por favor ingrese el");
		tam_datagrama = Integer.parseInt(scn.nextLine());
		mtu = Integer.parseInt(scn.nextLine());

		// TO-DO: Verificar que la fragmentación se haga de esta manera en las diapos.
		int datagrama_headerless = tam_datagrama - 8;
		int fragmentos = (int) Math.ceil(datagrama_headerless / mtu);
	}

	/**
	 * Llena un arreglo de String con cada uno de los Flags de cada fragmentos
	 * 
	 * @param cantFragmentos Cantidad de partes en que se divide el datagrama
	 * @return Un arreglo de String donde cada posicion indica los flags de cada
	 *         fragmento en orden, la primera posici�n corresponde al primer
	 *         fragmento, la segunda al segundo, etc ...
	 */
	public String[] calcularFlags(int cantFragmentos) {

		String[] flags = new String[cantFragmentos];
		if (cantFragmentos == 1) {
			flags[0] = "010";
			return flags;
		}

		for (int i = 0; i < flags.length; i++) {

			if (i == flags.length - 1) {
				flags[i] = "010";
				return flags;
			} else {
				flags[i] = "011";
			}
		}

		return flags;

	}

}
