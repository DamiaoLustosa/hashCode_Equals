package aplicacao;

import entities.Cliente;

public class Programa {
	public static void main (String args[]) {
		
	Cliente c1 = new Cliente("Maria", "maria@gmail.com");
	Cliente c2 = new Cliente("Antonio", "antony@gmail.com");
	
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
	System.out.println(c1.equals(c2));
		
		
	}
	
}
