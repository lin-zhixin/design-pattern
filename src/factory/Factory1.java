package factory;

public class Factory1 extends AbstractFactory{
    @Override
    public AbstractProduct createProduct() {
        return new Product1();
    }
}
