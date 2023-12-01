package yy3;
import java.util.Scanner;
public class number_5 {
    public static void main(String[] args) {
        int months = 12;
        int[]days=new int[]{31,29,31,30,31,30,31,31,30,31,30,31}; 
        int sales[][] =new int[months][31];
        int total=0,grandtotal=0;
        Scanner in=new Scanner(System.in);
        for (int i=0;i<months;i++){
            System.out.println("Enter daily sales for Month "+(i+1)+":");
            for (int j=0;j<days[i];j++){
                System.out.print("Day "+(j+1)+" : ");
                sales[i][j] = (int)(Math.random()*10);
                //sales[i][j] = in.nextDouble();
                System.out.println(sales[i][j]);
            }
            System.out.println("\n");
        }
        
        System.out.println("Monthly Sales:");
        for (int i=0;i<months;i++) {
            total=calculateTotalSales(sales[i]);
            System.out.println("Month " +(i+1)+": Total Sales = "+total);
            grandtotal+=total;
        }
        System.out.println("\n\nTotal sales in a year = "+grandtotal);
    }
    
    private static int calculateTotalSales(int[] dailySales) {
        int total=0;    
        for (int sales:dailySales) {
            total += sales;
        }
        return total;
    }
}
    
    

