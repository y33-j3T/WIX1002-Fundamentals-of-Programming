package viva3;

import java.util.Random;

public class Pokemon {
    protected String ID;
    protected String Name;
    protected String ElementType;
    protected int HitPoint;
    protected int Attack;
    protected int Defense;
    protected int Speed;
    protected int Special;
    protected int Level;
    
    public Pokemon(String ID, String Name, String ElementType){
        this.ID = ID;
        this.Name = Name;
        this.ElementType = ElementType;
        genHitPoint();
        genAttack();
        genDefense();
        genSpeed();
        genSpecial();
        Level = 1;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setElementType(String ElementType) {
        this.ElementType = ElementType;
    }

    public void setHitPoint(int HitPoint) {
        this.HitPoint = HitPoint;
    }

    public void setAttack(int Attack) {
        this.Attack = Attack;
    }

    public void setDefense(int Defense) {
        this.Defense = Defense;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }

    public void setSpecial(int Special) {
        this.Special = Special;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getElementType() {
        return ElementType;
    }

    public int getHitPoint() {
        return HitPoint;
    }

    public int getAttack() {
        return Attack;
    }

    public int getDefense() {
        return Defense;
    }

    public int getSpeed() {
        return Speed;
    }

    public int getSpecial() {
        return Special;
    }

    public int getLevel() {
        return Level;
    }
    
    public void genHitPoint(){
        Random r = new Random();
        HitPoint = r.nextInt(11) + 15;
    }
    public void genAttack(){
        Random r = new Random();
        Attack = r.nextInt(8) + 10;
    }
    public void genDefense(){
        Random r = new Random();
        Defense = r.nextInt(4) + 5;
    }
    public void genSpeed(){
        Random r = new Random();
        Speed = r.nextInt(6) + 10;
    }
    public void genSpecial(){
        Random r = new Random();
        Special = r.nextInt(6) + 5;
    }
    
    public void upLevel(){
        Random r = new Random();
        Level += 1;
        HitPoint += r.nextInt(4) + 2;
        Attack += r.nextInt(3) + 1;
        Defense += r.nextInt(3) + 1;
        Speed += r.nextInt(3) + 1;
        Special += r.nextInt(3) + 1;
    }
    
    public static void fight(Pokemon a, Pokemon b){
        if(a.getSpeed()<b.getSpeed()){
            Pokemon temp = a;
            a = b;
            b = temp;
        }
        else if(a.getSpeed()==b.getSpeed()){
            Random r = new Random();
            int num = r.nextInt(2);
            if(num==0){
                Pokemon temp = a;
                a = b;
                b = temp;
            } 
        }
        b.setHitPoint(b.getHitPoint() - a.getAttack() + b.getDefense());
    }
    
    @Override
    public String toString(){
        return "ID: " + ID +
                "\nName: " + Name +
                "\nElement Type: " + ElementType +
                "\nHit Point: " + HitPoint +
                "\tAttack: " + Attack +
                "\tDefense: " + Defense +
                "\nSpeed: " + Speed +
                "\nSpecial: " + Special +
                "\nLevel: " + Level;
    }
}
