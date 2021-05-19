import java.util.*;
import java.awt.*;
public class FindStringChallenge
{
    public static void main() {
        String s = "AABCDE";
        // char M[][] = {
        //     {'A','B','A','A'},
        //     {'B','C','D','A'},
        //     {'A','B','C','D'},
        //     {'E','E','A','B'},
        // };
        // System.out.println(findString(M, s));

        char M2[][] = {
          {'A','B','A','A'},
          {'B','C','D','A'},
          {'A','B','C','B'},
          {'E','X','D','Z'},
          {'A','B','A','A'},
          {'B','C','D','A'},
          {'E','D','C','B'},
          {'E','X','D','Z'}
        };
        System.out.println(findStringC(M2, s));
    }
    
    public static ArrayList<Point> findString(char m[][], String s) {
        ArrayList<Point> coords = new ArrayList<Point>();
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                int r2 = row;
                int col2 = col;
                int count = 0;
                while (m[r2][col2] == s.charAt(count)) {
                    count++;
                    coords.add(new Point(r2, col2));
                    col2++;
                    if (col2 >= m[r2].length) {
                        col2 = 0;
                        r2++;
                    }
                    if (count == s.length()) {
                        return coords;
                    }
                }
                coords.clear();
            }   
        }
        return coords;
    }

  public static ArrayList<Point> findStringC(char m[][], String s) {
    ArrayList<Point> coords = new ArrayList<Point>();
    for (int row = 0; row < m.length; row++) {
      for (int col = 0; col < m[row].length; col++) {
        int count = 0;
        System.out.println("row = " + row + "\tcol = " + col + "\tcount = " + count);
        if(explore(m, s, coords, row, col, count)) {
          return coords;
        }
        coords.clear();
      }
    }
    return coords;
  }

  private static boolean explore(char[][] board, String str, ArrayList<Point> coords, int r_coord, int c_coord, int count) {
    if (count == str.length()) {
      return true;
    }
    // System.out.println("row = " + r_coord + "\tcol = " + c_coord + "\tcount = " + count);
    if (board[r_coord][c_coord] == str.charAt(count)) {
      System.out.println("MATCH! Character = " + str.charAt(count) + "\tGiven term = " + board[r_coord][c_coord]);
      coords.add(new Point(r_coord, c_coord));
      count++;
      for (int i = 0; i < 4; i++) {
        switch(i) {
          case 0:   // go right
            c_coord += 1;
            System.out.println("GO RIGHT");
            break;
          case 1:   // go left
            c_coord -= 2;
            System.out.println("GO LEFT");
            break;
          case 2:   // go up
            c_coord += 1;
            r_coord -= 1;
            System.out.println("GO UP");
            break;
          case 3:   // go down
            r_coord += 2;
            System.out.println("GO DOWN");
            break;
        }
        if (isInbound(board, r_coord, c_coord)) {
          //System.out.println("row = " + r_coord + "\tcol = " + c_coord + "\tcount = " + count);
          if (explore(board, str, coords, r_coord, c_coord, count)) {
            return true;
          }
        }
      }
    }
    System.out.println("Do not match = " + board[r_coord][c_coord] + "( " + r_coord + "," + c_coord + " )" + "    Expected = " + str.charAt(count) + "   count = " + count);
    return false;
  }

  private static boolean isInbound(char[][] board, int r_coord, int c_coord){
    if (r_coord == board.length) {
      System.out.println("+row is out of index: " + r_coord);
      return false;
    }
    else if (r_coord < 0) {
      System.out.println("-row is out the index:" + r_coord);
      return false;
    }
    else if (c_coord == board[r_coord].length) {
      System.out.println("+col is out the index:" + c_coord);
      return false; 
    }
    else if (c_coord < 0) {
      System.out.println("-col is out the index:" + c_coord);
      return false;
    }
    System.out.println("SAFE! row and col are in the index:" + r_coord + "," + c_coord);
    return true;
  }
}

// private static boolean explore(a scenario) { 
//   if (this is a solution) { 
//     report it. 
//     return true; 
//   } else {
//     for (each available choice) { 
//       if (this is not a dead-end) {
//         make the choice. 
//         if (recursive call to explore subsequent choices) { 
//           return true;
//       } 
//       undo the choice.
//     }
//   } 
//     return false;
//   }
// }