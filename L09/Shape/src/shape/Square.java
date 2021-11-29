package shape;

import java.util.Scanner;

public class Square extends Shape {
    protected double length;
    
    public Square(){
        super("Square");
        input();
        compute();
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = s.nextDouble();
    }
    
    public void compute(){
        this.perimeter = 4*length;
        this.area = length*length;
    }
}
