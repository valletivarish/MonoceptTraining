package com.monocept.arrays;
import java.util.Scanner;
public class AveragePair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        int sum = 0;
        int average;
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum+=array[i];
        }
        average=sum/n;
        quickSort(array, 0, n - 1);
        int left = 0, right = n - 1;
        boolean pairFound = false;
        while (left < right) {
            int currentAvg = array[left] + array[right];
            if (currentAvg == average) {
                System.out.println("Resultant pair: ");
                System.out.println(array[left] + " " + array[right]);
                pairFound = true;
                break;
            } else if (currentAvg < average) {
                left++;
            } else {
                right--;
            }
        }
        if (pairFound) {
            System.out.println("pair of elements: "+pairFound);
        }
        else {
        	System.out.println("no suitable pair is found");
        }
    }
    private static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
