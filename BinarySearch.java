package bsearch;

public class BinarySearching {
    
    
    public static int BinarySearch (int [] arr, int key) {
        
        int first = 0 ;
        int last = arr.length - 1;
        
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                first = mid + 1;
            }
            else {
                last = mid - 1;
            }            
        }
        return -1;
    }

    public static void main(String[] args) {

        BinarySearching b = new BinarySearching ();
        int arr [] = {1, 4, 5, 6, 8, 9,10};
        System.out.println("Key's Position : " + b.BinarySearch(arr,10));
    }
}