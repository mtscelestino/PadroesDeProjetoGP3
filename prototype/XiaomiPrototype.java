public abstract class XiaomiPrototype implements Prototype {
	protected double valor;
	protected String tela, processador, ram, memoriaMax;
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public abstract String fichaTecnica();
	
	public abstract XiaomiPrototype clone();

}