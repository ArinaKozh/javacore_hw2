public class Main {


    public static void main(String[] args) {

        int[] arr = new int[]{0,0,2,3,4,5};
        System.out.println(countEvents(arr));
        System.out.println(diffMaxMin(arr));
        System.out.println(checkZeros(arr));

    }

    public  static int countEvents(int[] array){
        int counter = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int diffMaxMin(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i : array) {
            if (i>max) {
                max = i;
            }
            if (i<min) {
                min = i;
            }
        }
        return max-min;
    }

    public  static boolean checkZeros(int[] array){
        for (int i=0;i<array.length-1;i++){
            if (array[i]==0){
                if(array[i+1]==0){
                    return true;
                }
            }
        }
        return false;
    }


}
