import java.util.*;

public class masterMind {
  public static void main() {
    Scanner console = new Scanner(System.in);
    String secret_code[] = {"B", "K", "K", "G"};
    for(int turn = 0; turn < 10; turn++) {

      String guessArray[] = {"","","",""};
      String XOArray[] = {"","","",""};
      
      for(int guess_input = 0; guess_input < guessArray.length; guess_input++) {
        System.out.print("color number " + (guess_input+1) + ": ");
        guessArray[guess_input] = console.next();
      }
      
      for(int code = 0; code < secret_code.length; code++) {
        String tempDet = "";
        int tempVar = -1;
        boolean breaks = false;
        for(int guess = 0; guess < guessArray.length; guess++) {
          if(secret_code[code].equalsIgnoreCase(guessArray[guess])) {
            if ((XOArray[guess].equalsIgnoreCase("X") || XOArray[guess].equalsIgnoreCase("O"))){
              continue;
            }
            else {
              if (code == guess) {
                tempDet = "X";
                breaks = true;
                tempVar = guess;
                break;
              }
              else {
                tempDet = "O";
                tempVar = guess;
              }
            }
          }
        }
        if (tempVar != -1){
          XOArray[tempVar] = tempDet;
        }
        if (breaks) {
            break;
        }
      }
      System.out.println(Arrays.toString(guessArray));
      System.out.println(Arrays.toString(XOArray));
    }
  }
}