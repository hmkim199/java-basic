package poly.ex.pay1;

public class DefaultPay implements Pay{ // null 대신에 쓰는 null object 패턴
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
