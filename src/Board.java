import org.javatuples.Ennead;

public class Board {

    public Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> getRow1() {
        return row1;
    }

    public Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> getRow2() {
        return row2;
    }

    public Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> getRow3() {
        return row3;
    }

    public Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> getRow4() {
        return row4;
    }

    public Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> getRow5() {
        return row5;
    }

    public Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> getRow6() {
        return row6;
    }

    public Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> getRow7() {
        return row7;
    }

    public Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> getRow8() {
        return row8;
    }

    public Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> getRow9() {
        return row9;
    }

    private Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row1;
    private Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row2;
    private Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row3;
    private Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row4;
    private Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row5;
    private Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row6;
    private Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row7;
    private Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row8;
    private Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> row9;

    public void setRow1(Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> row1) {
        this.row1 = row1;
    }

    public void setRow2(Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> row2) {
        this.row2 = row2;
    }

    public void setRow3(Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> row3) {
        this.row3 = row3;
    }

    public void setRow4(Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> row4) {
        this.row4 = row4;
    }

    public void setRow5(Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> row5) {
        this.row5 = row5;
    }

    public void setRow6(Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> row6) {
        this.row6 = row6;
    }

    public void setRow7(Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> row7) {
        this.row7 = row7;
    }

    public void setRow8(Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> row8) {
        this.row8 = row8;
    }

    public void setRow9(Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> row9) {
        this.row9 = row9;
    }

    public boolean rowHas(Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> rowNeeded, int checkNumber){

        /*
        if (rowNeeded.getValue0() == checkNumber){ return true;}
        if (rowNeeded.getValue1() == checkNumber){ return true;}
        if (rowNeeded.getValue2() == checkNumber){ return true;}
        if (rowNeeded.getValue3() == checkNumber){ return true;}
        if (rowNeeded.getValue4() == checkNumber){ return true;}
        if (rowNeeded.getValue5() == checkNumber){ return true;}
        if (rowNeeded.getValue6() == checkNumber){ return true;}
        if (rowNeeded.getValue7() == checkNumber){ return true;}
        if (rowNeeded.getValue8() == checkNumber){ return true;}*/
        return rowNeeded.contains(checkNumber);
        //return false;
    }

    public boolean colHas(int colNeeded, int checkNumber){

        switch(colNeeded){
            case 1:
                if (row1.getValue0() == checkNumber) {return true;}
                if (row2.getValue0() == checkNumber) {return true;}
                if (row3.getValue0() == checkNumber) {return true;}
                if (row4.getValue0() == checkNumber) {return true;}
                if (row5.getValue0() == checkNumber) {return true;}
                if (row6.getValue0() == checkNumber) {return true;}
                if (row7.getValue0() == checkNumber) {return true;}
                if (row8.getValue0() == checkNumber) {return true;}
                if (row9.getValue0() == checkNumber) {return true;}
                break;
            case 2:
                if (row1.getValue1() == checkNumber) {return true;}
                if (row2.getValue1() == checkNumber) {return true;}
                if (row3.getValue1() == checkNumber) {return true;}
                if (row4.getValue1() == checkNumber) {return true;}
                if (row5.getValue1() == checkNumber) {return true;}
                if (row6.getValue1() == checkNumber) {return true;}
                if (row7.getValue1() == checkNumber) {return true;}
                if (row8.getValue1() == checkNumber) {return true;}
                if (row9.getValue1() == checkNumber) {return true;}
                break;
            case 3:
                if (row1.getValue2() == checkNumber) {return true;}
                if (row2.getValue2() == checkNumber) {return true;}
                if (row3.getValue2() == checkNumber) {return true;}
                if (row4.getValue2() == checkNumber) {return true;}
                if (row5.getValue2() == checkNumber) {return true;}
                if (row6.getValue2() == checkNumber) {return true;}
                if (row7.getValue2() == checkNumber) {return true;}
                if (row8.getValue2() == checkNumber) {return true;}
                if (row9.getValue2() == checkNumber) {return true;}
                break;
            case 4:
                if (row1.getValue3() == checkNumber) {return true;}
                if (row2.getValue3() == checkNumber) {return true;}
                if (row3.getValue3() == checkNumber) {return true;}
                if (row4.getValue3() == checkNumber) {return true;}
                if (row5.getValue3() == checkNumber) {return true;}
                if (row6.getValue3() == checkNumber) {return true;}
                if (row7.getValue3() == checkNumber) {return true;}
                if (row8.getValue3() == checkNumber) {return true;}
                if (row9.getValue3() == checkNumber) {return true;}
                break;
            case 5:
                if (row1.getValue4() == checkNumber) {return true;}
                if (row2.getValue4() == checkNumber) {return true;}
                if (row3.getValue4() == checkNumber) {return true;}
                if (row4.getValue4() == checkNumber) {return true;}
                if (row5.getValue4() == checkNumber) {return true;}
                if (row6.getValue4() == checkNumber) {return true;}
                if (row7.getValue4() == checkNumber) {return true;}
                if (row8.getValue4() == checkNumber) {return true;}
                if (row9.getValue4() == checkNumber) {return true;}
                break;
            case 6:
                if (row1.getValue5() == checkNumber) {return true;}
                if (row2.getValue5() == checkNumber) {return true;}
                if (row3.getValue5() == checkNumber) {return true;}
                if (row4.getValue5() == checkNumber) {return true;}
                if (row5.getValue5() == checkNumber) {return true;}
                if (row6.getValue5() == checkNumber) {return true;}
                if (row7.getValue5() == checkNumber) {return true;}
                if (row8.getValue5() == checkNumber) {return true;}
                if (row9.getValue5() == checkNumber) {return true;}
                break;
            case 7:
                if (row1.getValue6() == checkNumber) {return true;}
                if (row2.getValue6() == checkNumber) {return true;}
                if (row3.getValue6() == checkNumber) {return true;}
                if (row4.getValue6() == checkNumber) {return true;}
                if (row5.getValue6() == checkNumber) {return true;}
                if (row6.getValue6() == checkNumber) {return true;}
                if (row7.getValue6() == checkNumber) {return true;}
                if (row8.getValue6() == checkNumber) {return true;}
                if (row9.getValue6() == checkNumber) {return true;}
                break;
            case 8:
                if (row1.getValue7() == checkNumber) {return true;}
                if (row2.getValue7() == checkNumber) {return true;}
                if (row3.getValue7() == checkNumber) {return true;}
                if (row4.getValue7() == checkNumber) {return true;}
                if (row5.getValue7() == checkNumber) {return true;}
                if (row6.getValue7() == checkNumber) {return true;}
                if (row7.getValue7() == checkNumber) {return true;}
                if (row8.getValue7() == checkNumber) {return true;}
                if (row9.getValue7() == checkNumber) {return true;}
                break;
            case 9:
                if (row1.getValue8() == checkNumber) {return true;}
                if (row2.getValue8() == checkNumber) {return true;}
                if (row3.getValue8() == checkNumber) {return true;}
                if (row4.getValue8() == checkNumber) {return true;}
                if (row5.getValue8() == checkNumber) {return true;}
                if (row6.getValue8() == checkNumber) {return true;}
                if (row7.getValue8() == checkNumber) {return true;}
                if (row8.getValue8() == checkNumber) {return true;}
                if (row9.getValue8() == checkNumber) {return true;}
                break;
        }

        return false;
    }

    public boolean boxHas(int boxNeeded, int checkNumber){

        switch(boxNeeded){
            case 1:
                if (row1.getValue0() == checkNumber) {return true;}
                if (row1.getValue1() == checkNumber) {return true;}
                if (row1.getValue2() == checkNumber) {return true;}
                if (row2.getValue0() == checkNumber) {return true;}
                if (row2.getValue1() == checkNumber) {return true;}
                if (row2.getValue2() == checkNumber) {return true;}
                if (row3.getValue0() == checkNumber) {return true;}
                if (row3.getValue1() == checkNumber) {return true;}
                if (row3.getValue2() == checkNumber) {return true;}
                break;
            case 2:
                if (row1.getValue3() == checkNumber) {return true;}
                if (row1.getValue4() == checkNumber) {return true;}
                if (row1.getValue5() == checkNumber) {return true;}
                if (row2.getValue3() == checkNumber) {return true;}
                if (row2.getValue4() == checkNumber) {return true;}
                if (row2.getValue5() == checkNumber) {return true;}
                if (row3.getValue3() == checkNumber) {return true;}
                if (row3.getValue4() == checkNumber) {return true;}
                if (row3.getValue5() == checkNumber) {return true;}
                break;
            case 3:
                if (row1.getValue6() == checkNumber) {return true;}
                if (row1.getValue7() == checkNumber) {return true;}
                if (row1.getValue8() == checkNumber) {return true;}
                if (row2.getValue6() == checkNumber) {return true;}
                if (row2.getValue7() == checkNumber) {return true;}
                if (row2.getValue8() == checkNumber) {return true;}
                if (row3.getValue6() == checkNumber) {return true;}
                if (row3.getValue7() == checkNumber) {return true;}
                if (row3.getValue8() == checkNumber) {return true;}
                break;
            case 4:
                if (row4.getValue0() == checkNumber) {return true;}
                if (row4.getValue1() == checkNumber) {return true;}
                if (row4.getValue2() == checkNumber) {return true;}
                if (row5.getValue0() == checkNumber) {return true;}
                if (row5.getValue1() == checkNumber) {return true;}
                if (row5.getValue2() == checkNumber) {return true;}
                if (row6.getValue0() == checkNumber) {return true;}
                if (row6.getValue1() == checkNumber) {return true;}
                if (row6.getValue2() == checkNumber) {return true;}
                break;
            case 5:
                if (row4.getValue3() == checkNumber) {return true;}
                if (row4.getValue4() == checkNumber) {return true;}
                if (row4.getValue5() == checkNumber) {return true;}
                if (row5.getValue3() == checkNumber) {return true;}
                if (row5.getValue4() == checkNumber) {return true;}
                if (row5.getValue5() == checkNumber) {return true;}
                if (row6.getValue3() == checkNumber) {return true;}
                if (row6.getValue4() == checkNumber) {return true;}
                if (row6.getValue5() == checkNumber) {return true;}
                break;
            case 6:
                if (row4.getValue6() == checkNumber) {return true;}
                if (row4.getValue7() == checkNumber) {return true;}
                if (row4.getValue8() == checkNumber) {return true;}
                if (row5.getValue6() == checkNumber) {return true;}
                if (row5.getValue7() == checkNumber) {return true;}
                if (row5.getValue8() == checkNumber) {return true;}
                if (row6.getValue6() == checkNumber) {return true;}
                if (row6.getValue7() == checkNumber) {return true;}
                if (row6.getValue8() == checkNumber) {return true;}
                break;
            case 7:
                if (row7.getValue0() == checkNumber) {return true;}
                if (row7.getValue1() == checkNumber) {return true;}
                if (row7.getValue2() == checkNumber) {return true;}
                if (row8.getValue0() == checkNumber) {return true;}
                if (row8.getValue1() == checkNumber) {return true;}
                if (row8.getValue2() == checkNumber) {return true;}
                if (row9.getValue0() == checkNumber) {return true;}
                if (row9.getValue1() == checkNumber) {return true;}
                if (row9.getValue2() == checkNumber) {return true;}
                break;
            case 8:
                if (row7.getValue3() == checkNumber) {return true;}
                if (row7.getValue4() == checkNumber) {return true;}
                if (row7.getValue5() == checkNumber) {return true;}
                if (row8.getValue3() == checkNumber) {return true;}
                if (row8.getValue4() == checkNumber) {return true;}
                if (row8.getValue5() == checkNumber) {return true;}
                if (row9.getValue3() == checkNumber) {return true;}
                if (row9.getValue4() == checkNumber) {return true;}
                if (row9.getValue5() == checkNumber) {return true;}
                break;
            case 9:
                if (row7.getValue6() == checkNumber) {return true;}
                if (row7.getValue7() == checkNumber) {return true;}
                if (row7.getValue8() == checkNumber) {return true;}
                if (row8.getValue6() == checkNumber) {return true;}
                if (row8.getValue7() == checkNumber) {return true;}
                if (row8.getValue8() == checkNumber) {return true;}
                if (row9.getValue6() == checkNumber) {return true;}
                if (row9.getValue7() == checkNumber) {return true;}
                if (row9.getValue8() == checkNumber) {return true;}
                break;
        }

        return false;
    }

    public void solve(){
        row1.contains(0);
    }

}

