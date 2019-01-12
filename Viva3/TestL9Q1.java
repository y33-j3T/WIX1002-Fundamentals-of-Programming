public class TestL9Q1 {

    public static void main(String[] args) {
        Pokemon Eung = new Pokemon("001", "Choon Eung", "Water");
        Pokemon Alvin = new Pokemon("002", "Alvin Wong", "Water");
        
        System.out.println(Eung.toString());
        System.out.println();
        System.out.println(Alvin.toString());
        System.out.println();
        
        Alvin.upLevel();
        Alvin.upLevel();
        Alvin.upLevel();
        System.out.println(Alvin.toString());
        System.out.println();
        
        Pokemon a = Alvin;
        Pokemon b = Eung;
        
        while (true){
            Pokemon.fight(a, b);
            if(a.getHitPoint()<=0 || b.getHitPoint()<=0){
                 if(a.getHitPoint()>b.getHitPoint()){
                    System.out.println(a.getName() + " wins!");
                    break;
                } else {
                    System.out.println(b.getName() + " wins");
                    break;
                }
            }
        }
        
        System.out.println(Eung.toString());
        System.out.println();
        System.out.println(Alvin.toString());
        System.out.println();
    }
}
