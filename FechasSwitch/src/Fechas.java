import java.util.Scanner;

public class Fechas {

	public void calcularnumdias() {

		System.out.println("Ingrese el mes del cual desea conocer los dias");

		Scanner mes = new Scanner(System.in);

		int mescalculado = mes.nextInt();

		String message = null;

		switch (mescalculado)

		{
		case 1:
			message = "Enero tiene 31 d�as";

			break;
		case 2:
			message = "Febrero tiene 28 d�as";

			break;

		case 3:

			message = "Marzo tiene 31 d�as";

			break;

		case 4:

			message = "Abril tiene 30 d�as";

			break;

		case 5:

			message = "Mayo tiene 31 d�as";

			break;

		case 6:

			message = "Junio tiene 30 d�as";

			break;

		case 7:

			message = "Julio tiene 31 d�as";

			break;

		case 8:

			message = "Agosto tiene 31 d�as";

			break;

		case 9:

			message = "Septiembre tiene 30 d�as";

			break;
		case 10:

			message = "Octubre tiene 31 d�as";

			break;
		case 11:

			message = "Noviembre tiene 30 d�as";

			break;

		default:

			message = "Diciembre tiene 31 d�as";			

		}
		
		printMessage(message);
	}

	private void printMessage(String message) {
		System.out.println(message);
	}

}
