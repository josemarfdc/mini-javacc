package Tree.exp;
import Temp.Label;
import Tree.ExpList;
public class NAME extends Exp {
  public Label label;
  public NAME(Label l) {label=l;}
  public ExpList kids() {return null;}
  public Exp build(ExpList kids) {return this;}
}

