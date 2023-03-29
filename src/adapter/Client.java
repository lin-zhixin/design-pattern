package adapter;

public class Client {
//    一般来讲一个项目里面的实现就一个 因此不需要区分具体的adapter
    Adapter adapter;
    public void main(String[] args) {
        adapter.method();
    }
}
