package Test;

import UI.Window;

import javax.swing.*;
import java.awt.im.InputContext;

public class TestGettersWindow {

    public static void main(String[] args) throws InterruptedException {
        Window frame = new Window();
        int i = 0;

        while (i < 1000) {

            String msg = frame.getInputValue();
            String msgOut = frame.getOutputValue();
            int indexList1 = frame.getList1Value();
            int indexList2 = frame.getList2Value();

            System.out.println("Input value: " + msg);
            System.out.println("OutPut value: " + msgOut);
            System.out.println("comboBox1 value: " + indexList1);
            System.out.println("comboBox2 value: " + indexList2);

            Thread.sleep(1000);
            i++;

        }

    }
}
