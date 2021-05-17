import java.io.IOException;
import java.util.Scanner;
import org.javatuples.Ennead;



public class Main {

    public static void main(String[] args) throws IOException {

        Board board1 = new Board();

        Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row1 = Ennead.with(0,0,9,0,0,2,0,0,3);
        Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row2 = Ennead.with(0,0,6,4,1,0,5,0,0);
        Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row3 = Ennead.with(5,7,1,0,0,0,0,4,0);
        Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row4 = Ennead.with(0,5,0,2,0,6,0,0,8);
        Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row5 = Ennead.with(0,9,0,0,0,0,0,7,0);
        Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row6 = Ennead.with(6,0,0,7,0,3,0,2,0);
        Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row7 = Ennead.with(0,3,0,0,0,0,7,8,1);
        Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row8 = Ennead.with(0,0,2,0,3,4,6,0,0);
        Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row9 = Ennead.with(1,0,0,9,0,0,2,0,0);

        board1.setRow1(row1);
        board1.setRow2(row2);
        board1.setRow3(row3);
        board1.setRow4(row4);
        board1.setRow5(row5);
        board1.setRow6(row6);
        board1.setRow7(row7);
        board1.setRow8(row8);
        board1.setRow9(row9);

        System.out.println(board1.rowHas(board1.getRow1(),8));
        System.out.println(board1.boxHas(1,6));
        System.out.println(board1.colHas(4,4));


        int i = 0;
        while (i == 0) { // While loop for Scanner Inputs to accept commands from user

            boolean initialized = false;

            System.out.println("The program is ready and waiting for user command");

            Scanner myObj = new Scanner(System.in);

            myObj.useDelimiter("\\s");

            myObj.next(); //SELECT
            String string2 = myObj.next();
            switch (string2) {
                case "A.Col1,":

                    break;
                case "Exit":
                    i = 1;
                    break;
                default:
                    System.out.println("Sorry that is not a valid command. Please enter one of the commands from the practice sheet. If you would like to exit the program type 'EXIT'");
            }
        }
    }

}
