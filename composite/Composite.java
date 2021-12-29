import java.util.ArrayList;

class Composite extends AComponent{
  String name;

  Composite(String n){
    name = n;
  }

  public ArrayList<AComponent> itens = new ArrayList();
  
  public int getPrice(){
    int tot = 0;
    for (int i = 0; i < itens.size(); i++)
      tot += itens.get(i).getPrice(); 
    return tot;
  }

  public String getName(){
    return toString();
  }

  public void add (AComponent item){
    itens.add(item);
  }

  public void remove(AComponent item){
    if(itens.indexOf(item)!=-1)
      itens.remove(item);
  }

  public String toString(){
    String ret = this.name+ " = {\n  ";
    for (int i = 0; i < itens.size(); i++) {
      ret += (itens.get(i).getName() + ", ");
    }
    return ret+"\n}\n";
  }
}