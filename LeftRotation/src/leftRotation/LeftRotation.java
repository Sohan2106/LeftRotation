package leftRotation;

import java.util.*;

public class LeftRotation {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of Array Elements");
        int noOfElements = input.nextInt();
        
        System.out.println("Enter the number of Left Rotations");
        int noOfRotations = input.nextInt();
        
        int array[] = new int[noOfElements];
        
        System.out.println("Enter the array elements");
        for(int index = 0; index < noOfElements; index++){
            array[index] = input.nextInt();
        }
        
        array = leftRotate(array,noOfRotations,noOfElements);
        
        for(int index = 0; index < noOfElements; index++){
            System.out.print(array[index] + " ");
        }
    }
    
    public static int[] leftRotate(int[] array, int noOfRotations,int noOfElements){
        
        int[] firstHalfArray = new int[noOfRotations];
        int[] secondHalfArray = new int[noOfElements];
        if(noOfRotations > noOfElements){
            noOfRotations = noOfRotations - noOfElements; 
        }
        if( noOfRotations == noOfElements){
            return array;
        }
        else{
            int indexOfArray = 0;
            for(int index = 0; index < noOfRotations; index++){
                firstHalfArray[index] = array[indexOfArray++];
            }
            
            int index = 0;
            for( ; indexOfArray < noOfElements; index++){
                secondHalfArray[index] = array[indexOfArray++];
            }
            
            for(int i = 0; index < noOfElements; i++){
                secondHalfArray[index++] = firstHalfArray[i];
            }
            return secondHalfArray;
        }
    }
}
