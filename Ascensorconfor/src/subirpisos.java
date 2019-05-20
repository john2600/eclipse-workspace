import java.util.Scanner;

public class subirpisos {

	public void subir() {

		int pisoactual = 1;
		int pisodeseado = 10;
		int pisosubir = 5;

		

			for (pisoactual = 1; pisoactual <= pisosubir; pisoactual++) {
				pisosubir = pisodeseado - pisoactual;
				System.out.println("Si se encuentra en el piso" + pisoactual + " y desea ir al piso" + pisodeseado
						+ " .el numero de pisos que debe subir es:" + pisosubir);
			}

		}

	



}
