package TetrisGA;

/**
 * Created by Gwozdo on 11/6/2016.
 */
import java.util.Random;
public class Tetromino {

    // tetArray contains tetromino's body representation
    private static int[][] tetArray = new int[4][4];
   private static int arrX;
    private static int arrY;
    private String s = "ZLTOI"; //char definitions of tetrominos


    public Tetromino(){
        Random random = new Random();
        int index = random.nextInt(s.length());
        System.out.println(index);
        createTet(s.charAt(index));
    }


    public static int[][] getTetArray(){



        for(int i=0;i<arrX;i++){
            for (int j=0;j<arrY;j++){
                System.out.print(tetArray[i][j]);
            } System.out.println();
        }

        return tetArray;
    }



    // this method creates tetromino
   private  void createTet(char a){
        if(a=='Z'){
            tetArray= new int[][]{  {1,1,0},
                                    {0,1,1}};
            arrY=3;
            arrX=2;
        }
        if(a=='L'){tetArray= new int[][]{   {1,0},
                                            {1,0},
                                            {1,1}};
            arrY=2;
            arrX=3;
        }

        if(a=='T'){tetArray= new int[][]{   {1,1,1},
                                            {0,1,0}};
            arrY=3;
            arrX=2;}

        if(a=='O') {
            tetArray = new int[][]{  {1,1},
                                     {1,1}};
            arrY=2;
            arrX=2;
        }

        if(a=='I'){tetArray= new int[][]{   {1},
                                            {1},
                                            {1},
                                            {1}};
            arrY=1;
            arrX=4;
        }

    }










}
