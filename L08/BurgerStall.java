public class BurgerStall {
    private static int totalBurgerSold = 0;
    private final String ID;
    private int burgerSold;
    
    public BurgerStall(String ID){
        this.ID = ID;
        burgerSold = 0;
    }
    
    public void sold(int burgerSold){
        this.burgerSold+= burgerSold;
        totalBurgerSold += burgerSold;
    }
    
    public int getBurgerSold(){
        return this.burgerSold;
    }
    
    public static int getTotalBurger(){
        return totalBurgerSold;
    }
    
    @Override
    public String toString(){
        return this.ID + " sold " + this.getBurgerSold();
    }

    public static void main(String[] args) {
        BurgerStall A = new BurgerStall("Happy Yeoh");
        BurgerStall B = new BurgerStall("Happy Alvin");
        BurgerStall C = new BurgerStall("Happy Jet");
        
        A.sold(5);
        B.sold(10);
        C.sold(3);

        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        
        System.out.println("Total burger sold: " + BurgerStall.getTotalBurger());
    }
}
