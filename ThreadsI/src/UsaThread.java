public class UsaThread {
    public static void main(String[] args) {
        System.out.println("Thread principal iniciando.");
        MyThread mt = new MyThread("Filha #1");
		MyThread mt2 = new MyThread("Filha #2");
		MyThread mt3 = new MyThread("Filha #3");
		Thread newThrd = new Thread(mt);
		Thread newThrd2 = new Thread(mt2);
		Thread newThrd3 = new Thread(mt3);

	newThrd.start();
	newThrd2.start();
	newThrd3.start();
	for (int i = 0; i < 50; i++) {
	     System.out.print(".");
	     try {
		  Thread.sleep(100);
	     } catch (InterruptedException exc) {
	  	 System.out.println("Thread principal interrompida.");
	     }
	}
		System.out.println("Thread principal finalizando.");
	}
}