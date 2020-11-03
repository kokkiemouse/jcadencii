package org.kbinani.cadencii.neutrino.preference.panels;

import org.kbinani.windows.forms.BButton;
import org.kbinani.windows.forms.BPanel;
import org.kbinani.windows.forms.BTextBox;

import javax.swing.*;

public class NEUTRINO_DIR_Select_Panel extends BPanel {
    public BTextBox select_path_text;
    public BButton select_browse_b;
    public NEUTRINO_DIR_Select_Panel() {
        super();
        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));

        select_browse_b=new BButton();
        select_browse_b.setText("...");
        select_path_text=new BTextBox();
        add(select_path_text);
        add(select_browse_b);
        //select_path_text.setSize((this.getWidth() - select_browse_b.getWidth()),select_browse_b.getHeight());
    }
}
