public class Hero extends Character{
    public void move(){
        System.out.println("Hero yang bergerak");
    }
    public void move(String direction){
        System.out.println("Hero yang bergerak dengan parameter " + direction);
    }
}
