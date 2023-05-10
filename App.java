public class App {
    public static void main(String[] args) throws Exception {
        // Static polymorphism pada class Hero
        Hero hero1 = new Hero();
        hero1.move(); 
        hero1.move("Alivia");
        Hero hero2 = new Fighter();
        hero2.move(); 

        // Static polymorphism pada class Enemy
        Enemy enemy1 = new Enemy();
        enemy1.move(); 
        enemy1.move(1);
        Enemy enemy2 = new Witch();
        enemy2.move(); 
        
        // Dynamic polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter
        Character character1 = new Hero();
        character1.move(); 
        Character character2 = new Enemy();
        character2.move(); 
        Character character3 = new Witch();
        character3.move(); 
        Character character4 = new Fighter();
        character4.move(); 
        
        // Dynamic polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter
        Character character5 = new Witch();
        character5.move(); 
        Hero hero3 = (Hero) character5;
        Fighter fighter1 = (Fighter) hero3;
        fighter1.move(); 
    }
}
