import java.awt.Point;
import java.util.ArrayList;

class GridProblem {
  public static void main() {
    boolean grid[][] = {{true,true, true, true, true, true, true, true, true},
                            {true,false,false,false,false,false,false,false,true},
                            {true,false,true, true, true, true, true, true, true},
                            {true,false,true, false,true, false,true, false,false},
                            {true,false,true, false,true, true, true, true, false},
                            {true,false,true, false,false,false,false,true, true},
                            {true,false,true, true, true, true, false,true, true},
                            {true,false,false,false,false,true, false,false,false},
                            {true,true, true, true, true, true, false,true, true}};
    boolean simpler[][] = {{true, true, true, true},
                           {true, false, false,false},
                           {true, false, true, true},
                           {true, false, false, true}
                          };
    
    alter(simpler);
    // expectation: (1,1), (1,2), (1,3), (2,1), (3,1), (3,2)
    
    // alter(grid);
  }

  public static void alter(boolean[][] grid) {
    ArrayList<Point> arraysOfCoords = new ArrayList<Point>();
    ArrayList<Point> arrayOfCoords = new ArrayList<Point>();
    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[row].length; col++) {
        if(explore(grid, arraysOfCoords, arrayOfCoords, row, col)) {
          // displayArrayOfCoords(arraysOfCoords);
          displayArrayOfCoords(arrayOfCoords);
        }
        arrayOfCoords.clear();
      }
    }
  }

  private static boolean explore(boolean[][] grid, ArrayList<Point> arraysOfCoords, ArrayList<Point> arrayOfCoords, int row, int col) {
     boolean coord = grid[row][col];
     Point coord_coordinate = new Point(row, col); 
     if (arrayOfCoords.contains(coord_coordinate)) {
       return false; // must return true
     }
     System.out.println("Current row = " + row + "\tcol = " + col);
     if (!coord) {
       System.out.println("FOUND matched value at ( " + row + ", " + col + " )");
       arrayOfCoords.add(new Point(row, col));
        for (int i = 0; i < 4; i++) {
          switch(i) {
            case 0:   // go right
              col += 1;
              System.out.println("GO RIGHT");
              break;
            case 1:   // go left
              col -= 2;
              System.out.println("GO LEFT");
              break;
            case 2:   // go up
              col += 1;
              row -= 1;
              System.out.println("GO UP");
              break;
            case 3:   // go down
              row += 2;
              System.out.println("GO DOWN");
              break;
          }
          if (isInbound(grid, row, col)) {
            if (explore(grid, arraysOfCoords, arrayOfCoords, row, col)) {
              return true;
            }
            // arrayOfCoords.remove(arrayOfCoords.size() - 1);
          }
        }
     }
     return false;
  }
  private static boolean isInbound(boolean[][] grid, int row, int col){
    if (row == grid.length) {
      System.out.println("+row is out of index: " + row);
      return false;
    }
    else if (row < 0) {
      System.out.println("-row is out the index:" + row);
      return false;
    }
    else if (col == grid[row].length) {
      System.out.println("+col is out the index:" + col);
      return false; 
    }
    else if (col < 0) {
      System.out.println("-col is out the index:" + col);
      return false;
    }
    System.out.println("SAFE! row and col are in the index:" + row + "," + col);
    return true;
  }
  private static void displayArrayOfCoords(ArrayList<Point> arrayOfCoords) {
    System.out.println(arrayOfCoords);
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