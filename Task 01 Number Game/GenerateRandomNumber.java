public class GenerateRandomNumber{
    public static void main(String[] args) {

        // ========= Random Number Generate ===========
        int num = (int)(Math.random() * 100) + 1; // => gives a number from 0 to 999
        System.out.println("Random Number Generated : "+num);
    }
}