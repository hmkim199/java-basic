package access.poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
//        InterfaceA interfaceA = new InterfaceA();
        InterfaceA a = new Child();
        a.methodCommon();
        a.methodA();

        InterfaceB b = new Child();
        b.methodCommon();
        b.methodB();
    }
}
