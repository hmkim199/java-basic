package access.ex;

public class ShoppingCart {
    private Item[] items;
    private int count;

    public ShoppingCart(){
        items = new Item[10];
    }
    public void addItem(Item item) {
        if (count >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[count++] = item;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalprice());
    }

    private int calculateTotalprice() {
        int totalPrice = 0;
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
