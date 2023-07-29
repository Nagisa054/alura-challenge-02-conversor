package Test;

import Back.Logica;
import UI.Window;

import java.math.BigDecimal;

public class TestLogicaConvercion extends Logica {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("iniciando...");
        Window frame = new Window();
        int monedaEntrada;
        int monedaSalida;
        double input;
        BigDecimal valorsalida;

        System.out.println("cargando datos...");
        while (true){
            System.out.println("programa ok");
            monedaEntrada = frame.getList1Value();
            monedaSalida = frame.getList2Value();
            input = Double.parseDouble(frame.getInputValue());
            valorsalida = Logica.convercion(monedaEntrada, monedaSalida, input);
            System.out.println(monedaEntrada + "->" + monedaSalida + "=" + valorsalida);
            Thread.sleep(1000);
            setOutputValue(valorsalida);

            Thread.sleep(4000);
        }
    }

}
