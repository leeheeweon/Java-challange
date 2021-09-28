import org.junit.jupiter.api.Test;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
        isCatPlaying(true, 45);
    }
    @Test
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == true) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            } else {
                return false;
            }
        }
    }
}
