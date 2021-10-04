public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }
    public static boolean areEqualByThreeDecimalPlaces(double param1 , double param2){

        if(param1 < 0) {
            param1 = Math.ceil(param1*1000)/1000.0;
            param2 = Math.ceil(param2*1000)/1000.0;
        }else {
            param1 = Math.floor(param1*1000)/1000.0;
            param2 = Math.floor(param2*1000)/1000.0;
        }

        if (param1 == param2) {
            return true;
        } else {
            return false;
        }
    }
}
