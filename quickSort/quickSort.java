public class quickSort {
  public static void main() {
    int[] list = {37, 2, 6, 4, 89, 8, 10, 12, 68, 45};
    quickSort(list, 0, list.length - 1);
    printArray(list);
  }

  public static void quickSort(int[] lst, int startSubScript, int endSubScript) {
    if (endSubScript - startSubScript <= 1) {
      System.out.println("Done");
    }
    else {
      int finalIndex = partition(lst, startSubScript, endSubScript);
      // Left side
      quickSort(lst, startSubScript, finalIndex - 1);
      // Right side
      quickSort(lst, finalIndex + 1, endSubScript);
    }
  }

  private static int partition(int[] lst, int begin, int end) {
    int element = lst[begin];
    int elementIndex = begin;
    boolean isSorted = false;
    int temp = -1;
    while(!isSorted) {
      printArray(lst);
      for (int indexA = end; indexA > begin; indexA--) {
        if (lst[indexA] < element) {
          temp = lst[indexA];
          lst[indexA] = lst[elementIndex];
          lst[elementIndex] = temp;
          begin = elementIndex + 1;
          end = indexA;
          elementIndex = indexA;
          break;
        }
      }
      for (int indexB = begin; indexB <= end; indexB++) {
        if (lst[indexB] == element && indexB == end) {
          isSorted = true;
          break; // final location
        }
        else {
          if (lst[indexB] > element) {
            temp = lst[indexB];
            lst[indexB] = lst[elementIndex];
            lst[elementIndex] = temp;
            end = elementIndex - 1;
            begin = indexB;
            elementIndex = indexB;
            break;
          }
        }
      }
    }
    return elementIndex;
  }

  private static void swap(int[] list, int num1, int num2) {
    int temp = list[num1];
    list[num1] = list[num2];
    list[num2] = temp;
  }
  
  private static void printArray(int[] list) {
      for (int item : list) {
          System.out.print(item + ", ");
      }
      System.out.println();
  }
}