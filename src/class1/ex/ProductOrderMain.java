package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder computer = new ProductOrder();
        computer.productName = "컴퓨터";
        computer.price = 2000;
        computer.quantity = 2;

        ProductOrder monitor = new ProductOrder();
        monitor.productName = "모니터";
        monitor.price = 3000;
        monitor.quantity = 4;

        ProductOrder[] productOrders = {computer, monitor};

        int totalPrice = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.println("제품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
            totalPrice += productOrder.price * productOrder.quantity;
        }

        System.out.println("총 결제 금액: " + totalPrice);
    }
}
