package parentchild;
import parentchild.Parent;

public class Child extends Parent {

    public void show()
    {
        System.out.println("Show of child ");
        super.show();
    }

    public void display()
    {
        System.out.println("Display of child");
    }

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }


}
