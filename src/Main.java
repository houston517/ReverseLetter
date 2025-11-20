//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("J@va the be$t!123"));

    }
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        int last =  str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if(!Character.isLetter(current)){
                sb.append(current);
            } else  {
                if(last >= 0){
                    char lastChar = str.charAt(last);
                    while (last > 0 && !Character.isLetter(lastChar)) {
                        last--;
                        lastChar = str.charAt(last);
                    }
                    sb.append(lastChar);
                    last--;
                }
            }
        }
        return sb.toString();
    }
}