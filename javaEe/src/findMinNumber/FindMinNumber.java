import java.util.*;

public class FindMinNumber {
    /**
     * INPUT NUMBER
     *
     * @param args
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int numberInput = input.nextInt();
        if(numberInput < 0){
            System.out.println("Please input number");
            return;
        }
        String numberString = String.valueOf(numberInput);
        System.out.println("You entered " + numberString);
        List resultInput = processNumberInput(numberString);
        System.out.println(" We need delete number at the position " + resultInput.get(0) + " have min value after delete at this position equal " + resultInput.get(1));

    }

    private static List<Integer> processNumberInput(String number) {
        List<Integer> resultInput;
        ArrayList<Integer> listNumberAfter = new ArrayList<Integer>();
        char[] a = number.toCharArray();
        int i = 0;
        for (char positionValue : a) {
            int numberAfter = getValueAfterRemove(a, i);
            listNumberAfter.add(i, numberAfter);
            i++;
        }
        System.out.printf(listNumberAfter.toString());
        resultInput = processFindMin(listNumberAfter);
        return resultInput;
    }

    private static List processFindMin(ArrayList<Integer> listNumber) {
        List<Integer> resultMin = new ArrayList<Integer>();
        int temp_min = 0;
        int pos = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            if (i == 0) {
                temp_min = listNumber.get(i);
            } else {
                if (temp_min > listNumber.get(i)) {
                    temp_min = listNumber.get(i);
                    pos = i;
                }
            }
        }
        pos = pos + 1;
        resultMin.add(pos);
        resultMin.add(temp_min);
        return resultMin;
    }

    private static Integer getValueAfterRemove(char[] a, int position) {
        String numberAfter = "";
        int i = 0;
        for (char positionValue : a) {
            if (i != position) {
                numberAfter = numberAfter + positionValue;
            }
            i++;
        }
        return Integer.parseInt(numberAfter);
    }
}
