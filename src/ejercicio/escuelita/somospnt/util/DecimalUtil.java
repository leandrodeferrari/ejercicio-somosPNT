package ejercicio.escuelita.somospnt.util;

import java.text.DecimalFormat;

/**
 *
 * @author deferrari
 */
public class DecimalUtil {
    // La cadena de formato "#.##" sirve para que, si el número es entero, no se muestre el ".0".
    public static String formatear(double numero) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(numero);
    }
}
