package Start;

import Log_Iin.log_in1;
import Vista_Panel_Director.Panel_Director;
import Vista_Panel_Docente.Panel_Docente;
import Vista_Panel_Secretaria.Panel_Secretaria;

public class Start {

    public static void main(String[] args) {
//     Panel_Docente start = new Panel_Docente();
     //   Panel_Secretaria start = new Panel_Secretaria();
       Panel_Director start = new Panel_Director();

        start.setVisible(true);

    }
}
