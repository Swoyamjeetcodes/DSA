//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    void swap(int j, int i, int arr[]) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    // Function to sort the array using Bubble Sort algorithm
    void bubbleSort(int arr[]) {   
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {  // Compare adjacent elements
                    swap(j, j + 1, arr);   // Swap if needed
                    swapped = true;
                }
            }
            
            if (!swapped) break;  // Optimization: Stop if no swaps were made
        }
    }
}


//{ Driver Code Starts.

class Sorting {
    // method to print the Elements of the array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            // calling bubbleSort() method
            new Solution().bubbleSort(arr);

            // calling printArray() method
            printArray(arr);

            t--;
        }
    }
}
// } Driver Code Ends