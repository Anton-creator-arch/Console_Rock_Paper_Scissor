
import java.util.Scanner;
import java.util.Random;
public class FInal_RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choice={"rock","paper","scissor"};

       while(true){
                    //Computer Input
                    int CompchoiceIndex = random.nextInt(3);
                    String CompChoice = choice[CompchoiceIndex];
                    // User Input
                    System.out.println("Enter Your choice(rock, paper, scissor)");
                    String UserChoice = scanner.next().toLowerCase();
                    if(UserChoice.equals("rock") || UserChoice.equals("paper") || UserChoice.equals("scissor")){
                        System.out.println("The computer's choice is "+ CompChoice);
                        if (UserChoice.equals(CompChoice)){
                            System.out.println("It is Tied");
                        }
                        else if ((UserChoice.equals("rock") && CompChoice.equals("scissor")) ||
                                (UserChoice.equals("paper") && CompChoice.equals("rock")) ||
                                (UserChoice.equals("scissor") && CompChoice.equals("paper"))){
                            System.out.println("You won");
                        }
                        else {
                            System.out.println("Computer Won");
                        }

                    }
                    else {
                        System.out.println("Invalid Input");
                    }
           System.out.println("Do You want to play another Game? (y/n)");
           String newgame = scanner.next().toLowerCase();

           if(!newgame.equals("y")){
               break;
           }
        }
        System.out.println("Thank your for Playing");
       scanner.close();
    }
}
