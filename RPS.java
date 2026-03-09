import java.util.Scanner;

public class RPS {

    public static int randomNumber()
    {
        int randomNum = (int) (Math.random() * 3 ) + 1;
        System.out.println("The choice Computer entered : ");
        if (randomNum == 1)
        {
            System.out.println("Rock");
        }
        else if (randomNum == 2)
        {
            System.out.println("Paper");
        }
        else if (randomNum == 3)
        {
            System.out.println("Scissors");
        }
        return randomNum;
    
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors\n 1. Rock\n 2. Paper\n 3. Scissors");
        System.out.println("Enter your Choice between 1-3: ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if (ch <= 3 && ch >= 1)
        {
            System.out.println("The choice Player entered : ");
            if (ch == 1)
            {
                System.out.println("Rock");
            }
            else if (ch == 2)
            {
                System.out.println("Paper");
            }
            else if (ch == 3)
            {
                System.out.println("Scissors");
            }

            int computerChoice = randomNumber();

            if (ch==1 && computerChoice==3)
            {
                System.out.println("Player win ! (Rock Win)");
            }
            else if (ch==2 && computerChoice==3)
            {
                System.out.println("Computer Win ! (Scissors Win)");
            }
            else if (ch==2 && computerChoice==1)
            {
                System.out.println("Player Win ! (Paper Win)");
            }
            else if (ch==1 && computerChoice==2)
            {
                System.out.println("Computer Win ! (Paper Win)");
            }
            else if (ch==3 && computerChoice==2)
            {
                System.out.println("Player Win ! (Scissors Win)");
            }
            else if (ch==3 && computerChoice==1)
            {
                System.out.println("Computer Win ! (Rock Win)");
            }
            else if (ch == computerChoice)
            {
                System.out.println("Draw !");
            }
            System.out.println("Want to play again (Y--Yes) or (N--No) : ");
            char YN = sc.next().charAt(0);
            if (YN == 'Y')
            {
                main(args);
            }
            
        }
        else 
        {
            System.out.println("Invalid choice");
        }
        

        sc.close();
    }
}