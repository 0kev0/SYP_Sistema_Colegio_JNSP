package Start;

import Log_Iin.log_in1;
import Vista_Panel_Director.Panel_Director;
import Vista_Panel_Docente.Panel_Docente;
import Vista_Panel_Secretaria.Panel_Secretaria;

public class Start {

    public static void main(String[] args) {
//        Vista_Panel_Director start = new Vista_Panel_Director();
        Panel_Secretaria start = new Panel_Secretaria();
//        Vista_Panel_Director start = new Vista_Panel_Director();

        start.setVisible(true);
    }
}
