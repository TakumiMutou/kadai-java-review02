
public class Review01 {

    public static void main(String[] args) {
        //価格、税率、税金
        int price = 1500;
        int rate = 10;
        int tax = tax(price, rate);
        //出力
        System.out.println(price + "円の商品の税込価格は" + (price + tax) + "円　（消費税は" + tax +"円） です。" );

    }
    public static int tax(int price, int rate ) {
        //税金の計算
        int tax = price * rate / 100;
        return tax;

    }

}
