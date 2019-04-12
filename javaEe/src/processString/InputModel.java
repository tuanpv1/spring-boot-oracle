package processString;
// This is Model
public class InputModel {
    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public String inputString;

    /**
     * check the input string have symmetric Ex input abccba => return true
     */
    public void checkSymmetricString() {
        char[] arrayCharacters = this.getInputString().trim().toLowerCase().toCharArray();
        int total_character = arrayCharacters.length;
        int middle = this.getMiddle(total_character);
        Boolean check_symmectric = true;
        for (int i = 0; i < middle; i++) {
            if (arrayCharacters[i] != arrayCharacters[total_character - i - 1]) {
                check_symmectric = false;
            }
        }
        if (check_symmectric == false) {
            System.out.println("The string input not symmetric! Please input other string");
        } else {
            System.out.println("This is symmetric string");
        }
    }

    int getMiddle(int total_character) {
        if (total_character >= 2) {
            double middle = total_character / 2;
            long middleReturn = Math.round(middle);
            return (int) middleReturn;
        } else {
            System.out.println("The string to shoot");
            return 0;
        }
    }
}
