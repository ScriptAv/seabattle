/**
 * Created by script on 04.03.16.
 */
public class Field {
    final int SIZE = 10;
    char[] cells = new char[SIZE];
    Ship ship;

    void init(){
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
    }

    void setShip(Ship ship){
        this.ship = ship;
        cells[ship.position] = 'x';
    }

    void doShoot(int shoot){
        switch (cells[shoot]){
            case '.':
                System.out.println("промох");
                cells[shoot] = '*';
                break;
            case 'x':
                System.out.println("Супер! Корабль потоплен");
                cells[shoot] = '-';
                System.out.println(cells);
                break;
            case '*':
                System.out.println("Уже стрелял");
                break;
            default:
                System.out.println("ERROR");
        }
    }

    void show(){
        System.out.println(cells);
    }

    boolean isNotGameOver(){
        return cells[ship.position] == 'x';
    }
}
