package TetrisGA;

/**
 * Created by XXX on 02.11.2016.
 * This class contains arrays, that represent "map" of tetris tiles
 */

public class Tablica {
    public int rowCnt=BoardPanel.ROW_COUNT+1; // Y+1because of bottom border
    public int colCnt=BoardPanel.COL_COUNT+2; // X+2 because of side borders
    int[][] Tab = new int[colCnt][rowCnt];

    public Tablica() {

    // "creating" array borders. value of 1 is for botto tiles, value of 3 is for leftside and 5 for rightside
    for(int i=0;i<rowCnt ; i++){
        Tab[0][i]=3;
        Tab[rowCnt-1][i]=5;
    }
        for(int i=0;i<colCnt; i++){
            Tab[i][rowCnt-1]=1;

        }

    }



}
