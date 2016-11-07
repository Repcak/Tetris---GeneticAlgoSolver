package TetrisGA;

/**
 * Created by Gwozdo on 11/6/2016.
 * This class generates new Tetromino, and returns it's array.
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
      //  System.out.println(index);
        createTet(s.charAt(index));
    }

// this method prints generated tetromino
    public static int[][] getTetArray(){
        for(int i=0;i<arrXSize;i++){
            for (int j=0;j<arrYSize;j++){
                System.out.print(tetArray[i][j]);
            } System.out.println();
        }

        return tetArray;

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
