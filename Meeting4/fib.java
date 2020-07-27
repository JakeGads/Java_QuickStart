import java.util.ArrayList;

public class fib{
    public static void main(String[] args){
        int size = 5;
        withoutRecord(size);
        var one = withArray(size);
        var two = withArrayList(size);
        compareRecords(one, two);
    }

    public static void withoutRecord(int size) {
        System.out.println("\n\nNon-recording \n\n");
        long back_2 = 0;
        long back_1 = 1;
        
        System.out.println("index: " + 0 + "\t" + back_2);
        System.out.println("index: " + 1 + "\t" + back_1);

        for(int i = 2; i < size; i++){
            long current = back_1 + back_2;
            back_2 = back_1;
            back_1 = current;
            System.out.println("index: " + i + "\t" + current);
        }
    }

    public static long[] withArray(int size){
        System.out.println("\n\nRecording with Array \n\n");
        long[] myArray = new long[size];
        myArray[0] = 0;
        myArray[1] = 1;

        for(int i = 2; i < size; i++){
            myArray[i] += myArray[i - 1] + myArray[i - 2];
        }

        for(int i = 0; i < myArray.length; i++){
            System.out.println("index: " + i + "\t" + myArray[i]);
        }

        return myArray;
    }

    public static ArrayList<Long> withArrayList(int size){
        System.out.println("\n\nRecording with ArrayList \n\n");

        ArrayList<Long> myArrayList = new ArrayList<Long>();
        myArrayList.add((long) 0);
        myArrayList.add((long) 1);

        for(int i = 2; i < size; i++){
            myArrayList.add(i, myArrayList.get(i - 2) + myArrayList.get(i -1));
        }

        for(int i = 0; i < myArrayList.size(); i++){
            System.out.println("index: " + i + "\t" + myArrayList.get(i));
        }

        return myArrayList;
    }

    private static void compareRecords(long[] one, ArrayList<Long> two) {
        boolean check = true;
        for(int i = 0; i < one.length; i++){
            if(one[i] != two.get(i)){
                System.out.println("Unmatched at index " + i + "\n" + one[i] + " " + two.get(i));
                check = false;
            }
        }

        if(check){
            System.out.println("\n\nAll Checks passed without issue");
        }
    }
}