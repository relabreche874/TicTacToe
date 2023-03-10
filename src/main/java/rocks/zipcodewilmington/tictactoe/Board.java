package rocks.zipcodewilmington.tictactoe;

import java.lang.reflect.Array;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] oEx = new Character[3][3];

    public Board(Character[][] matrix) {
        oEx = matrix;

    }

    public Boolean isInFavorOfX() {
        for (int i = 0; i < oEx.length; i++) {
            if (oEx[i][0] == 'X' && oEx[i][1] == 'X' && oEx[i][2] == 'X') {
                return true;
            }
            if (oEx[0][i] == 'X' && oEx[1][i] == 'X' && oEx[2][i] == 'X') {
                return true;
            }
//            [1][0][1][1][1][2]
//            [2][0][2][1][2][2]
        }
        if ((oEx[1][1] == 'X' && oEx[0][0] == 'X' && oEx[2][2] == 'X') || (oEx[1][1] == 'X' && oEx[0][2] == 'X' && oEx[2][0] == 'X')) {
            return true;
        }

        return false;
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i < oEx.length; i++) {
            if (oEx[i][0] == 'O' && oEx[i][1] == 'O' && oEx[i][2] == 'O') {
                return true;
            }
            if (oEx[0][i] == 'O' && oEx[1][i] == 'O' && oEx[2][i] == 'O') {
                return true;
            }
//            [1][0][1][1][1][2]
//            [2][0][2][1][2][2]
        }
        if ((oEx[1][1] == 'O' && oEx[0][0] == 'O' && oEx[2][2] == 'O') || (oEx[1][1] == 'O' && oEx[0][2] == 'X' && oEx[2][0] == 'O')) {
            return true;
        }

        return false;
    }

    public Boolean isTie() {
        if (!isInFavorOfX() && !isInFavorOfO()) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (isInFavorOfX()) {
            return "X";
        }
        if(isInFavorOfO()) {
            return "O";
        } else {

            return "";
        }

    }
}
