class Main {
  public static void main(String[] args){
    Leaf i1 = new Leaf("Iphone-X",3000);
    Leaf i2 = new Leaf("Iphone-S",4000);
    Composite celulares = new Composite("Celulares");
    celulares.add(i1);
    celulares.add(i2);
    System.out.println(celulares+"PREÇO TOTAL:"+celulares.getPrice()+"\n");


    Leaf i3 = new Leaf("Tablet",1000);
    Leaf i4 = new Leaf("Kindle",500);
    Composite eletronicos = new Composite("Eletronicos");
    eletronicos.add(celulares);
    eletronicos.add(i3);
    eletronicos.add(i4);
    System.out.println(eletronicos+"PREÇO TOTAL:"+eletronicos.getPrice()+"\n");


    Leaf i5 = new Leaf("Ventilador",300);
    Leaf i6 = new Leaf("Sapato",150);
    Composite sacola = new Composite("Sacola");
    sacola.add(i5);
    sacola.add(i6);
    sacola.add(eletronicos);
    System.out.println(sacola+"PREÇO TOTAL:"+sacola.getPrice()+"\n");

  }
}