package adapter;

public class AdapterImpl1 implements Adapter {
    //可以引用项目1的service
    @Override
    public void method() {
        System.out.println("adapterImpl1");
    }
}
