package factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1=new Factory1();
        factory1.createProduct().method();
        AbstractFactory factory2=new Factory2();
        factory2.createProduct().method();
    }
}
