public class Enemy extends Character {
    public void move(){
        System.out.println("Enemy yang bergerak");
    }
    public void move(int step){
        System.out.println("Enemy yang bergerak dengan parameter " + step);
    }
}
