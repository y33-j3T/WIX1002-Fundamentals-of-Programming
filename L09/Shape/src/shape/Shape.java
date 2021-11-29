package shape;

public class Shape {
    protected String name;
    protected double perimeter, area;

    public Shape(String name) {
        this.name = name;
    }
    
    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    @Override
    public String toString(){
        return "Name of shape: " + name +
               "\nPerimeter: " + String.format("%-6.2f", perimeter) +
               "\nArea: " + String.format("%-6.2f", area);
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        Square b = new Square();
        Circle c = new Circle();
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
    
}
