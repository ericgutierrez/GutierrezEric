public class Consumidor extends Thread {

	private Buffer buffer;

	public Consumidor(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Consumidor: " + buffer.recollir());
			try {
				Thread.sleep(105);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
