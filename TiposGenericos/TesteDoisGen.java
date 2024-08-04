public class TesteDoisGen {

	public static void main(String [] args){

	// Criar objetos do tipo DoisGen <T,V>
	DoisGen<String,Integer> par = new DoisGen<String,Integer>("Teste", 88);

	par.showType();
	
	System.out.println("String: " + par.getOb1());
	System.out.println("Integer: " + par.getOb2());
	}

}