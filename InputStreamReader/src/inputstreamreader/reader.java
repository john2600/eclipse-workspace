package inputstreamreader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
public class reader {

	/**
	 * @param args
	 */ 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Ingreseel valor");
		InputStreamReader ejemplo =new InputStreamReader(System.in);
		BufferedReader x= new BufferedReader(ejemplo);
        PrintStream flujosalida= new PrintStream(System.out);
        int S;
        try {
			S=ejemplo.read();
			  flujosalida.print(S);
		} catch (IOException e) {
			
			
			System.out.print("No es lo esperado");
		}
      
        
	}

}
