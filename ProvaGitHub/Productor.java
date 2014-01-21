public class Productor extends Thread {

	private Buffer buffer;

	public Productor(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		Character lletra;
		for (int i = 1; i <= 10; i++) {
			lletra = (char) (Math.random() * 26 + 65);
			buffer.posar(lletra);
			System.out.println("Productor: " + lletra);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
