package Day32;

public class CallFood {
    public static void main(String[] args) {

        Food myFood=new Food();

        myFood.appleWeight=2;
        myFood.orangeWeight=3;
        myFood.applePrice=5;
        myFood.orangePrice=8;

        int total1=myFood.totalPrice(5, 8);
        int total2=myFood.totalWeight(2, 3);

        System.out.println(total1);

        System.out.println(total2);

    }
}
