// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class AttackStatCalculator {
    public static void main(String[] args) {
        int userInput = 500;//change when you want
        double[][][] a = new double[6][6][3000]; //a[x1,x2,y] here is after x1 attack and x2 element attack rolls, the count of landing on each element attack value
        a[0][0][52+69] = 1;//assuming the gear has both attack and element before rolling
        
        for (int i1=0;i1<=5;i1++){
        for (int i2=0;i2<=5-i1;i2++){
            for (int j=0;j<2000;j++){
                if (i1-1 >=0){
                for (int k=93;k<=234;k++){ //min max for flat attack
                    a[i1][i2][j+k]=a[i1][i2][j+k]+a[i1-1][i2][j];
                }
                }
                if (i2-1 >=0){
                for (int k=125;k<=312;k++){ //min max for element attack
                    a[i1][i2][j+k]=a[i1][i2][j+k]+a[i1][i2-1][j];
                }
                }
            }
        }
        }
        double[][] total = new double[6][6];
        double[][] aboveUser = new double[6][6];
     
        for (int i1=0;i1<=5;i1++){
        for (int i2=0;i2<=5-i1;i2++){
         total[i1][i2] =0;
         aboveUser[i1][i2] =0;
         for (int j=0;j<2000;j++){
             total[i1][i2] = total[i1][i2] + a[i1][i2][j];
             if (j>=userInput){
                 aboveUser[i1][i2] = aboveUser[i1][i2] + a[i1][i2][j];
             }
         }
        }
        }
        
        for (int i1=0;i1<=5;i1++){
        for (int i2=0;i2<=5-i1;i2++){
         System.out.println("Chance for crit above " + userInput + " after rolling attack " + i1 +" times and rolling element attack "+ i2+ " times is " + aboveUser[i1][i2]/total[i1][i2]);
        }
        }
        
    }
}
