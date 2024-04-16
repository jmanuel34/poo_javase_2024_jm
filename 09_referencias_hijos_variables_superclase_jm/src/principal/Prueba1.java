package principal;

class C1{
	int a = 3;
	public void print() {
		System.out.println("C1");
	}
}

class C2 extends C1{
	int a = 5;
//*
	public void print() {
		System.out.println("C2");
	}
//*/
	public void send() {
		System.out.println("Enviando ...");
	}
}
public class Prueba1 {

	public static void main(String[] args) {
		C1 c = new C2();           	
		c.print();					// Imprime C2

//		c.send();   No esta definido en la superclase
		System.out.println(c.a);	// Imprime 3
//		System.out.println(a);
//		Integer entero = 100;
		metodoHashCode("e");
		
	}
	static void metodoHashCode (Object o) {
		System.out.println(o.hashCode());
	}

}
