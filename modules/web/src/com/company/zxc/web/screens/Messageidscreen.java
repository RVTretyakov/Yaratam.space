package com.company.zxc.web.screens;

import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.Window;
import com.haulmont.cuba.gui.components.TextField;


import javax.inject.Inject;

public class Messageidscreen extends AbstractWindow {


    @Inject
    public TextField messageId;


    public String getMessageId() {
        return messageId.getValue();
    }


    public void select() {
        if (messageId.getValue() != null) {
            close(Window.COMMIT_ACTION_ID);
        }
    }
    
    
    public void cancel() {
        close(Window.CLOSE_ACTION_ID);
    }

}