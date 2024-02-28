import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int array[] = readIntegers();
        System.out.println(findMin(array));


    }

    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list of integers, separated by comas: ");
        String input = scanner.nextLine();
        String[] splitString = input.split(","); //separate numbers and put into diferent index on String array
        int[] array = new int[splitString.length]; //new array
        for(int i=0; i< splitString.length; i++){
           array[i] = Integer.parseInt(splitString[i].trim()); //convert to int and delete tabulators, spaces
        }
      return array;
    }

    public static int findMin(int[] array){
        int min=Integer.MAX_VALUE;
//        for(int i =0; i<array.length; i++){
//            if(array[i] <= min) min = array[i];
//        }
        for(int el: array){
            if(el<min) min = el;
        }

        return min;
    }
}