package org.kbinani.cadencii.neutrino.preference;

import org.kbinani.cadencii.neutrino.preference.panels.NEUTRINO_DIR_SELECT_CONTAINER;
import org.kbinani.cadencii.neutrino.preference.panels.NEUTRINO_DIR_Select_Panel;
import org.kbinani.windows.forms.*;

import javax.swing.*;
import java.awt.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class NEUTRINO_settings_panel extends BPanel {
    private Function<String,String> gettext_f;
    private Object parentkun;
    public NEUTRINO_DIR_SELECT_CONTAINER neutrino_dir_select_container;
    private String gettext(String id){
        return gettext_f.apply(id);
    }
    public String get_NEUTRINO_PATH(){
        return neutrino_dir_select_container.NEUTRINO_DIR_Select.select_path_text.getText();
    }
    public NEUTRINO_settings_panel(Function<String,String> gettext_mod,Object parentkun_f) {
        super();
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setSize(new Dimension(392, 182));
        gettext_f=gettext_mod;
        parentkun=parentkun_f;
        UI_initizalize();
    }
    private void UI_initizalize(){
        BLabel NEUTRINO_PATH_L=new BLabel();
        NEUTRINO_PATH_L.setText(gettext("NEUTRINO DIR"));
        add(NEUTRINO_PATH_L);
        neutrino_dir_select_container=new NEUTRINO_DIR_SELECT_CONTAINER();
        add(neutrino_dir_select_container);

    }
}
