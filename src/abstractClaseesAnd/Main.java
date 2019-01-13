package abstractClaseesAnd;

public class Main {

    public static void main(String[] args) {

        Square s = new Square();
        s.setxya(100, 100, 5);

        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}