import controller.Controller;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Controller controller = new Controller();
        try {
            controller.run();
        } catch (Exception e) {
            System.out.println("[ERROR] 로또 프로그램을 종료합니다.");
        }
    }
}
