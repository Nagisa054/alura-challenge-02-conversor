package Back;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class BtnCopy {
    public static void copy(String value){
//      String value = UI.Window.getOutputValue();

        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection strSel = new StringSelection(value);
        cb.setContents(strSel, null);

    }
}
