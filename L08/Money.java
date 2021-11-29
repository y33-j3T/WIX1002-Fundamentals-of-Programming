public class Money {
    private int amount;
    private int note100=0;
    private int note50=0;
    private int note10=0;
    private int note5=0;
    private int note1=0;
    private int coin50=0;
    private int coin20=0;
    private int coin10=0;
    private int coin5=0;
    
    
    public Money(double amount){
        this.amount =(int)Math.round(amount*100);
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    public void roundUp(){
        int a = this.amount%10;
        switch (a){
            case 1:
                this.amount-=1;
                break;
            case 2:
                this.amount-=2;
                break;
            case 3:
                this.amount+=2;
                break;
            case 4:
                this.amount+=1;
                break;
            case 6:
                this.amount-=1;
                break;
            case 7:
                this.amount-=2;
                break;
            case 8:
                this.amount+=2;
                break;
            case 9:
                this.amount+=1;
                break;
        }
    }
    
    public void addObject(Money a){
        this.amount += (int)Math.round(a.amount*100);
    }
    
    public void subtractObject(Money a){
        this.amount -= (int)Math.round(a.amount*100);
    }
    
    public void numOfNoteCoin(){
        this.note100 = this.amount/10000 == 0? 0 : this.amount/10000;
        this.amount-=(this.amount/10000)*10000;
        this.note50 = this.amount/5000 == 0? 0 : this.amount/5000;
        this.amount-=(this.amount/5000)*5000;
        this.note10 = this.amount/1000 == 0? 0 : this.amount/1000;
        this.amount-=(this.amount/1000)*1000;
        this.note5 = this.amount/500 == 0? 0 : this.amount/500;
        this.amount-=(this.amount/500)*500;
        this.note1 = this.amount/100 == 0? 0 : this.amount/100;
        this.amount-=(this.amount/100)*100;
        this.coin50 = this.amount/50 == 0? 0 : this.amount/50;
        this.amount-=(this.amount/50)*50;
        this.coin20 = this.amount/20 == 0? 0 : this.amount/20;
        this.amount-=(this.amount/20)*20;
        this.coin10 = this.amount/10 == 0? 0 : this.amount/10;
        this.amount-=(this.amount/10)*10;
        this.coin5 = this.amount/5 == 0? 0 : this.amount/5;
        this.amount-=(this.amount/5);
    }
    
    public void dispNoteCoin(){
        System.out.println("RM 100.00: " + note100);
        System.out.println("RM 50.00: " + note50);
        System.out.println("RM 10.00: " + note10);
        System.out.println("RM 5.00: " + note5);
        System.out.println("RM 1.00: " + note1);
        System.out.println("RM 0.50: " + coin50);
        System.out.println("RM 0.20: " + coin20);
        System.out.println("RM 0.10: " + coin10);
        System.out.println("RM 0.05: " + coin5);
    }
    
    public static void main(String[] args) {
            Money a = new Money(394834.34);
            a.roundUp();
            System.out.printf("Input amount: %-6.2f\n", a.getAmount()/100.00);
            a.numOfNoteCoin();
            a.dispNoteCoin();
    }
}
