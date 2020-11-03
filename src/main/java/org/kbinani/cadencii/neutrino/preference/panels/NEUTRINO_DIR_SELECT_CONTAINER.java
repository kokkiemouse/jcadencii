package org.kbinani.cadencii.neutrino.preference.panels;

import org.kbinani.windows.forms.BPanel;

import javax.swing.*;
import java.awt.*;

public class NEUTRINO_DIR_SELECT_CONTAINER extends BPanel {
    public NEUTRINO_DIR_Select_Panel NEUTRINO_DIR_Select;
    public NEUTRINO_DIR_SELECT_CONTAINER() {
        super();
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        NEUTRINO_DIR_Select=new NEUTRINO_DIR_Select_Panel();
        add(NEUTRINO_DIR_Select);
    }
}
