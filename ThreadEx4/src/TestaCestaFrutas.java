public class TestaCestaFrutas {
    public static void main(String[] args) {
        System.out.println("Thread principal iniciando.");
        CestaFrutas cs = new CestaFrutas("Filha #1");
	    Thread newThrd = new Thread(cs);
	    newThrd.start();

	for (int i = 0; i < 4; i++) {
	     System.out.print(".");
	     try {
		  Thread.sleep(400);
	     } catch (InterruptedException exc) {
	  	 System.out.println("Thread principal interrompida.");
	     }
	}
		System.out.println("Thread principal finalizando.");
	}
}
