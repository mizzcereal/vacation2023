package chap07;

// 인터페이스는 '기능'
interface 입 {
    void cry();
}

interface 눈 {
    void see();
}

interface 날개 {
    void fly();
}

abstract class 사람 implements 입, 눈 {

}

abstract class 새 implements 입, 눈, 날개 {

}

class 홍길동 extends 사람 {

    @Override
    public void cry() {

    }

    @Override
    public void see() {

    }

}

class 천사 extends 사람 implements 날개 {

    @Override
    public void cry() {

    }

    @Override
    public void see() {

    }

    @Override
    public void fly() {

    }

}

class 직박구리 extends 새 implements 입, 눈, 날개 {

    @Override
    public void cry() {

    }

    @Override
    public void see() {

    }

    @Override
    public void fly() {

    }

}

// 인터페이스는 클래스에서 여러개를 구현할 수 있다.
class Cat implements 입, 눈 {

    @Override
    public void cry() {
        System.out.println("야옹");
    }

    @Override
    public void see() {
        System.out.println("고양이가 본다.");
    }

}

class Dog implements 입, 눈 {

    @Override
    public void cry() {
        System.out.println("멍멍");
    }

    @Override
    public void see() {
        System.out.println("강아지가 본다");
    }
}

public class S08 {

    public static void main(String[] args) {

    }
}
