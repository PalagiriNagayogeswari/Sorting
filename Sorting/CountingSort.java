public class CountingSort {

    public static void main(String[] args) {

        int[] ages = {12, 15, 10, 18, 15, 13, 12, 10};

        int max = 18;

        //created an extra count array to count the frequency of each element upto max.
        int[] count = new int[max + 1];

        //updating the count array.
        for (int age : ages)
            count[age]++;

        System.out.println("Sorted Ages:");

        //printing the array in sorted order.
        for (int i = 0; i <= max; i++) {

            while (count[i] > 0) {
                System.out.print(i + " ");
                count[i]--;
            }
        }
    }
}