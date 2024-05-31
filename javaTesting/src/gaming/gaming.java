package gaming;
import java.util.Scanner; 
import java.util.Random;

public class gaming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random r = new Random();
        int Player = 0;
        int bingo = r.nextInt(2,99);
        int Lower = 1,Higher = 100;

        while(Player != bingo){
        System.out.println(Lower +" to " + Higher);

        Player = scanner.nextInt();
        if(Player <  bingo &&  Player > Lower){
            Lower = Player;
        }else if(Player >  bingo && Player < Higher){
            Higher = Player;
        }else if(Player == Lower || Player == Higher){
            System.out.println("????");
        }
        if( Player < Lower){
            System.out.println("Player < Lower");
        }else if( Player > Higher ){
            System.out.println("Player > Higher");
        }
        } 
        System.out.println("BINGO!!");
        scanner.close();
    }
}
