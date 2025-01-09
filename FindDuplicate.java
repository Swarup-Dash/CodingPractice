public class FindDuplicate {
    public static int[] findDuplicate(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        int[] temp = new int[arr.length]; // Temporary array for duplicates
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            
            if (visited[i])
                continue; // Skip if already processed

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp[index++] = arr[i];
                    visited[j] = true; 
                    break; 
                }
            }
        }

        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 3, 4, 9, 9};
        int[] res = findDuplicate(arr);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
