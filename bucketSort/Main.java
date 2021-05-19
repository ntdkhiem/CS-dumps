import java.util.*;
class Main {
  public static void main(String[] args) {
    int[] lst = {105,95,5, 201285, 39};
    bucketSort(lst);
  }

  public static void bucketSort(int[] lst) {
    int[] _list = lst;
    int[][] buckets = new int[10][_list.length];
    int largestNumber = lst[0];
    
    for (int i = 1; i < lst.length; i++) {
      if (lst[i] > largestNumber) {
        largestNumber = lst[i];
      }
    }

    int power = findPower(largestNumber);
    // loop through the power
    for (int i = 0; i < power; i++) {
      int exp = (int) Math.pow(10, i);
      // loop through items in _list
      for (int j = 0; j < _list.length; j++) {
        int first = (int) _list[j] / exp;
        int count = 0;
        // add to buckets list
        while (count != buckets[0].length-1) {
          System.out.println("count = " + count + "  first % 10 = " + (first % 10) );
          if (buckets[first % 10][count] == 0) {
            buckets[first % 10][count] = _list[j];
            break;
          }
          count++;
        }
      }
      int bucketsCount = 0;
      // add back to _list
      for (int row = 0; row < buckets.length; row++) {
        for (int col = 0; col < buckets[row].length; col++) {
          System.out.println("bucketsCount = " + bucketsCount);
          if (buckets[row][col] != 0) {
            System.out.println(buckets[row][col]);
            _list[bucketsCount] = buckets[row][col];
            buckets[row][col] = 0;
            bucketsCount++;
          }
        }
      }
      
    }
    for (int i = 0; i < _list.length; i++) {
        System.out.print(_list[i] + ", ");
    }
  } 

  public static int findPower(int max) {
    int power = 0;
    while (max != 0) {
      power++;
      max /= 10;
    }
    return power;
  }
}