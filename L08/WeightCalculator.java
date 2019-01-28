import java.util.Scanner;

public class WeightCalculator {
    private int age;
    private double height;
    Scanner s = new Scanner(System.in);
    
    public WeightCalculator(){
        System.out.print("Input age: ");
        age = s.nextInt();
        System.out.print("Input height: ");
        height = s.nextDouble();
    }
    
    public double recommendedWeight(){
        return (height - 100 + age/10) * 0.9;
    }
    
    public void display(){
        System.out.println("Age: " + age);
        System.out.printf("Height: %-6.2f\n", height);
        System.out.printf("Recommended weight: %-6.2f\n", this.recommendedWeight());
    }
}
