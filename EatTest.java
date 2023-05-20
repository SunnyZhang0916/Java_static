package AbstractDemo;

public class EatTest {
    public static void main(String[] args) {
        // Eat.name = "1234"; 不能改变，因为接口的成员是默认为final

        Mouth mouth = new Mouth();
        mouth.eating2();
    }
}
