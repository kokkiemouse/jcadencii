package org.kbinani.windows.forms;

import org.kbinani.cadencii.function_interfaces.TriFunction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.function.BiFunction;

public class BFolderChoosePanel extends BPanel{
    private BFolderBrowser folderBrowser;
    private BButton BrowseButton;
    private BTextBox Path_text;
    private TriFunction<BFolderBrowser, Boolean,Object, Integer> modal_showkun;
    private Object Parentf;
    public BFolderChoosePanel() {
        super();
        folderBrowser=new BFolderBrowser();
        InitUi();
    }
    private void InitUi(){
        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        BrowseButton=new BButton();
        BrowseButton.addActionListener(this::clicked_browse_button);
        Path_text=new BTextBox();
        BrowseButton.setText("...");
        Path_text.setSize((this.getWidth() - BrowseButton.getWidth()),Path_text.getHeight());
        add(Path_text);
        add(BrowseButton);
    }
    public void setDescription(String desc){
        folderBrowser.setDescription(desc);
    }
    public String getDescription(){
        return folderBrowser.getDescription();
    }
    public void setSelectedPath(String pathkun){
        folderBrowser.setSelectedPath(pathkun);
        Path_text.setText(pathkun);
    }
    public String getSelectedPath(){
        return Path_text.getText();
    }
    public void setModalFunction(TriFunction<BFolderBrowser, Boolean,Object, Integer> funckun){
        modal_showkun=funckun;
    }
    public void setParentWindow(Object fkun){
        Parentf=fkun;
    }
    private void clicked_browse_button(ActionEvent e){
        int ret =  modal_showkun.apply(folderBrowser,true,Parentf);
        if(ret != JFileChooser.APPROVE_OPTION){
            return;
        }
        Path_text.setText(folderBrowser.getSelectedPath());
    }
}
