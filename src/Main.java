import java.lang.Math;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class DialogueBoxGenerator {

        class Roots {
            private double a, b, c;

            Roots(double a, double b, double c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

            public double getDiscriminant() {

                double discriminant = (b * b) - (4 * a * c);

                return discriminant;
            }

            public double getRoot1() {

                double discriminant = getDiscriminant();

                if (discriminant < 0) {

                    return 0;
                } else {
                    return (-b + Math.sqrt(discriminant)) / (2 * a);
                }
            }

            public double getRoot2() {

                double discriminant = getDiscriminant();

                if (discriminant < 0) {

                    return 0;
                } else {

                    return (-b - Math.sqrt(discriminant)) / (2 * a);
                }
            }

            public static void main(String[] args) {

                Roots r1 = new Roots(1, 2, 1);

                double root1 = r1.getRoot1();
                double root2 = r1.getRoot2();

                if (root1 == 0) {

                    System.out.println("Imaginary roots");
                } else

                    System.out.println("Root 1: " + root1);

                if (root2 == 0) {

                    System.out.println("Imaginary roots");
                } else
                    System.out.println("Root 2: " + root2);

                // added GUI

            }private static JFrame mainFrame;
            private static JPanel mainPanel;
            private static JButton generateButton;
            public static void main(String[] args) {
                mainFrame = new JFrame("String Generator..");
                mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

                JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
                label1 = new JLabel("Coefficient A");
                field1 = new JTextField(10);
                label2 = new JLabel("Coefficient B");
                field2 = new JTextField(10);
                label3 = new JLabel("Coefficient C");
                generateButton = new JButton("Find Roots");
            }}}
