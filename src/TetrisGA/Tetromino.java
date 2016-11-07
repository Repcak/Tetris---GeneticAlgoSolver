package TetrisGA;

/**
 * Created by Gwozdo on 11/6/2016.
 * This class generates new Tetromino, and returns it's array.
 *
 *Contains methods:
 *  -printTetArray  - prints tetromino in console
 *  -rotateTetromino - rotates teromino array
 *  -getTetArray - returns tetArray
 *  -createTet - generates new Tetromino
 *
 */
import java.util.Random;
public class Tetromino {

    // tetArray contains tetromino's body representation
    private static int[][] tetArray = new int[4][4];
    public static int arrXSize; // this value represents number of rows in newly generated tetromino
    public static int arrYSize; // -||- but columns
    private String s = "ZLTOI"; //char definitions of tetrominos

// this method generates random letter that is representing type of tetromino, and passes this value
    //to createTet method
    public Tetromino(){
        Random random = new Random();
        int index = random.nextInt(s.length());

        createTet(s.charAt(index));

    }

// this method prints generated tetromino using system.out
    private void printTetArray(){
        for(int i=0;i<arrXSize;i++){
            for (int j=0;j<arrYSize;j++){
                System.out.print(tetArray[i][j]);
            }System.out.println("");

        }System.out.println("");

    }

    // this method returns tetArray
    public static int[][] getTetArray(){


        return tetArray;

    }

    // This method rotates tetromino right
    public static int[][] rotateTetromino(int[][] array) {
        final int M = array.length;
        final int N = array[0].length;
        int[][] ret = new int[N][M];
        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                ret[c][M-1-r] = array[r][c];
            }
        }
        return ret;
    }

    // this method creates tetromino
   private  void createTet(char a){
        if(a=='Z'){
            tetArray= new int[][]{  {1,1,0},
                                    {0,1,1},
                                    {0,0,0}};
            arrYSize=3;
            arrXSize=3;
        }
        if(a=='L'){tetArray= new int[][]{   {1,0,0},
                                            {1,1,1},
                                            {0,0,0}};
            arrYSize=3;
            arrXSize=3;
        }

        if(a=='T'){tetArray= new int[][]{   {0,1,0},
                                            {1,1,1},
                                            {0,0,0}};
            arrYSize=3;
            arrXSize=3;}

        if(a=='O') {
            tetArray = new int[][]{  {1,1},
                                     {1,1}};
            arrYSize=2;
            arrXSize=2;
        }

        if(a=='I'){tetArray= new int[][]{   {0,0,0,0},
                                            {1,1,1,1},
                                            {0,0,0,0},
                                            {0,0,0,0}};
            arrYSize=4;
            arrXSize=4;
        }

    }










}
