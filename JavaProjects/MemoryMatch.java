import java.util.*;
public class MemoryMatch{
    public static void main(){

        memory(2);   
    }

    public static void memory(int size)
    {
        Scanner s = new Scanner(System.in);
        final int NUM_PAIRS =size;
        int card_left=8;
        int board[]={1,1,2,2,3,3,4,4}; //ignore the ZERO element spot
        boolean printElement[]=new boolean[9]; //defaulted all to 'false'
        int temp, position1, position2, i;

        int k=1;
        for(i=1;i<=NUM_PAIRS*2;i+=2){
            board[i]=k;
            board[i+1]=k;
            k++;
        }
        // //shuffle the board 1000 times
        // for(i=1;i<=1000;i++){
        //     position1= (int) (Math.random() * (board.length-1) +1 );
        //     position2= (int) (Math.random() * (board.length-1) +1 );
        //     temp= board[position1];
        //     board[position1]=board[position2];
        //     board[position2]=temp;
        // }
        int guess1=0,guess2=0;

        int players=0;
        boolean _continue=true;
        System.out.println(Arrays.toString(board));
        do{
            System.out.println("How many players would you like to play?");
            players= s.nextInt();
        }while(players<0);
        int round=0;
        int[] score= new int [players+1];
        int[] playerBoard= new int [players+1];
        while(card_left!=0){
            round++;
            for(i = 1; i <= players ; i++){

                System.out.println("Round "+round);
                _continue=true;
                do{
                    System.out.println("player "+i+", what is your first card?");
                    guess1=s.nextInt();
                    while(guess1<=0&&guess1>size*2){
                        System.out.println("Invalid input. Please enter a number that is greater than 0 and less than the " + size *2);
                    }
                    while(printElement[guess1]==true){
                        System.out.println("Invalid input, already chosen");
                        System.out.println("Player "+i+", what is your first card?");
                        guess1=s.nextInt();
                    }
                    printElement[guess1]=true;
                    printBoard(board,playerBoard,printElement);
                    System.out.println("Player "+i+", what is your second card?");
                    guess2=s.nextInt();
                    while(guess2<=0 && guess2 > size*2){
                        System.out.println("Invalid input. Please enter a number that is greater than 0 and less than the size*2");
                    }
                    while(printElement[guess2]==true){
                        System.out.println("Invalid input, already chosen");
                        System.out.println("Player "+i+", what is your second card?");
                        guess2=s.nextInt();
                    }
                    printElement[guess2]=true;
                    printBoard(board,playerBoard,printElement);
                    if(guess1==guess2){
                        System.out.println("TURN SKIPPED");
                        break;

                    }

                    if(board[guess1]!=board[guess2]){
                        System.out.println("Not a Pair!");
                        _continue=false;
                        printElement[guess1]=false;
                        printElement[guess2]=false;

                    }else {
                        card_left--;
                        playerBoard[i]++; 
                        System.out.println("card(s) left = "+ card_left);

                    }
                    printBoard(board,playerBoard,printElement);
                    if(card_left<=0){
                        break;}
                }while(_continue==true);

            }
            System.out.println("Round "+round+" terminated");

        }
        int max=-1;
        int winner=0,position=0;
        for(int z:playerBoard){
            max=Math.max(max,z);
            winner=position;
            position++;
        }
        System.out.println("The winner is player "+winner+" with a score of "+max);
    }

    public static void printBoard (int board[], int scoreCount[], boolean printElement[]){
        for (int i = 1; i < board.length; i++)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 1; i < printElement.length; i++)
        {
            if (!printElement[i])
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print(board[i] + "\t");
            }
        }
        System.out.println();
        for(int i=1;i<scoreCount.length;i++){
            System.out.println("Score of player "+i+" = "+scoreCount[i]);
        }
        System.out.println("*********************************************************");
    }
}


