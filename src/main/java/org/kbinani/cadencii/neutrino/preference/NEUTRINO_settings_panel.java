package org.kbinani.cadencii.neutrino.preference;

import org.kbinani.cadencii.neutrino.preference.panels.NEUTRINO_DIR_SELECT_CONTAINER;
import org.kbinani.cadencii.neutrino.preference.panels.NEUTRINO_DIR_Select_Panel;
import org.kbinani.cadencii.neutrino.preference.panels.NEUTRINO_MODEL_SELECT_CONTAINER;
import org.kbinani.windows.forms.*;

import javax.swing.*;
import java.awt.*;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * NEUTRINO Settting Panel
 */
public class NEUTRINO_settings_panel extends BPanel {
    private Function<String,String> gettext_f;
    private Object parentkun;
    public NEUTRINO_DIR_SELECT_CONTAINER neutrino_dir_select_container;
    public NEUTRINO_MODEL_SELECT_CONTAINER neutrino_model_select_container;
    private String gettext(String id){
        return gettext_f.apply(id);
    }

    /**
     * get Neutrino Path
     * @return Neutrino Path
     */
    public String get_NEUTRINO_PATH(){
        return neutrino_dir_select_container.NEUTRINO_DIR_Select.select_path_text.getText();
    }
    public String get_NEUTRINO_MODEL(){
        return neutrino_model_select_container.NEUTRINO_MODEL_P.select_combo_box.getSelectedItem().toString();
    }

    /**
     * Constractor
     * @param gettext_mod gettext lamda
     * @param parentkun_f parent window obj
     */
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
        BLabel NEUTRINO_MODEL_L=new BLabel();
        NEUTRINO_MODEL_L.setText(gettext("MODEL"));
        add(NEUTRINO_MODEL_L);
        neutrino_model_select_container=new NEUTRINO_MODEL_SELECT_CONTAINER();
        add(neutrino_model_select_container);

    }
}
