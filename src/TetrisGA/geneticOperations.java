package TetrisGA;
import java.util.Random;

/**
 * Created by Gwozdo on 1/24/2017.
 *  chromosome number 0
 -75.66979538303255 -8.479692280119025 15.96974094835113 -51.370663944626685 -4.958834537017708 6260.0
 chromosome number 1
 -5.154509321932821 -10.31852845910457 7.4045350076401775 -83.45212688080841 -9.242659135553154 5160.0
 chromosome number 2
 99.96998324451468 -28.029326778907702 15.143345542321214 -47.581846716077195 -5.611067800970375 4400.0
 chromosome number 3
 -57.65980424176882 -11.499580240478906 32.52629016928904 -96.4134615813999 -11.300743318982384 3480.0
 chromosome number 4
 44.67830589536871 -93.77553108491409 82.43690680214718 -35.08360679160522 -15.66321978489718 3080.0
 chromosome number 5
 27.870719390117983 -14.522773343347666 94.2150861080666 -88.41155164450603 -22.295230602838558 2640.0
 *
 *
 *  chromosome number 0
 6.279343585339944 -1.4944155033086162 40.18632172226137 -63.16257486383252 -7.092619659423832 12660.0
 *
 *
 *
 */
public class geneticOperations {
    static int mutations=0;
    static int  populationSize=500;
    static int  topChroms=populationSize/20;
    static int  numberOfGames=3;
    static int  mutationRate=2;
    static int numberOfGenerations=10;
    static int maxScore=100000;
    static double[][] bestChromies = new double[populationSize/10][6];
    private static int cos;
    static int geneMax=100;
    static int geneMin=-100;
    // lista chromosomow
    public static double[][] chromosome = new double[populationSize][6];

    public static int currentChromosome=0;


    public static void getBestChromosomes(){
        int numberOfBestChromies = topChroms;
        int bestChromieIndex=0;
        double bestScore=0;

        for (int i=0;i<numberOfBestChromies;i++){
            bestChromieIndex=0;
            bestScore=0;
            for (int j=0;j<populationSize;j++) {

                if (chromosome[j][5] > bestScore) {
                    bestScore=chromosome[j][5];
                    for (int k=0;k<6;k++){
                        bestChromies[i][k]=chromosome[j][k];
                        bestChromieIndex=j;
                        }
                    }
                }

            chromosome[bestChromieIndex][5]=0;
            }

        }











    private static void crossOver(){
        double[] firstChromosome;
        double[] secondChromosome;
        int index;
        Random rand = new Random();

        index=rand.nextInt(topChroms);
        firstChromosome = bestChromies[index];
        index=rand.nextInt(topChroms);
        secondChromosome = bestChromies[index];

        for(int i=0;i<5;i++) {
            if (rand.nextInt()==0){
               chromosome[cos][i]=firstChromosome[i];

            }else{
                chromosome[cos][i]=secondChromosome[i];
            }

        }


        // MUTACJA
        for(int i=0;i<5;i++) {
            if (rand.nextInt(100)+1<=mutationRate){
                chromosome[cos][i]=chromosome[cos][i] = geneMin + (geneMax - geneMin) * rand.nextDouble();
                mutations++;
            }

        }



        chromosome[cos][5]=0;





    }


    public static void getNewPopulation(){




        getBestChromosomes();

          for (int i=0;i<populationSize;i++){
              cos=i;
              crossOver();
          }

            System.out.println(mutations);
        for(int i=0; i<topChroms;i++){
                System.out.println(" chromosome number "+i);
                for(int j=0; j<6;j++){
                    System.out.print(" "+ bestChromies[i][j]);
                }
                System.out.println();
            }




        System.out.println("Nowa populacja stworzona!!!!!!!!!");
        System.out.println("Nowa populacja stworzona!!!!!!!!!");
        System.out.println("Nowa populacja stworzona!!!!!!!!!");
        System.out.println("Nowa populacja stworzona!!!!!!!!!");
        System.out.println("Nowa populacja stworzona!!!!!!!!!");

        /*
         *

        for (int i=0; i<populationSize; i++) {
            System.out.print("chromosom nr: " + i );

            for (int j = 0; j < 6; j++) {
                System.out.print(" ; " + chromosome[i][j] );
                System.out.print(" ");
            }



            System.out.println();


        }
         */



    }







    public static void generateFirstPopulation(){
        int maxWeight= geneMax;
        int minWieght= geneMin;

        for (int i=0; i<populationSize; i++) {
            for (int j = 0; j < 6; j++) {

                Random rand = new Random();
                chromosome[i][j] = minWieght + (maxWeight - minWieght) * rand.nextDouble();
                if(j==5){chromosome[i][j]=0;}
            }

        }



        for (int i=0; i<populationSize; i++) {
            System.out.print("chromosom nr: " + i );

            for (int j = 0; j < 6; j++) {
                System.out.print(" ; " + chromosome[i][j] );
                System.out.print(" ");
            }



        System.out.println();

    }

}}
