package Array;

import java.util.*;

public class ArrayProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //findMaxMin(arr, n);
        //printArray(arr, n);
        //int x = sc.nextInt();
        //findElementBinarySearch(arr, n, x);
        getLoopElement(arr, n);
    }

    public static void printArray(int[] arr, int n) {
        bubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findMaxMin(int[] arr, int n) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    public static void bubbleSort(int[] arr, int n) {
        for (int i=0; i < n-1; i++) {
            for (int j=0; j<=n-i-2; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void findElementLinearSearch(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
    }

    public static void findElementBinarySearch(int[] arr, int n, int x) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Element not found in the array.");
    }

    public static void getLoopElement(int[] arr, int n) {
        int[] countLoop = new int[1001];
        for (int i = 0; i < n; i++) {
            countLoop[arr[i]]++;
        }
        for (int i = 0; i < 1001; i++) {
            if (countLoop[i] > 1) {
                System.out.println("Element " + i + " appears " + countLoop[i] + " times.");
            }
        }
    }
}
