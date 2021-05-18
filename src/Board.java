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

    public boolean rowHas(int rowNeeded, int checkNumber){
        boolean answer = true;
        switch(rowNeeded){
            case 1:
                answer = row1.contains(checkNumber);
                break;
            case 2:
                answer = row2.contains(checkNumber);
                break;
            case 3:
                answer = row3.contains(checkNumber);
                break;
            case 4:
                answer = row4.contains(checkNumber);
                break;
            case 5:
                answer = row5.contains(checkNumber);
                break;
            case 6:
                answer = row6.contains(checkNumber);
                break;
            case 7:
                answer = row7.contains(checkNumber);
                break;
            case 8:
                answer = row8.contains(checkNumber);
                break;
            case 9:
                answer = row9.contains(checkNumber);
                break;
        }
        return answer;
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

    private Ennead<Integer, Integer, Integer, Integer,  Integer, Integer, Integer, Integer, Integer> savedRow1;

    public int rowPlaced;
    public int colPlaced;
    //public int firstTry;

    public boolean solve(){

        int checkCounter = 0;
        for (int checkRow = 1; checkRow < 2; checkRow++) {
            if (!rowHas(checkRow, 0)) {
                checkCounter++;
            }
        } // checks if there are any 0's left in rows
        if (checkCounter == 1){
            System.out.println(row1);
            System.out.println(row2);
            System.out.println(row3);
            System.out.println(row4);
            System.out.println(row5);
            System.out.println(row6);
            System.out.println(row7);
            System.out.println(row8);
            System.out.println(row9);
            return true;
        }// if there are no 0's left returns all of the rows in terminal


        for (int whatRow = 1; whatRow < 2; whatRow++) {
            int columnIndex = 0;
            int boxIndex = 0;
            while (rowHas(whatRow, 0 )) {
                switch(whatRow){
                    case 1:
                        columnIndex = row1.indexOf(0);
                        columnIndex++;
                        break;
                    case 2:
                        columnIndex = row2.indexOf(0);
                        columnIndex++;
                        break;
                    case 3:
                        columnIndex = row3.indexOf(0);
                        columnIndex++;
                        break;
                    case 4:
                        columnIndex = row4.indexOf(0);
                        columnIndex++;
                        break;
                    case 5:
                        columnIndex = row5.indexOf(0);
                        columnIndex++;
                        break;
                    case 6:
                        columnIndex = row6.indexOf(0);
                        columnIndex++;
                        break;
                    case 7:
                        columnIndex = row7.indexOf(0);
                        columnIndex++;
                        break;
                    case 8:
                        columnIndex = row8.indexOf(0);
                        columnIndex++;
                        break;
                    case 9:
                        columnIndex = row9.indexOf(0);
                        columnIndex++;
                        break;
                } // finds the column number
                switch(whatRow){
                    case 1:
                    case 2:
                    case 3:
                        switch (columnIndex){
                            case 1:
                            case 2:
                            case 3:
                                boxIndex = 1;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                boxIndex = 2;
                                break;
                            case 7:
                            case 8:
                            case 9:
                                boxIndex = 3;
                                break;
                        }
                        break;
                    case 4:
                    case 5:
                    case 6:
                        switch (columnIndex){
                            case 1:
                            case 2:
                            case 3:
                                boxIndex = 4;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                boxIndex = 5;
                                break;
                            case 7:
                            case 8:
                            case 9:
                                boxIndex = 6;
                                break;
                        }
                    case 7:
                    case 8:
                    case 9:
                        switch (columnIndex){
                            case 1:
                            case 2:
                            case 3:
                                boxIndex = 7;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                boxIndex = 8;
                                break;
                            case 7:
                            case 8:
                            case 9:
                                boxIndex = 9;
                                break;
                        }
                } // finds the box number

                for (int firstTry = 1; firstTry < 10;) {
                    if (!rowHas(whatRow, firstTry) && !colHas(columnIndex, firstTry) && !boxHas(boxIndex, firstTry)) {
                        System.out.println("Row: " + whatRow + " Column: " + columnIndex + " Box: " + boxIndex);
                        System.out.println("Try: " + firstTry);
                        System.out.println("xxxxxxxx");

                        switch (whatRow) {
                            case 1:
                                switch (columnIndex) {
                                    case 1:
                                        row1 = row1.setAt0(firstTry);
                                        break;
                                    case 2:
                                        row1 = row1.setAt1(firstTry);
                                        break;
                                    case 3:
                                        row1 = row1.setAt2(firstTry);
                                        break;
                                    case 4:
                                        row1 = row1.setAt3(firstTry);
                                        break;
                                    case 5:
                                        row1 = row1.setAt4(firstTry);
                                        break;
                                    case 6:
                                        row1 = row1.setAt5(firstTry);
                                        break;
                                    case 7:
                                        row1 = row1.setAt6(firstTry);
                                        break;
                                    case 8:
                                        row1 = row1.setAt7(firstTry);
                                        break;
                                    case 9:
                                        row1 = row1.setAt8(firstTry);
                                        break;
                                }
                                break;
                            case 2:
                                switch (columnIndex) {
                                    case 1:
                                        row2 = row2.setAt0(firstTry);
                                        break;
                                    case 2:
                                        row2 = row2.setAt1(firstTry);
                                        break;
                                    case 3:
                                        row2 = row2.setAt2(firstTry);
                                        break;
                                    case 4:
                                        row2 = row2.setAt3(firstTry);
                                        break;
                                    case 5:
                                        row2 = row2.setAt4(firstTry);
                                        break;
                                    case 6:
                                        row2 = row2.setAt5(firstTry);
                                        break;
                                    case 7:
                                        row2 = row2.setAt6(firstTry);
                                        break;
                                    case 8:
                                        row2 = row2.setAt7(firstTry);
                                        break;
                                    case 9:
                                        row2 = row2.setAt8(firstTry);
                                        break;
                                }
                                break;
                            case 3:
                                switch (columnIndex) {
                                    case 1:
                                        row3 = row3.setAt0(firstTry);
                                        break;
                                    case 2:
                                        row3 = row3.setAt1(firstTry);
                                        break;
                                    case 3:
                                        row3 = row3.setAt2(firstTry);
                                        break;
                                    case 4:
                                        row3 = row3.setAt3(firstTry);
                                        break;
                                    case 5:
                                        row3 = row3.setAt4(firstTry);
                                        break;
                                    case 6:
                                        row3 = row3.setAt5(firstTry);
                                        break;
                                    case 7:
                                        row3 = row3.setAt6(firstTry);
                                        break;
                                    case 8:
                                        row3 = row3.setAt7(firstTry);
                                        break;
                                    case 9:
                                        row3 = row3.setAt8(firstTry);
                                        break;
                                }
                                break;
                            case 4:
                                switch (columnIndex) {
                                    case 1:
                                        row4 = row4.setAt0(firstTry);
                                        break;
                                    case 2:
                                        row4 = row4.setAt1(firstTry);
                                        break;
                                    case 3:
                                        row4 = row4.setAt2(firstTry);
                                        break;
                                    case 4:
                                        row4 = row4.setAt3(firstTry);
                                        break;
                                    case 5:
                                        row4 = row4.setAt4(firstTry);
                                        break;
                                    case 6:
                                        row4 = row4.setAt5(firstTry);
                                        break;
                                    case 7:
                                        row4 = row4.setAt6(firstTry);
                                        break;
                                    case 8:
                                        row4 = row4.setAt7(firstTry);
                                        break;
                                    case 9:
                                        row4 = row4.setAt8(firstTry);
                                        break;
                                }
                                break;
                            case 5:
                                switch (columnIndex) {
                                    case 1:
                                        row5 = row5.setAt0(firstTry);
                                        break;
                                    case 2:
                                        row5 = row5.setAt1(firstTry);
                                        break;
                                    case 3:
                                        row5 = row5.setAt2(firstTry);
                                        break;
                                    case 4:
                                        row5 = row5.setAt3(firstTry);
                                        break;
                                    case 5:
                                        row5 = row5.setAt4(firstTry);
                                        break;
                                    case 6:
                                        row5 = row5.setAt5(firstTry);
                                        break;
                                    case 7:
                                        row5 = row5.setAt6(firstTry);
                                        break;
                                    case 8:
                                        row5 = row5.setAt7(firstTry);
                                        break;
                                    case 9:
                                        row5 = row5.setAt8(firstTry);
                                        break;
                                }
                                break;
                            case 6:
                                switch (columnIndex) {
                                    case 1:
                                        row6 = row6.setAt0(firstTry);
                                        break;
                                    case 2:
                                        row6 = row6.setAt1(firstTry);
                                        break;
                                    case 3:
                                        row6 = row6.setAt2(firstTry);
                                        break;
                                    case 4:
                                        row6 = row6.setAt3(firstTry);
                                        break;
                                    case 5:
                                        row6 = row6.setAt4(firstTry);
                                        break;
                                    case 6:
                                        row6 = row6.setAt5(firstTry);
                                        break;
                                    case 7:
                                        row6 = row6.setAt6(firstTry);
                                        break;
                                    case 8:
                                        row6 = row6.setAt7(firstTry);
                                        break;
                                    case 9:
                                        row6 = row6.setAt8(firstTry);
                                        break;
                                }
                                break;
                            case 7:
                                switch (columnIndex) {
                                    case 1:
                                        row7 = row7.setAt0(firstTry);
                                        break;
                                    case 2:
                                        row7 = row7.setAt1(firstTry);
                                        break;
                                    case 3:
                                        row7 = row7.setAt2(firstTry);
                                        break;
                                    case 4:
                                        row7 = row7.setAt3(firstTry);
                                        break;
                                    case 5:
                                        row7 = row7.setAt4(firstTry);
                                        break;
                                    case 6:
                                        row7 = row7.setAt5(firstTry);
                                        break;
                                    case 7:
                                        row7 = row7.setAt6(firstTry);
                                        break;
                                    case 8:
                                        row7 = row7.setAt7(firstTry);
                                        break;
                                    case 9:
                                        row7 = row7.setAt8(firstTry);
                                        break;
                                }
                                break;
                            case 8:
                                switch (columnIndex) {
                                    case 1:
                                        row8 = row8.setAt0(firstTry);
                                        break;
                                    case 2:
                                        row8 = row8.setAt1(firstTry);
                                        break;
                                    case 3:
                                        row8 = row8.setAt2(firstTry);
                                        break;
                                    case 4:
                                        row8 = row8.setAt3(firstTry);
                                        break;
                                    case 5:
                                        row8 = row8.setAt4(firstTry);
                                        break;
                                    case 6:
                                        row8 = row8.setAt5(firstTry);
                                        break;
                                    case 7:
                                        row8 = row8.setAt6(firstTry);
                                        break;
                                    case 8:
                                        row8 = row8.setAt7(firstTry);
                                        break;
                                    case 9:
                                        row8 = row8.setAt8(firstTry);
                                        break;
                                }
                                break;
                            case 9:
                                switch (columnIndex) {
                                    case 1:
                                        row9 = row9.setAt0(firstTry);
                                        break;
                                    case 2:
                                        row9 = row9.setAt1(firstTry);
                                        break;
                                    case 3:
                                        row9 = row9.setAt2(firstTry);
                                        break;
                                    case 4:
                                        row9 = row9.setAt3(firstTry);
                                        break;
                                    case 5:
                                        row9 = row9.setAt4(firstTry);
                                        break;
                                    case 6:
                                        row9 = row9.setAt5(firstTry);
                                        break;
                                    case 7:
                                        row9 = row9.setAt6(firstTry);
                                        break;
                                    case 8:
                                        row9 = row9.setAt7(firstTry);
                                        break;
                                    case 9:
                                        row9 = row9.setAt8(firstTry);
                                        break;
                                }
                                break;
                        } // adds numbers to rows
                        System.out.println(row1);
                        rowPlaced = whatRow;
                        colPlaced = columnIndex;
                    }
                    firstTry++;
                    if (solve()) {
                        System.out.println(row1);
                        return true;
                    } else {
                        switch (rowPlaced) {
                            case 1:
                                switch (colPlaced) {
                                    case 1:
                                        row1 = row1.setAt0(0);
                                        break;
                                    case 2:
                                        row1 = row1.setAt1(0);
                                        break;
                                    case 3:
                                        row1 = row1.setAt2(0);
                                        break;
                                    case 4:
                                        row1 = row1.setAt3(0);
                                        break;
                                    case 5:
                                        row1 = row1.setAt4(0);
                                        break;
                                    case 6:
                                        row1 = row1.setAt5(0);
                                        break;
                                    case 7:
                                        row1 = row1.setAt6(0);
                                        break;
                                    case 8:
                                        row1 = row1.setAt7(0);
                                        break;
                                    case 9:
                                        row1 = row1.setAt8(0);
                                        break;
                                }
                                break;
                            case 2:
                                switch (colPlaced) {
                                    case 1:
                                        row2 = row2.setAt0(0);
                                        break;
                                    case 2:
                                        row2 = row2.setAt1(0);
                                        break;
                                    case 3:
                                        row2 = row2.setAt2(0);
                                        break;
                                    case 4:
                                        row2 = row2.setAt3(0);
                                        break;
                                    case 5:
                                        row2 = row2.setAt4(0);
                                        break;
                                    case 6:
                                        row2 = row2.setAt5(0);
                                        break;
                                    case 7:
                                        row2 = row2.setAt6(0);
                                        break;
                                    case 8:
                                        row2 = row2.setAt7(0);
                                        break;
                                    case 9:
                                        row2 = row2.setAt8(0);
                                        break;
                                }
                                break;
                            case 3:
                                switch (colPlaced) {
                                    case 1:
                                        row3 = row3.setAt0(0);
                                        break;
                                    case 2:
                                        row3 = row3.setAt1(0);
                                        break;
                                    case 3:
                                        row3 = row3.setAt2(0);
                                        break;
                                    case 4:
                                        row3 = row3.setAt3(0);
                                        break;
                                    case 5:
                                        row3 = row3.setAt4(0);
                                        break;
                                    case 6:
                                        row3 = row3.setAt5(0);
                                        break;
                                    case 7:
                                        row3 = row3.setAt6(0);
                                        break;
                                    case 8:
                                        row3 = row3.setAt7(0);
                                        break;
                                    case 9:
                                        row3 = row3.setAt8(0);
                                        break;
                                }
                                break;
                            case 4:
                                switch (colPlaced) {
                                    case 1:
                                        row4 = row4.setAt0(0);
                                        break;
                                    case 2:
                                        row4 = row4.setAt1(0);
                                        break;
                                    case 3:
                                        row4 = row4.setAt2(0);
                                        break;
                                    case 4:
                                        row4 = row4.setAt3(0);
                                        break;
                                    case 5:
                                        row4 = row4.setAt4(0);
                                        break;
                                    case 6:
                                        row4 = row4.setAt5(0);
                                        break;
                                    case 7:
                                        row4 = row4.setAt6(0);
                                        break;
                                    case 8:
                                        row4 = row4.setAt7(0);
                                        break;
                                    case 9:
                                        row4 = row4.setAt8(0);
                                        break;
                                }
                                break;
                            case 5:
                                switch (colPlaced) {
                                    case 1:
                                        row5 = row5.setAt0(0);
                                        break;
                                    case 2:
                                        row5 = row5.setAt1(0);
                                        break;
                                    case 3:
                                        row5 = row5.setAt2(0);
                                        break;
                                    case 4:
                                        row5 = row5.setAt3(0);
                                        break;
                                    case 5:
                                        row5 = row5.setAt4(0);
                                        break;
                                    case 6:
                                        row5 = row5.setAt5(0);
                                        break;
                                    case 7:
                                        row5 = row5.setAt6(0);
                                        break;
                                    case 8:
                                        row5 = row5.setAt7(0);
                                        break;
                                    case 9:
                                        row5 = row5.setAt8(0);
                                        break;
                                }
                                break;
                            case 6:
                                switch (colPlaced) {
                                    case 1:
                                        row6 = row6.setAt0(0);
                                        break;
                                    case 2:
                                        row6 = row6.setAt1(0);
                                        break;
                                    case 3:
                                        row6 = row6.setAt2(0);
                                        break;
                                    case 4:
                                        row6 = row6.setAt3(0);
                                        break;
                                    case 5:
                                        row6 = row6.setAt4(0);
                                        break;
                                    case 6:
                                        row6 = row6.setAt5(0);
                                        break;
                                    case 7:
                                        row6 = row6.setAt6(0);
                                        break;
                                    case 8:
                                        row6 = row6.setAt7(0);
                                        break;
                                    case 9:
                                        row6 = row6.setAt8(0);
                                        break;
                                }
                                break;
                            case 7:
                                switch (colPlaced) {
                                    case 1:
                                        row7 = row7.setAt0(0);
                                        break;
                                    case 2:
                                        row7 = row7.setAt1(0);
                                        break;
                                    case 3:
                                        row7 = row7.setAt2(0);
                                        break;
                                    case 4:
                                        row7 = row7.setAt3(0);
                                        break;
                                    case 5:
                                        row7 = row7.setAt4(0);
                                        break;
                                    case 6:
                                        row7 = row7.setAt5(0);
                                        break;
                                    case 7:
                                        row7 = row7.setAt6(0);
                                        break;
                                    case 8:
                                        row7 = row7.setAt7(0);
                                        break;
                                    case 9:
                                        row7 = row7.setAt8(0);
                                        break;
                                }
                                break;
                            case 8:
                                switch (colPlaced) {
                                    case 1:
                                        row8 = row8.setAt0(0);
                                        break;
                                    case 2:
                                        row8 = row8.setAt1(0);
                                        break;
                                    case 3:
                                        row8 = row8.setAt2(0);
                                        break;
                                    case 4:
                                        row8 = row8.setAt3(0);
                                        break;
                                    case 5:
                                        row8 = row8.setAt4(0);
                                        break;
                                    case 6:
                                        row8 = row8.setAt5(0);
                                        break;
                                    case 7:
                                        row8 = row8.setAt6(0);
                                        break;
                                    case 8:
                                        row8 = row8.setAt7(0);
                                        break;
                                    case 9:
                                        row8 = row8.setAt8(0);
                                        break;
                                }
                                break;
                            case 9:
                                switch (colPlaced) {
                                    case 1:
                                        row9 = row9.setAt0(0);
                                        break;
                                    case 2:
                                        row9 = row9.setAt1(0);
                                        break;
                                    case 3:
                                        row9 = row9.setAt2(0);
                                        break;
                                    case 4:
                                        row9 = row9.setAt3(0);
                                        break;
                                    case 5:
                                        row9 = row9.setAt4(0);
                                        break;
                                    case 6:
                                        row9 = row9.setAt5(0);
                                        break;
                                    case 7:
                                        row9 = row9.setAt6(0);
                                        break;
                                    case 8:
                                        row9 = row9.setAt7(0);
                                        break;
                                    case 9:
                                        row9 = row9.setAt8(0);
                                        break;
                                }
                                break;
                        } // resets location to 0
                    }
                }
            }
        }
        return true;
    }

}

