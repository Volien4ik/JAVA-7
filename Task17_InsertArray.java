
public class Task17_InsertArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        int[] result = new int[arr.length + 3];
        int numStart = 1, numEnd = 5, numMiddle = 10;

        result[0] = numStart;
        for (int i = 0; i < arr.length / 2; i++) {
            result[i + 1] = arr[i];
        }
        result[arr.length / 2 + 1] = numMiddle;
        for (int i = arr.length / 2; i < arr.length; i++) {
            result[i + 2] = arr[i];
        }
        result[result.length - 1] = numEnd;

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
