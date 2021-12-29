public class CelMIA1 extends XiaomiPrototype{

  protected CelMIA1 (CelMIA1 cel) {
		this.valor = cel.getValor();
    this.tela = "6.08 Polegadas";
    this.processador = "4x 2.0 GHz Kyro 260 + 4x 1.8 GHz Kyro 260";
    this.ram = "4 GB";
    this.memoriaMax = "64 GB";
	}

	public CelMIA1() {
	}

	public String fichaTecnica() {
		return "FICHA TÉCNICA: \nTela de: " + this.tela + "\nProcessador: " + this.processador + "\nRAM: " + this.ram + "\nMemória Max: " + this.memoriaMax + "\nPreço:" + this.valor;
	}
	
	public XiaomiPrototype clone() {
		return new CelMIA1 (this);
	}
}