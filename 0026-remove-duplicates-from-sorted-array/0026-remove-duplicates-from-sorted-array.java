class Solution {
    public int removeDuplicates(int[] arr) {
         int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        
        for (int k = 0; k <= i; k++) {
            System.out.println( arr[k]+ " ");
        }
        return (i+1);
    }
}