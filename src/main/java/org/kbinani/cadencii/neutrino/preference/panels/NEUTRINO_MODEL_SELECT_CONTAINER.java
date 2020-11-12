package org.kbinani.cadencii.neutrino.preference.panels;

import org.kbinani.windows.forms.BPanel;

import javax.swing.*;

public class NEUTRINO_MODEL_SELECT_CONTAINER extends BPanel {

    public NEUTRINO_MODEL_Panel NEUTRINO_MODEL_P;
    public NEUTRINO_MODEL_SELECT_CONTAINER(){
        super();
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        NEUTRINO_MODEL_P=new NEUTRINO_MODEL_Panel();
        add(NEUTRINO_MODEL_P);
    }
}
