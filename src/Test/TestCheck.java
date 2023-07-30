package Test;

import Back.Check;
import UI.Window;

public class TestCheck {
    private static Window frame;
    private static void testCheckBoxes() throws InterruptedException {
        while (true) {
            Boolean cBox = Check.ValidarCBox(frame.getList1Value(), frame.getList2Value());
            System.out.println("La Opcion: " + frame.getList1Value() + " y " + frame.getList2Value() + " es " + cBox);
            Thread.sleep(2000);
        }
    }
    private static void testInputvalue() throws InterruptedException{
        while (true) {
            Boolean input = Check.ValidarInput(frame.getInputValue());
            System.out.println("El valor del input: " + frame.getInputValue() + " es " + input);
            Thread.sleep(2000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        frame = new Window();
//        testCheckBoxes();
        testInputvalue();
    }

}
