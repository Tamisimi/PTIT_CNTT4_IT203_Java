package SESSION10.BAI04;

public interface RemoteControl {
    void powerOn();

    default void checkBattery() {
        System.out.println("Pin ổn định");
    }
}
