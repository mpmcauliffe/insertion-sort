package algorithms;

public class Main {

    public static void main(String[] args) {

        /**  initialize unsorted array with assigned elements **/
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        //  for printing only
        for (int num: intArray) {
            System.out.print(num + "  ");
        }
        System.out.print("\n");


    /**
     * INSERTION SORT ALGORITHM
     **/
        /**
         *      this algorithm assumes that the first index is sorted then works to the left to expand the
         *      sorted partition
         *
         *      OUTER LOOP
         *          firstUnsortedIndex is always the index to the immediate right of the sorted partition
         *          this element is always compared with portion of the sorted array then inserted accordingly
         **/
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

            /**
             *      newElement is the element associated with firstUnsortedIndex
             *      as the sorted partition grows and firstUnsortedIndex moves right - i moves left back through
             *          the sorted partition of the array as a way to compare the sorted elements
             *          to firstUnsortedIndex
             **/
            int newElement =  intArray[firstUnsortedIndex];
            int i;

            /**
             *      INNER LOOP
             *          when the requirements are met it means that the firstUnsortedIndex < last element of the
             *              sorted partition
             *          each iteration of the loop compares newElement to the decrementing index of the sorted
             *              partition until newElement > the element at the current index - the loop terminates
             **/
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){
                intArray[i] = intArray[i - 1];
            }

            /**
             *      at this point newElement has found its position and is assigned to the sorted partition
             **/
            intArray[i] = newElement;
        }
    /****/


        //  for printing only
        for (int num: intArray) {
            System.out.print(num + "  ");
        }
    }
}
