/**
 * Created by script on 04.03.16.
 */
public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Playr playr = new Playr();
        Ship ship = new Ship(4);

        field.init();
        field.setShip(ship);

        System.out.println("Game start");

        do{
            field.show();
            int shoot = playr.getShoot();
            field.doShoot(shoot);
        }while (field.isNotGameOver());
    }
}
