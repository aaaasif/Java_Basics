// public class GenericMethodTest {
//     // generic method printArray
//     public static < E > void printArray( E[] inputArray ) {
//        // Display array elements
//        for(E element : inputArray) {
//           System.out.printf("%s ", element);
//        }
//        System.out.println();
//     }
 
//     public static void main(String args[]) {
//        // Create arrays of Integer, Double and Character
//        Integer[] intArray = { 1, 2, 3, 4, 5 };
//        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
//        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
 
//        System.out.println("Array integerArray contains:");
//        printArray(intArray);   // pass an Integer array
 
//        System.out.println("\nArray doubleArray contains:");
//        printArray(doubleArray);   // pass a Double array
 
//        System.out.println("\nArray characterArray contains:");
//        printArray(charArray);   // pass a Character array
//     }
//  }


 public class GenericMethods {

    public <E> void printArray(E[] inputArray){
        //Display Array Elements
        List<E> values = Arrays.asList(inputArray);
        values.stream()
                .forEach(System.out::print);
    }
    
    public <T extends Comparable<T>> T returnMax(T x, T y, T z){
        T max = x; //Initially assume the firs element is max
    
        if(y.compareTo(max) > 0){
            max = y;
        }
    
        if(z.compareTo(max) > 0){
            max = z;
        }
    
        return max;
    }
    }

    