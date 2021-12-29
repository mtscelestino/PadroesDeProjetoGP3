class Leaf extends AComponent{
  private String name;
  private int price;
  Leaf(String n, int p) {
    this.name = n;
    this.price = p; 
  }

  public int getPrice(){
    return this.price;
  }

  public String getName(){
    return this.name;
  }
}