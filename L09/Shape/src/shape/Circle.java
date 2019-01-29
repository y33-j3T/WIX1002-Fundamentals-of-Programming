package shape;

import java.util.Scanner;

public class Circle extends Shape{
    protected double diameter;
    
    public Circle(){
        super("Circle");
        input();
        compute();
    }
    
     public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter diameter: ");
        diameter = s.nextDouble();
    }
    
    public void compute(){
        this.perimeter = Math.PI*diameter;
        this.area = Math.PI*Math.pow((diameter/2),2);
    }
}
