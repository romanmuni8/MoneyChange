import java.util.Scanner;
// Coins are 1,5,10
public class Change {
    private static int getChange(int m) {
      int numberCoins =0;
      int amount = m;
      while(amount >0){
          if(amount >=10){
              numberCoins += amount/10;
              amount= amount%10;

          }
          if(amount>=5){
              numberCoins += amount/5;
              amount= amount%5;
          }
          numberCoins += amount;
          amount = 0;

      }



        return numberCoins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        System.out.println(getChange(m));

    }
}


