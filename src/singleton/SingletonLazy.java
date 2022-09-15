package singleton;

public class SingletonLazy {

    private static SingletonLazy instance = null;

    private SingletonLazy() {
        System.out.println("in the constructor");
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            // synchronized block to remove overhead
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    // if instance is null, initialize
                    instance = new SingletonLazy();
                }

            }
        }
        return instance;
    }

    public void print() {
        System.out.println("hello from lazy");
    }
}

