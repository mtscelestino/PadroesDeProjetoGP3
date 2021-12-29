class Main {
  public static void main(String[] args) {
		CelMIA1 CelMIA1prototype = new CelMIA1();
		XiaomiPrototype CelMIA1novo =  CelMIA1prototype.clone();
		CelMIA1novo.setValor(1000);
    System.out.println("-------PROTÓTIPO-------");
    System.out.println(CelMIA1prototype.fichaTecnica());
    System.out.println("-------MIA1-------");
    System.out.println(CelMIA1novo.fichaTecnica());
    System.out.println("----------------------\n");


		CelRedmi10 CelRedmi10prototype = new CelRedmi10();
		XiaomiPrototype CelRedmi10novo =  CelRedmi10prototype.clone();
		CelRedmi10novo.setValor(1890);
    System.out.println("--------PROTÓTIPO--------");
    System.out.println(CelRedmi10prototype.fichaTecnica());
    System.out.println("------REDMI 10------");
    System.out.println(CelRedmi10novo.fichaTecnica());

  }
}