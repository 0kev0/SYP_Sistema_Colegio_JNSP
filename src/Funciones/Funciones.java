package Funciones;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.lang.System.out;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Funciones {

    public static void Menu_Item_Mouse_Action(JMenu JMenu_1, String color) throws NumberFormatException {
        JMenu_1.setOpaque(true);
        JMenu_1.setBackground(Color.decode(color));
    }

    public static void EnterMouse_Menu(MenuItem MenuItem, JLabel lable, String color1, String color2) throws NumberFormatException {
        JMenuItem menuItem = new JMenuItem("Mi elemento de menú");
        menuItem.setOpaque(true);
        menuItem.setBackground(Color.RED);

    }

    public static void LeftMouse_Menu(JPanel panel, JLabel lable, String color1, String color2) throws NumberFormatException {
        panel.setBackground(Color.decode(color1));
        lable.setForeground(Color.decode(color2));
    }

    public static void EnterMouse(JPanel panel, JLabel lable, String color1, String color2) throws NumberFormatException {
        panel.setBackground(Color.decode(color1));
        lable.setForeground(Color.decode(color2));
    }

    public static void LeftMouse(JPanel panel, JLabel lable, String color1, String color2) throws NumberFormatException {
        panel.setBackground(Color.decode(color1));
        lable.setForeground(Color.decode(color2));
    }

    public static void ClickTxbFecha(JTextField Textbox) throws NumberFormatException {
        Textbox.setText("");
    }

    public static void LeftMouseTxb(JTextField Textbox, String text) throws NumberFormatException {
        if (Textbox.getText().equals("")) {
            Textbox.setText(text);
        }

    }

    public static void DateValid(JTextField textbox, int maxlimit, JLabel error, int DigitLimit) {
        textbox.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    showError("***Formato erroneo, solo numeros***");
                    e.consume();
                }

                if (textbox.getText().length() >= DigitLimit) // limit textfield  2 digitos
                {
                    showError("***Cantidad de digitos excedido***");
                    e.consume();
                }

                try {
                    String input = textbox.getText() + c;
                    if (!input.isEmpty()) {

                        int date = Integer.parseInt(input);
                        if (date > maxlimit) {
                            showError("***Numero invalido***");
                            e.consume();
                        }
                    }
                } catch (NumberFormatException ex) {
                    out.println("El texto no se pudo convertir a un número, maneja el error aquí" + ex.getMessage());
                }
            }

            private void showError(String errorMessage) {
                error.setText(errorMessage);
                error.setForeground(Color.RED);
                out.println(errorMessage);
                textbox.setText("");
                Timer timer = new Timer(1000, e -> error.setForeground(Color.decode("#172A38")));
                timer.setRepeats(false);
                timer.start();
            }
        });
    }

    public static void ValidNombres(JTextField textbox, JLabel error) {
        textbox.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!(Character.isLetter(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    showError("***Formato erroneo, solo letras***");
                    e.consume();
                }

                if (textbox.getText().length() >= 30) // limit textfield to 31 characters
                {
                    showError("***Cantidad de caracteres excedido***");
                    e.consume();
                }
            }

            private void showError(String errorMessage) {
                error.setText(errorMessage);
                error.setForeground(Color.RED);
                out.println(errorMessage);
                textbox.setText("");
                Timer timer = new Timer(1000, e -> error.setForeground(Color.decode("#172A38")));
                timer.setRepeats(false);
                timer.start();
            }
        });
    }

    public static void ValidEnteros(JTextField textbox, JLabel error) {
        textbox.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    showError("***Formato erroneo, solo números enteros***");
                    e.consume();
                }

            }

            private void showError(String errorMessage) {
                error.setText(errorMessage);
                error.setForeground(Color.RED);
                System.out.println(errorMessage);
                textbox.setText("");
                Timer timer = new Timer(1000, e -> error.setForeground(Color.decode("#172A38")));
                timer.setRepeats(false);
                timer.start();
            }
        });
    }

    public static void ValidNumeroTel(JTextField textbox, JLabel error) {
        textbox.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                String text = textbox.getText();

                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '-'))) {
                    showError("***Formato erroneo, solo números y un guión***");
                    e.consume();
                } else if (c == '-' && (text.contains("--") || text.length() != 4)) {
                    showError("***El guión solo puede estar una ves***");
                    e.consume();
                } else if (Character.isDigit(c) && text.length() >= 9) {
                    showError("***No puede ingresar más de 8 números***");
                    e.consume();
                }
            }

            private void showError(String errorMessage) {
                error.setText(errorMessage);
                error.setForeground(Color.RED);
                System.out.println(errorMessage);
                textbox.setText("");
                Timer timer = new Timer(1000, e -> error.setForeground(Color.decode("#172A38")));
                timer.setRepeats(false);
                timer.start();
            }
        });
    }

    public static void ValidDoc(JTextField textbox, JLabel error) {
        textbox.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                String text = textbox.getText();

                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '-'))) {
                    showError("***Formato erroneo, solo números y un guión***");
                    e.consume();
                } else if (c == '-' && text.contains("-")) {
                    showError("***El guión solo puede estar una vez***");
                    e.consume();
                } else if (Character.isDigit(c) && text.length() >= 10) {
                    showError("***No puede ingresar más de 8 números***");
                    e.consume();
                }
            }

            private void showError(String errorMessage) {
                error.setText(errorMessage);
                error.setForeground(Color.RED);
                System.out.println(errorMessage);
                textbox.setText("");
                Timer timer = new Timer(1000, e -> error.setForeground(Color.decode("#172A38")));
                timer.setRepeats(false);
                timer.start();
            }
        });
    }

    public static void ValidFraciones(JTextField textbox, JLabel error) {
        textbox.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.'))) {
                    showError("***Formato erroneo, solo fracciones o números enteros***");
                    e.consume();
                } else if (c == '.' && textbox.getText().contains(".")) {
                    showError("***No puede ingresar más de un punto decimal***");
                    e.consume();
                }

            }

            private void showError(String errorMessage) {
                error.setText(errorMessage);
                error.setForeground(Color.RED);
                System.out.println(errorMessage);
                textbox.setText("");
                Timer timer = new Timer(1000, e -> error.setForeground(Color.decode("#172A38")));
                timer.setRepeats(false);
                timer.start();
            }
        });
    }

    public static void CentrarFrames(JDesktopPane jDesktopPane1, JInternalFrame internalFrame) {
        for (JInternalFrame frame : jDesktopPane1.getAllFrames()) {
            frame.dispose();
        }

        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension jInternalFrameSize = internalFrame.getSize();
        internalFrame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);

    }

    public static boolean validarCampos(JPanel panel) {
        for (Component c : panel.getComponents()) {
            if (c instanceof JTextField jTextField) {
                if (jTextField.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(c, "Campos vacios, por favor llene todos los campos ");
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean validarDates(JPanel panel) {
        for (Component c : panel.getComponents()) {
            if (c instanceof JTextField jTextField) {
                if (jTextField.getText().trim().isEmpty() && jTextField.getText().contains("-")) {
                    JOptionPane.showMessageDialog(c, "Campos vacios, por favor llene todos los campos ");
                    return false;
                }
            }
        }
        return true;
    }

    public static void VaciarCampos(JPanel panel) {
        for (Component c : panel.getComponents()) {
            if (c instanceof JTextField jTextField) {
                jTextField.setText("");
            }
        }
    }

    public static void reset(JLabel cant, JLabel subt) {
        cant.setText("Items : ");
        subt.setText("Sub-Total: $ ");
    }

    public void setImage(JLabel label, String rutaImagen) {
        ImageIcon imagen = new ImageIcon(getClass().getResource(rutaImagen));
        Icon icon_Label = new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));

        label.setIcon(icon_Label);
    }

}