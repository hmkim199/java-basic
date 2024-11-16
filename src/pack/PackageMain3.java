package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        // 다른 패키지의 동일 클래스명인 경우 둘 다 사용하고 싶으면 하나만 import 가능, 나머지는 이렇게 해야함.
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
