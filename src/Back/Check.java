package Back;

import UI.WindowErrorCBox;
import UI.WindowErrorInput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {

   public static Boolean ValidarInput(String input){

        Pattern patterm = Pattern.compile("[^\\d.]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = patterm.matcher(input);
        boolean find = matcher.find();

        if (find || input.equals(".") || input.equals("")){
            new WindowErrorInput();
            return false;
        }
            return !find;
    }
    public static Boolean ValidarCBox(int list1, int list2){

        if (list1 == 0 || list2 == 0) {
            new WindowErrorCBox();
            System.out.println("error. la opción: " + list1 + " o " + list2 + " no es valida");
            return false;
        }
        if (list1 == list2) {
            new WindowErrorCBox();
            System.out.println("error. la opción: " + list1 + " o " + list2 + " no es valida");
            return false;
        }
        return true;

    }
}
