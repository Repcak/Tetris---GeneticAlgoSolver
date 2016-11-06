package TetrisGA;

/**
 * Created by Gwozdo on 11/6/2016.
 */
import java.util.Random;
public class Tetromino {

    // tetArray contains tetromino's body representation
    private static int[][] tetArray = new int[4][4];
    private String s = "ZLTOI"; //char definitions of tetrominos


    public Tetromino(){
        Random random = new Random();
        int index = random.nextInt(s.length());
        System.out.println(index);
        createTet(s.charAt(index));
    }


    public static int[][] getTetArray(){
        return tetArray;


       /* for(int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(tetArray[i][j]);
            } System.out.println();
        }
        */

    }



    // this method creates tetromino
   private  void createTet(char a){
        if(a=='Z'){
            tetArray= new int[][]{  {0,1,1,0},
                                    {0,0,1,1},
                                    {0,0,0,0},
                                    {0,0,0,0}};

        }
        if(a=='L'){tetArray= new int[][]{   {0,1,0,0},
                                            {0,1,0,0},
                                            {0,1,1,0},
                                            {0,0,0,0}};}

        if(a=='T'){tetArray= new int[][]{   {0,1,1,1},
                                            {0,0,1,0},
                                            {0,0,0,0},
                                            {0,0,0,0}};}

        if(a=='O'){tetArray= new int[][]{    {0,1,1,0},
                                             {0,1,1,0},
                                             {0,0,0,0},
                                             {0,0,0,0}};}

        if(a=='I'){tetArray= new int[][]{   {0,1,0,0},
                                            {0,1,0,0},
                                            {0,1,0,0},
                                            {0,1,0,0}};}

    }










}
