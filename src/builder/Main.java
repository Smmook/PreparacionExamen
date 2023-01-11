package builder;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rev = 0;
        System.out.println("Introduce un numero: ");
        Integer num = Integer.valueOf(JOptionPane.showInputDialog(null, "Introduce un numero:"));

        while (num != 0) {
            rev *= 10;
            rev += num % 10;
            num /= 10;
        }
        JOptionPane.showConfirmDialog(null, "Tu numero es " + rev);
    }
}