package Test;

import Back.Check;
import UI.Window;
import UI.WindowErrorCBox;

public class TestCheck {
    public static void main(String[] args) throws InterruptedException {
        Window frame = new Window();
        String input;
        int valorList1;
        int valorList2;
        boolean inputValido;
        boolean listValido;
        while (true) {
            input = frame.getInputValue();
            valorList1 = frame.getList1Value();
            valorList2 = frame.getList2Value();
            inputValido = Check.ValidarInput(input);
            listValido = Check.ValidarCBox(valorList1, valorList2);
            System.out.println(input + " es valido? " + inputValido);
            System.out.println(valorList1 + " es valido? " + listValido);
            System.out.println(valorList2 + " es valido? " + listValido);

            Thread.sleep(5000);
        }
    }
}
