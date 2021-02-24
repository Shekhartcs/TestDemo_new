public class OverridingExp {
    public void show()
    {
        System.out.println("Parent Show method");
    }

}
class child extends OverridingExp{
    public void show(){
        System.out.println("Child show method");
    }

}
