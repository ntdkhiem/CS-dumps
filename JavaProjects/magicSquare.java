import java.util.*;
public class magicSquare
{
    public static final int size = 5;
    public static void main () {
        int board[][] = new int[size][size];
        int k = 2;
        int row = 0;
        int col = size/2;
        if (size % 2 == 0) {
            System.out.println("Please only use odd number for size");
        }else{
            board[0][(int) size/2] = 1;
            while (k != size*size+1) {
                if(row == 0 && col < size) {
                    col++;
                    row = size - 1;
                }
                else if (row == 0 && (col + 1) > size - 1) {
                    row++;
                }
                else if (row != 0) {
                    row--;
                    col++;
                }
                if (col == size) {
                    col = 0;
                }
                if (board[row][col] != 0) {
                    if (row == size - 1) {
                        row = 1;
                        col = size -1;
                    }
                    else {
                        row+= 2;
                        col--;
                    }
                }
                board[row][col] = k;
                k++;
                
            }
            for (int item[]: board) {
                System.out.println(Arrays.toString(item));
            }
            int sum = 0;
            for (int item: board[0]){
                sum += item;
            }
            System.out.println("Sum =  " + sum);
        }
    }
}
