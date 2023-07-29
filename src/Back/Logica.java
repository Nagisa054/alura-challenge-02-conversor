package Back;

import UI.Window;

import java.math.BigDecimal;


public class Logica extends Window {
//Monedas
// " * Seleccione una opción * ".
// "$ - Peso Colombiano".
// "$ - Dolar Estadounidense"co.
// "€ - Euro"co.
// "£ - Libra Esterlina"co.
// "¥ - Yen Japones"co.
// "¥ - Yuan Chino"co.
// "₩ - Won Koreano"co.
// "₽ - Rublo Ruso"co.

    public static BigDecimal convercion(int monedaEntrada, int monedaSalida, double valor) {
        BigDecimal output = BigDecimal.valueOf(0);
        /*converción pesos col a otros*/
        if (monedaEntrada == 1) {
            switch (monedaSalida) {
                case 2:/*pesos col a dolar us*/
                    Window.setDateLabelText("valor de 18/07/2023");
                    output = BigDecimal.valueOf(valor * 0.00025);
                    return output;
                case 3:/*pesos col a euro eu*/
                    Window.setDateLabelText("valor de 18/07/2023");
                    output = BigDecimal.valueOf(valor * 0.00022);
                    return output;
                case 4:/*peso col a libra uk*/
                    Window.setDateLabelText("valor de 18/07/2023");
                    output = BigDecimal.valueOf(valor * 0.00019);
                    return output;
                case 5:/*Peso col a yen jp*/
                    Window.setDateLabelText("valor de 18/07/2023");
                    output = BigDecimal.valueOf(valor * 0.035);
                    return output;
                case 6:/*peso col a yuan chi*/
                    Window.setDateLabelText("valor de 18/07/2023");
                    output = BigDecimal.valueOf(valor * 0.0018);
                    return output;
                case 7:/*peso col a won ko*/
                    Window.setDateLabelText("valor de 18/07/2023");
                    output = BigDecimal.valueOf(valor * 0.31);
                    return output;
                case 8:/*peso col a rublo ru*/
                    Window.setDateLabelText("valor de 18/07/2023");
                    output = BigDecimal.valueOf(valor * 0.023);
                    return output;
                default:
                    return BigDecimal.valueOf(0);
            }
        }
        /*converción dolar us a otros*/
        if (monedaEntrada == 2) {
            switch (monedaSalida) {
                case 1:/*dolar us a pesos col*/
                    Window.setDateLabelText("valor de 18/07/2023");
                    output = BigDecimal.valueOf(valor * 4003.25);
                    return output;
                case 3:/*dolar us a euro eu*/
                    Window.setDateLabelText("valor de 18/07/2023");
                    output = BigDecimal.valueOf(valor * 0.89);
                    return output;
                case 4:/*dolar a libra uk*/
                    Window.setDateLabelText("valor de 18/07/2023");
                    output = BigDecimal.valueOf(valor * 0.77);
                    return output;
                case 5:/*dolar us a yen jp*/
                    Window.setDateLabelText("valor de 18/07/2023");
                    output = BigDecimal.valueOf(valor * 138.90);
                    return output;
                case 6:/*dolar us a yuan chi*/
                    Window.setDateLabelText("valor de 18/07/2023");
                    output = BigDecimal.valueOf(valor * 7.19);
                    return output;
                case 7:/*dolar us a won ko*/
                    Window.setDateLabelText("valor de 18/07/2023");
                    output = BigDecimal.valueOf(valor * 1262.34);
                    return output;
                case 8:/*dolar us a rublo ru*/
                    Window.setDateLabelText("valor de 18/07/2023");
                    output = BigDecimal.valueOf(valor * 90.65);
                    return output;
                default:
                    return BigDecimal.valueOf(0);
            }
        }
        /*convercón euro eu a otros*/
        if (monedaEntrada == 3) {
            switch (monedaSalida) {
                case 1:/*euro eu a pesos col*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 4450.61);
                    return output;
                case 2:/*euro ue a dolar us */
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 1.12);
                    return output;
                case 4:/*euro eu a libra uk*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.87);
                    return output;
                case 5:/*euro eu a yen jp*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 156.37);
                    return output;
                case 6:/*euro eu a yuan chi*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 8.10);
                    return output;
                case 7:/*euro ue a won ko*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 1419.09);
                    return output;
                case 8:/*euro eu a rublo ru*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 102.57);
                    return output;
                default:
                    return BigDecimal.valueOf(0);
            }
        }
        /*convercón libras uk a otros*/
        if (monedaEntrada == 4) {
            switch (monedaSalida) {
                case 1:/*libra uk a pesos col*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 5130.42);
                    return output;
                case 2:/*libra uk a dola us*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 1.29);
                    return output;
                case 3:/*libra uk a euro eu*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 1.15);
                    return output;
                case 5:/*libra uk us a yen jp*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 180.15);
                    return output;
                case 6:/*libra uk a yuan chi*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 9.32);
                    return output;
                case 7:/*libra uk won ko*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 1634.62);
                    return output;
                case 8:/*libra uk a rublo ru*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 118.15);
                    return output;
                default:
                    return BigDecimal.valueOf(0);
                }
        }
        /*convercón yen jp  a otros*/
        if (monedaEntrada == 5) {
            switch (monedaSalida) {
                case 1:/*yen jp a pesos col*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 28.50);
                    return output;
                case 2:/*yen jp a dola us*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.0072);
                    return output;
                case 3:/*yen jp a euro eu*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.0064);
                    return output;
                case 4:/*yen jp us a libra ik*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.0055);
                    return output;
                case 6:/*yen jp a yuan chi*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.052);
                    return output;
                case 7:/*yen jp won ko*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 9.08);
                    return output;
                case 8:/*yen jp a rublo ru*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.66);
                    return output;
                default:
                    return BigDecimal.valueOf(0);
            }
        }
        /*convercón yuan chi a otros*/
        if (monedaEntrada == 6) {
            switch (monedaSalida) {
                case 1:/*yuan chi a pesos col*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 550.48);
                    return output;
                case 2:/*yuan chi a dola us*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.14);
                    return output;
                case 3:/*yuan chi a euro eu*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.12);
                    return output;
                case 4:/*yuan chi a libra uk*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.11);
                    return output;
                case 5:/*yuan chi a yen jp*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 19.32);
                    return output;
                case 7:/*yuan chi won ko*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 175.35);
                    return output;
                case 8:/*yuan chi a rublo ru*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 12.67);
                    return output;
                default:
                    return BigDecimal.valueOf(0);
            }
        }
        /*convercón won ko a otros*/
        if (monedaEntrada == 7) {
            switch (monedaSalida) {
                case 1:/*won ko a pesos col*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 3.14);
                    return output;
                case 2:/*won ko a dola us*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.00079);
                    return output;
                case 3:/*won ko a euro eu*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.00071);
                    return output;
                case 4:/*won ko a libra uk*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.00061);
                    return output;
                case 5:/*won ko a yen jp*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.011);
                    return output;
                case 6:/*won ko a yuan chi*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.0057);
                    return output;
                case 8:/*won ko a rublo ru*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.072);
                    return output;
                default:
                    return BigDecimal.valueOf(0);
            }
        }
        /*convercón rublo ru a otros*/
        if (monedaEntrada == 8) {
            switch (monedaSalida) {
                case 1:/*rublo ru a pesos col*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 43.46);
                    return output;
                case 2:/*rublo ru a dola us*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.011);
                    return output;
                case 3:/*rublo ru a euro eu*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.0098);
                    return output;
                case 4:/*rublo ru a libra uk*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.0085);
                    return output;
                case 5:/*rublo ru a yen jp*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 1.52);
                    return output;
                case 6:/*rublo ru a yuan chi*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 0.079);
                    return output;
                case 7:/*rublo ru a won ko*/
                    Window.setDateLabelText("valor de 19/07/2023");
                    output = BigDecimal.valueOf(valor * 13.84);
                    return output;
                default:
                    return BigDecimal.valueOf(0);
            }
        }
        return output;
    }

}
