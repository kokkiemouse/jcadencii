package org.kbinani.cadencii.neutrino.preference.panels;

import org.kbinani.windows.forms.BButton;
import org.kbinani.windows.forms.BComboBox;
import org.kbinani.windows.forms.BPanel;
import org.kbinani.windows.forms.BTextBox;

import javax.swing.*;

public class NEUTRINO_MODEL_Panel extends BPanel {

    public BComboBox select_combo_box;

    public NEUTRINO_MODEL_Panel() {
        super();
        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));

        select_combo_box=new BComboBox();
        select_combo_box.addItem("KIRITAN");
        select_combo_box.addItem("ITAKO");
        add(select_combo_box);
        //select_path_text.setSize((this.getWidth() - select_browse_b.getWidth()),select_browse_b.getHeight());
    }
}
