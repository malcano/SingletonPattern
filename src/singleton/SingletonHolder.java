package singleton;

public class SingletonHolder {

    private SingletonHolder() {
        System.out.println("in the constructor");
    }

    private static class Holder {
        private static final SingletonHolder INSTANCE = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return Holder.INSTANCE;
    }

    public void print() {
        System.out.println("hello from holder");
    }

}

