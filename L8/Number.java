package l8q1;

import java.util.Random;

public class Number {
    Random r = new Random();
    private int[] numArr;
    
    public Number(){
        numArr = new int[10];
        for(int i=0 ; i<10 ; i++){
            this.numArr[i]=r.nextInt(101);
        }
    }
    
    public Number(int N){
        numArr = new int[N];
        for(int i=0 ; i<N ; i++){
            this.numArr[i]=r.nextInt(101);
        }
    }
    
    public Number(int N, int range){
        numArr = new int[N];
        for(int i=0 ; i<N ; i++){
            this.numArr[i]=r.nextInt(range+1);
        }
    }
    
    public void getItems(){
        System.out.print("Number(s): ");
        for(int i=0 ; i<numArr.length ; i++){
            System.out.print(this.numArr[i] + " ");
        }
        System.out.println();
    }
    
    public void getEven(){
        System.out.print("Even number(s): ");
        for(int i=0 ; i<numArr.length ; i++){
            if(this.numArr[i]%2==0)
                System.out.print(this.numArr[i] + " ");
        }
        System.out.println();
    }
    
    public void getPrime(){
        System.out.print("Prime number(s): ");
        for(int i=0 ; i<numArr.length ; i++){
            boolean prime = true;
            if(numArr[i]==1 || numArr[i]==0){
                prime = false;
            }
            
            for(int j=2 ; j<=Math.sqrt(numArr[i]) ; j++){
                
                if(numArr[i]%j==0){
                    prime = false;
                    break;
                }
            }
            
            if(prime){
                System.out.print(numArr[i] + " ");
            }
        }
        System.out.println();
    }
    
    public void getMax(){
        int max = numArr[0];
        for(int i=1 ; i<numArr.length ; i++){
            if(max<numArr[i])
                max=numArr[i];
        }
        System.out.println("Maximum number: " + max);
    }
    
    public void getMin(){
        int min = numArr[0];
        for(int i=1 ; i<numArr.length ; i++){
            if(min<numArr[i])
                min=numArr[i];
        }
        System.out.println("Minimum number: " + min);
    }
    
    public void getAverage(){
        int sum=0;
        for(int i=0 ; i<numArr.length ; i++){
            sum+=numArr[i];
        }
        
        System.out.println("Average: " + sum/numArr.length);
    }
    
    public void getSquare(){
        System.out.print("Square number(s): ");
        for(int i=0 ; i<numArr.length ; i++){
            System.out.print(numArr[i]*numArr[i] + " ");
        }
        System.out.println();
    }
}
