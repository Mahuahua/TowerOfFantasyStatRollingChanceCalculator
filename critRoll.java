class FindCritRolls{
    public static void main(String[] args) {
        int userInput = 3600;//change when you want
        double[][] a = new double[6][8000]; //a[x,y] here is after x crit rolls, the count of landing on each crit
        a[0][258] = 1;
        for (int i=1; i<=5; i++){
            for (int j=0;j<6105;j++){
                for (int k=468;k<=1169;k++){ //min max value for crit roll
                    a[i][j+k]=a[i][j+k]+a[i-1][j];
                }
            }
        }
        double[] total = new double[6];
        double[] aboveUser = new double[6];
        for (int i=0;i<=5;i++){
         total[i] =0;
         aboveUser[i] =0;
         for (int j=0;j<6105;j++){
             total[i] = total[i] + a[i][j];
             if (j>=userInput){
                 aboveUser[i] = aboveUser[i] + a[i][j];
             }
         }
        }
        double[] chanceOfXRollsOutOfFive = {0.24,0.396,0.264,0.088,0.0150, 0.001};
        double total_chance = 0;
        for (int i=0;i<=5;i++){
         System.out.println("Chance for crit above " + userInput + " after rolling crit " + i +" times is " + aboveUser[i]/total[i]);
            total_chance = total_chance + chanceOfXPulls[i]*aboveUser[i]/total[i];
        }
        
        System.out.println("Total chance is " + total_chance);
    }
}
