package singleton;
public class SingletonEager {

    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {
        System.out.println("in the constructor"); // this will print first
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }

    public void print() {
        System.out.println("hello from eager");
    }

}

