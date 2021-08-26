package InterviewPractice;

import java.util.Arrays;

public class AccenturePractice {
	
	static int[] bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }
        return arr;
    }
        
    public static String reverseString(String input){
        String myString = new String();
        
        for(int i = input.length()-1; i >= 0; i--){
            myString += input.charAt(i);
        }
        return myString;
    }
    public static void main(String[] args) {
        System.out.println(reverseString("Austin"));
        int[] testSort = {1,3,-1,-7,2,3};
        System.out.println(Arrays.toString(bubbleSort(testSort)));
    }
}
