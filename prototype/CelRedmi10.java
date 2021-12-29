public class CelRedmi10 extends XiaomiPrototype{

  protected CelRedmi10 (CelRedmi10 cel) {
		this.valor = cel.getValor();
    this.tela = "6.43 Polegadas";
    this.processador = "2x 2.2 GHz Kryo 460 Gold + 6x 1.7 GHz Kryo 460 Silver";
    this.ram = "4 GB";
    this.memoriaMax = "128 GB";
	}

	public CelRedmi10() {
	}

	public String fichaTecnica() {
		return "FICHA TÉCNICA: \nTela de: " + this.tela + "\nProcessador: " + this.processador + "\nRAM: " + this.ram + "\nMemória Max: " + this.memoriaMax + "\nPreço:" + this.valor;
	}
	
	public XiaomiPrototype clone() {
		return new CelRedmi10 (this);
	}
}