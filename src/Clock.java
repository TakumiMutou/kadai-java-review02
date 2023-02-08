
public class Clock {

    public static void main(String[] args) {
        getSeconds(18, 32, 47);
    }
    public static void getSeconds(int num1, int num2, int num3) {
        int result = num1 * 3600 + num2 * 60 + num3;
        System.out.println("一日の中での経過秒数：" + result);
    }
}
