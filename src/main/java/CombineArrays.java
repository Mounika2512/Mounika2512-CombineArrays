
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
 int totalLength = arr1.length + arr2.length;

        // Create a new array to store the combined elements
        int[] combinedArray = new int[totalLength];

        // Copy elements from arr1 to the combined array
        System.arraycopy(arr1, 0, combinedArray, 0, arr1.length);

        // Copy elements from arr2 starting from the end of arr1 in the combined array
        System.arraycopy(arr2, 0, combinedArray, arr1.length, arr2.length);

        // Return the combined array
        return combinedArray;
    }
}