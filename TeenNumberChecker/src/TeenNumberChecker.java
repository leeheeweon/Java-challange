public class TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(9,99,19);
        hasTeen(23,15,43);
        hasTeen(22,23,34);

    }
    public static boolean hasTeen(int x , int y , int z){
        if (isTeen(x) ==true || isTeen(y) == true || isTeen(z) ==true){
            System.out.println("true");
            return true;
        }
        return false;
    }
    public static boolean isTeen(int num){
        if (num>=13 && num<=19){
            return true;
        }
        return false;
    }
}
