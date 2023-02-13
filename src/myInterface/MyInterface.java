package myInterface;

@FunctionalInterface
public interface MyInterface {

    public default String theDefaultMethod(){
        return "hi";
    }

    public int operation(int x, int y);
}
