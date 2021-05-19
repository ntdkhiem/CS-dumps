import java.util.*;

public class LinkedIntList {
    private ListNode front;

    public LinkedIntList() {
        front=null;
    }

    public int size() {
        int count = 0;
        ListNode current = front;
        while(current != null) {
            current = current.next;
            count++;
        }

        return count;
    }

    public int get(int i) {
        return nodeAt(i).data;
    }

    public String toString() {
        if (front == null) return "[]";

        else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, front);
        }
        else {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(value, current.next);
        }
    }

    public void addSorted(int value) {
        if (front == null || front.data >= value) {
            front = new ListNode(value, front);
        } else {
            ListNode current = front;
            while (current.next != null && current.next.data < value) {
                current = current.next;
            }
            current.next = new ListNode(value, current.next);
        }
    }

    public void set(int index, int newVal) {
        ListNode current = nodeAt(index - 1);
        current.data = newVal;
    }

    public boolean isSorted() {
        ListNode current = front;
        //if (front == null) return true;
        while (current.next != null) {
            if (current.next.data > current.data) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    public int lastIndexOf(int value) {
        ListNode current = front; int index = 0; int lastIndex = -1;
        if (front == null) return -1;
        else {
            while (current.next != null) {
                if (current.data == value) {
                    lastIndex = index;
                }
                index++;
                current = current.next;
            }
            return lastIndex;
        }
    }

    public int min() {
        if(front == null) throw new NoSuchElementException();
        else {
            ListNode current = front;
            int min = front.data;
            while (current.next != null) {
                if (current.next.data < min) {
                    min = current.next.data;
                }
                current = current.next;
            }
            return min;
        }
    }

    public void setNewValues(int[] values) {
        ListNode newFront = null;
        for (int v: values) {
            if (newFront == null) {
                newFront = new ListNode(v);
            }
            else {
                ListNode current = newFront;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new ListNode(v);
            }
        }
        front = newFront;
    }

    public void compress() {
        if (front == null) {
            throw new NullPointerException();
        }
        ListNode current = front;
        ListNode current_next = null;
        
        while(current != null && current.next != null) {
            current_next = current.next;
            current.data += current_next.data;
            current.next = current_next.next;
            current = current.next;
        }
    }
    
    public void doubleList() {
        ListNode back = front;
        while (back.next != null) {
            back = back.next;
        }
        ListNode current = front;
        int size = size();
        for(int i = 0; i < size; i++) {
            back.next = new ListNode(current.data);
            back = back.next;
            current = current.next;
        }
    }
    
    public int countDuplicates() {
        ListNode current = front; 
        int totalCons = 0; 
        int num = 0; 
        int cons = Integer.MIN_VALUE;
        while (current.next != null) {
            if (current.data == num) {
                cons++;
            }else {
                if (cons >= 1) {
                    totalCons++;
                }
                num = current.data;
                cons = 0;
            }
            current = current.next;
        }
        if (current.data == num && cons == 0) {
            totalCons++;
        }
        return totalCons;
    }
    
    public boolean hasTwoConsecutive() {
        if (front == null || size() <= 1) {
            return false;
        }
        ListNode current1 = front; 
        ListNode current2 = front.next;
        while (current2.next != null) {
            if (current2.data - 1 == current1.data) {
                return true;
            }
            current1 = current2;
            current2 = current2.next;
        }
        return false;
    }
    
    public int deleteBack() {
        ListNode current = front; int lastElement;
        if (front == null) throw new NoSuchElementException();
        int count = 0;
        while (current.next != null && count != size() - 2) {
            current = current.next;
            count++;
        }
        lastElement = current.next.data;
        current.next = null;
        return lastElement;
    }
    
    public void switchPairs() {
        ListNode current = front;
        while (current != null && current.next != null) {
            int value = current.data;
            current.data = current.next.data;
            current.next.data = value;
            current = current.next.next;
        }
    }
    /*
    public void split() {
        ListNode pre = null;
        ListNode current = front;
        ListNode d = front;
        while (current != null && current.next != null) {
            if (current.data < 0) {
                // base case
                pre.next = current.next;
                current.next = front;
                front = current;
            }
            else {
                pre = current;
                current = current.next;
            }
        }
    }
    */
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}
