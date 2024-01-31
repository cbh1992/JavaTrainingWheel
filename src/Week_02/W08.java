package Week_02;

public class W08 {
    public static void main(String[] args) {
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z;
        System.out.println("x < y && y < z => " + result);
        result = x + 10 < y && y < z;
    //계산순서 : [{(x + 10) < y} && {y < z}]
        System.out.println("x + 10 < y && y < z => " + result);
        result = x + 2 * 3>y;
        System.out.println("x + 2 * 3>y => " + result);
        result = (x + 2) * 3>y;
        System.out.println("(x + 2) * 3>y => " + result);

    }
}
