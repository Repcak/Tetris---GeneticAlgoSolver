package TetrisGA;
import java.util.Random;

/**
 static int  populationSize=200;
 static int  topChroms=populationSize/20;
 static int  numberOfGames=8;
 static int  mutationRate=4;
 *-2.841884818353364 90.33398858013996 -86.29884523976246 -17.97583422646018 -3.496915438232847 131400.0 (srednia z 8)
 *-2.841884818353364 51.59467426822829 -98.14822271815042 -17.97583422646018 -3.496915438232847 89262.5
 *-2.841884818353364 90.33398858013996 -86.29884523976246 -17.97583422646018 -3.496915438232847 121100.0
 * -2.841884818353364 51.51154554636767 -86.29884523976246 -17.97583422646018 -3.496915438232847 95100.0
 */
public class geneticOperations {
    static int mutations=0;
    static int  populationSize=200;
    static int  topChroms=populationSize/20;
    static int  numberOfGames=8;
    static int  mutationRate=4;
    static int numberOfGenerations=10;
    static int currentGeneration = 1;
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
            if(rand.nextInt()==0){
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
            System.out.println("MUTATIONS: "+mutations);
            mutations=0;
        for(int i=0; i<topChroms;i++){
                System.out.println(" Chromosome Number: "+i);

                for(int j=0; j<6;j++){
                    System.out.print(" "+ bestChromies[i][j]);
                }
                System.out.println();
            }
        System.out.println();
        System.out.println("============== Nowa populacja stworzona ==============");
        System.out.println("============== Nowa populacja stworzona ==============");
        currentGeneration++;
        System.out.println("GENERATION NR: " + currentGeneration);

        /*
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
    }
}
