package test;
/*
 * Crear un método que devuelva una cadena con la unión de todos los textos recibidos
 * como parámetro separándolos por la coma (,)
 */
public class TestVarArgs {

	public static void main(String[] args) {
		System.out.println(union("a","b","c"));
		System.out.println(union ("Hello", "bye"));
		System.out.println(union(new String[] {"l", "m", "nono"}));
		
	}
	
	static String union (String ...data) {
		// El parametro que guarda el numero variable de argumentos
		// es un array
		StringBuilder sb = new StringBuilder();						
		for (String d:data) {
			sb.append(d);
			sb.append(", ");
		}
		return sb.toString();
	}
	

}
