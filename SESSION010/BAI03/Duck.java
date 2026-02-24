package SESSION10.BAI03;

public class Duck extends Animal implements Swimmable, Flyable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " đang bơi tung tăng trên mặt nước.");
    }

    @Override
    public void fly() {
        System.out.println(name + " đang vỗ cánh bay lượn trên trời.");
    }
}
