import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8};
        System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2)));
    }

    static int[] mergeSortedArrays(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];
        int ptr1 = 0;
        int ptr2 = 0;
        int ptr3 = 0;

        while(ptr1 < arr1.length  && ptr2 < arr2.length){

            if(arr1[ptr1] < arr2[ptr2]){
                merged[ptr3++] = arr1[ptr1++];
            }else{
                merged[ptr3++] = arr2[ptr2++];
            }
        }

        while(ptr1 < arr1.length){
            merged[ptr3++] = arr1[ptr1++];
        }

        while(ptr2 < arr2.length){
            merged[ptr3++] = arr2[ptr2++];
        }

        return merged;


    }

}