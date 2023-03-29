package factory;

public class Factory2 extends AbstractFactory{
    @Override
    public AbstractProduct createProduct() {
        return new Product2();
    }
}
