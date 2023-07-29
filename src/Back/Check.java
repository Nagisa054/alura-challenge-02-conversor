package Back;

import UI.Window;
import UI.WindowErrorCBox;
import UI.WindowErrorInput;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check extends Window{

   public static Boolean ValidarInput(String input){

        Pattern patterm = Pattern.compile("[^\\d.]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = patterm.matcher(input);

        if (matcher.find()){
            WindowErrorInput errorInputFrame = new WindowErrorInput();
        }

        return !matcher.find();
    }
    public static Boolean ValidarCBox(int list1, int list2){

        if (list1 == 0 || list2 == 0) {
            WindowErrorCBox errorCBoxFrame = new WindowErrorCBox();
            System.out.println("error ChecBox valor 'list1, list2' ");
            return false;
        }
        if (list1 == list2) {
            WindowErrorCBox errorCBoxFrame = new WindowErrorCBox();
            System.out.println("error ChecBox valor 'list1, list2' ");
            return false;
        }
        return true;

    }
}
