package shape;

import java.util.Scanner;

public class Rectangle extends Shape{
    protected double width, height;

    public Rectangle() {
        super("Rectangle");
        input();
        compute();
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = s.nextDouble();
        System.out.print("\nEnter height: ");
        height = s.nextDouble();
    }
    
    public void compute(){
        this.perimeter = 2*(width + height);
        this.area = width*height;
    }
    
}
