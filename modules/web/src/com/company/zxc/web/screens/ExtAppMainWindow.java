package com.company.zxc.web.screens;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;
import com.haulmont.cuba.core.global.UserSessionSource;
import javax.inject.Inject;
import java.util.Map;
import java.util.HashMap;
import com.haulmont.cuba.gui.components.Frame.NotificationType;

public class ExtAppMainWindow extends AppMainWindow {

    @Inject
    private UserSessionSource userSessionSource;

    @Override
    public void ready() {
        super.ready();

        String currUser = userSessionSource.getUserSession().getUser().getLogin();
        if (currUser.equals("anonymous")) {
//            Messageidscreen window = (Messageidscreen) openWindow("messageIdScreen", WindowManager.OpenType.DIALOG);
//            window.addCloseWithCommitListener(() -> {
//                if (window.getMessageId() != null && !window.getMessageId().isEmpty()) {
//                    Map<String, Object> map = new HashMap();
//                    map.put("messageId", window.getMessageId());
                    openWindow("zxc$Feedback.browse", WindowManager.OpenType.NEW_TAB/*, map*/);
//                } else {
//                    return ;
//                }
//            });
        } else {
            openWindow("zxc$IndividualCareerPlan.browse4", WindowManager.OpenType.NEW_TAB);
        }
    }

}