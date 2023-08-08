import model.Singleton.Singleton;
import model.SingletonPropriedade.SingletonPropriedade;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);

        SingletonPropriedade singletonPropriedade = SingletonPropriedade.getInstance("teste");
        SingletonPropriedade singletonPropriedade1 = SingletonPropriedade.getInstance("teste2");
        System.out.println(singletonPropriedade);
        System.out.println(singletonPropriedade.getValue());

        System.out.println(singletonPropriedade1);
        System.out.println(singletonPropriedade1.getValue());
    }
}