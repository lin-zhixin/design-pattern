package adapter;

public class AdapterImpl2 implements Adapter {
    //可以引用项目2的service

    @Override
    public void method() {
        System.out.println("adapterImpl2");
    }
}
