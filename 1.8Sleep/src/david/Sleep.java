package david;

class MiHebra extends Thread{
	public void run(){
		while(true){
			System.out.println("Dormimos...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			System.out.println("Espera activa...");
			for (int i = 0; i < 0x7FFFFFFF; i++);
		}
	}
}

public class Sleep {

	public static void main(String[] args) {
		MiHebra mh = new MiHebra();
		mh.start();
		while(true);

	}

}
