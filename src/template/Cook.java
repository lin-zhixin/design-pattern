package template;

public abstract class Cook {
    public abstract void step1();
    public abstract void step2();
    public abstract void step3();
    public void cooking(){
        step1();
        step2();
        step3();
    }
}
class CookExtends extends Cook {

    @Override
    public void step1() {
        System.out.println("step1");
    }

    @Override
    public void step2() {
        System.out.println("step2");

    }

    @Override
    public void step3() {
        System.out.println("step3");

    }
}

class Main{
    public static void main(String[] args) {
        CookExtends c = new CookExtends();
        c.cooking();
    }
}

