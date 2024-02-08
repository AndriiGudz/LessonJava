package consultation;

public class MainAuto {
    public static void main(String[] args) {

        Auto auto = new Auto("BMW", "M5", "white");

        System.out.println(auto);

        auto.startTheEngine();
        auto.stopTheEngine();
        auto.honk();

    }
}
