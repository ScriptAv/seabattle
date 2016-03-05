import java.util.Scanner;
/**
 * Created by script on 04.03.16.
 */
public class Playr {
    int getShoot(){
        System.out.println("Куда стрелять?");
        Scanner sca = new Scanner(System.in);
        String s;
        s = sca.nextLine();
        System.out.printf("вы ввели: %s\n", s);
        int shoot = Integer.parseInt(s);
        return shoot;
    }
}
