import java.util.Random;

public class L3Q2 {

    public static void main(String[] args) {
        Random r = new Random();
        int randInt = r.nextInt(6);
        switch (randInt){
            case 0:
                System.out.println(randInt + " is" + " zero"  );
                break;
            case 1:
                System.out.println(randInt + " is " + " one");
                break;
            case 2:
                System.out.println(randInt + " is " + " two");
                break;
            case 3:
                System.out.println(randInt + " is " + " three");
                break;
            case 4:
                System.out.println(randInt + " is " + " four");
                break;
            case 5:
                System.out.println(randInt + " is " + " five" );
                break;
        }
    }
}
