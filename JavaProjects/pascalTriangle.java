import java.util.*;

class pascalTriangle{
  public static final int size = 5;
  public static void main() {
    method1(size);
    method2(size);
    method3(size);
    method4(size);
  }
  public static void method1(int size) {
    System.out.println("======================\tMethod 1\t======================");
    int array[][] = new int[size + 1][size*2 + 1];
    array[0][size] = 1;
    array[1][size-1] = 1;
    array[1][size+1] = 1;
    int startingPos = size - 2;
    int startingRow = 2;
    int valueTracker = 1;

    while(startingRow != size+1) {
      int tempStartingPos = startingPos;
      array[startingRow][tempStartingPos] = 1;
      for (int i = 0; i < valueTracker; i++) {
        tempStartingPos += 2;
        array[startingRow][tempStartingPos] = array[startingRow - 1][tempStartingPos - 1] + array[startingRow - 1][tempStartingPos + 1];
      }
      array[startingRow][tempStartingPos + 2] = 1;
      valueTracker++;
      startingPos--;
      startingRow++;
    }
    for (int items[]: array) {
      System.out.println(Arrays.toString(items));
    }
    System.out.println("\n");
  }
  public static void method2(int size) {
    System.out.println("======================\tMethod 2  ======================");
    int array[][] = new int[size+1][size+1];
    array[0][0] = 1;
    array[1][0] = 1;
    array[1][1] = 1;
    int startingRow = 2;
    int valueTracker = 1;
    while (startingRow != size + 1){ 
      array[startingRow][0] = 1;
      for (int i = 0; i < valueTracker; i++) {
        array[startingRow][i+1] = array[startingRow - 1][i] + array[startingRow - 1][i+1];
      }
      array[startingRow][valueTracker + 1] = 1;
      valueTracker++;
      startingRow++;
    }
    for (int items[]: array) {
      System.out.println(Arrays.toString(items));
    }
    for (int i = 0; i < size +1; i++) {
      for (int j = size; j > i; j--) {
        System.out.print(" ");
      }
      for(int j = 0; j < array[i].length; j++) {
        if (array[i][j] != 0){
          System.out.print(array[i][j]);
          System.out.print(" ");
        } 
      }
      System.out.println();
    }
    System.out.println("\n");
  }
  public static void method3(int size) {
    System.out.println("======================\tMethod 3  ======================");
    int array[][] = new int[size+1][(int)size/2+1];
    array[0][0] = 1;
    array[1][0] = 1;
    array[2][0] = 1;
    array[2][1] = 2;
    int startingRow = 3;
    int valueTracker = 1;
    while (startingRow != size +1) {
      array[startingRow][0] = 1;
      for(int i = 0; i < valueTracker; i++) {
        if (startingRow % 2 == 0) {
            if (i+1 == valueTracker) {
                array[startingRow][i+1] = array[startingRow - 1][i] + array[startingRow - 1][i];
            }
            else {
                array[startingRow][i+1] = array[startingRow - 1][i] + array[startingRow - 1][i+1];
            }
        }
        else {
            array[startingRow][i+1] = array[startingRow - 1][i] + array[startingRow - 1][i+1];
        }
      }
      if (startingRow % 2 != 0 ) {
        valueTracker++;
      }
      startingRow++;
    }
    for (int items[]: array) {
      System.out.println(Arrays.toString(items));
    }
    valueTracker = 0;
    for (int i = 0; i < size + 1; i++) {
      for (int j = size; j > i; j--) {
        System.out.print(" ");
      }
      if (i % 2 != 0) {
        for (int j = 0; j < array[i].length; j++) {
          if (array[i][j] != 0){
            System.out.print(array[i][j]);
            System.out.print(" ");
          }
          
        }
        for (int j = array[i].length - 1; j >= 0; j--) {
          if (array[i][j] != 0) {
            System.out.print(array[i][j]);
            System.out.print(" ");
          }
          
        }
      }
      else {
        for (int j = 0; j < array[i].length; j++) {
          if (array[i][j] != 0){
              System.out.print(array[i][j]);
              System.out.print(" ");
          }
        }
        for (int k = valueTracker; k >= 0; k--) {
          if (i != 0) {
            System.out.print(array[i][k]);
            System.out.print(" ");
          }
        }
        if (i != 0){
          valueTracker++;
        }
      }
      System.out.println();
    }
    System.out.println("\n");
  }
  public static void method4(int size) {
    System.out.println("======================\tMethod 4  ======================");
    int array[][] = new int[size-1][(int) size/2];
    array[0][0] = 2;
    int startingRow = 1;
    int valueTracker = 0;
    int firstValue = 3;
    while (startingRow != size-1){
      array[startingRow][0] = firstValue;
      for(int i = 0; i < valueTracker; i++) {
        if (startingRow % 2 == 0) {
          if (i + 1 == valueTracker) {
            array[startingRow][i+1] = array[startingRow-1][i] + array[startingRow - 1][i];
          }
          else {
            array[startingRow][i+1] = array[startingRow-1][i] + array[startingRow - 1][i+1];
          }
        }
        else {
          array[startingRow][i+1] = array[startingRow-1][i] + array[startingRow - 1][i+1];
        }
      }
      if (startingRow % 2 != 0) {
        valueTracker++;
      }
      firstValue++;
      startingRow++;
    }
    for (int items[]: array) {
      System.out.println(Arrays.toString(items));
    }
    valueTracker = 0;
    for (int i = -2; i < size - 1; i++) {
      for (int j = size; j > i; j--) {
        System.out.print(" ");
      }
      if (i == -2) {
        System.out.print("1");
      }
      else {
        System.out.print("1 ");
        if (i == -1) {
          System.out.print("1");
        }
        else {
          if (i % 2 != 0) {
            for (int j = 0; j < array[i].length; j++) {
              if (array[i][j] != 0){
                System.out.print(array[i][j]);
                System.out.print(" ");
              }
              
            }
            for (int j = array[i].length - 1; j >= 0; j--) {
              if (array[i][j] != 0) {
                System.out.print(array[i][j]);
                System.out.print(" ");
              }
            }
          }
          else {
            for (int j = 0; j < array[i].length; j++) {
              if (array[i][j] != 0){
                  System.out.print(array[i][j]);
                  System.out.print(" ");
              }
            }
            for (int k = valueTracker; k >= 0; k--) {
              if (i != 0) {
                System.out.print(array[i][k]);
                System.out.print(" ");
              }
            }
            if (i != 0){
              valueTracker++;
            }
          }
          System.out.print("1");
        }
      }
      System.out.println();
    }
    System.out.println("\n");
  }
}