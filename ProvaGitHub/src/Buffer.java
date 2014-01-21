public class Buffer {

	private Character contingut;
	private Boolean disponible = false;

	public void posar(Character contingut) {
		this.contingut = contingut;
		disponible = true;
	}

	public Character recollir() {

		if (disponible) {
			disponible = false;
			return contingut;
		} else {
			return '*';
		}
	}
}
