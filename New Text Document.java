/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double f = 60;
        convertF2C(f);
    }

    public static void convertF2C(double f) {
        double c = (f - 32) * .5556;
        System.out.println("C: " + c);
    }
}
