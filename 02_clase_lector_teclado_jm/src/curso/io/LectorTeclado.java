package curso.io;
/*
 * Crear una clase para lectura de datos por teclado.
 * Esa clase tendrá tres médodos:
 * readString()
 * readInt()
 * readDouble() 
 * 
 *  
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectorTeclado extends BufferedReader{
	public LectorTeclado() {
		super(new InputStreamReader(System.in));
	}
	
	public String readString() {
			try {
				return readLine();
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
	}
	
	// Lee un enteroo
	public int readInt() {
		try {
			return Integer.parseInt(readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
			return 0;
			
		}
	}
	
	public double readDouble() {
		try {
			return Double.parseDouble(readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
			return 0.0;
		}
	}
	
}
