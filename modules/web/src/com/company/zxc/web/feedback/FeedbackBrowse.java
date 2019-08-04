package com.company.zxc.web.feedback;

import com.haulmont.cuba.gui.components.EntityCombinedScreen;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.config.WindowInfo;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.Frame.NotificationType;
import com.haulmont.cuba.gui.data.GroupDatasource;
import com.haulmont.bali.util.ParamsMap;
import java.util.Map;
import com.haulmont.cuba.core.global.UserSessionSource;
import java.util.*;
import javax.inject.Inject;
import java.util.HashMap;
import com.company.zxc.entity.Feedback;
import com.company.zxc.web.screens.Messageidscreen;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.core.global.AppBeans;
import com.company.zxc.entity.Employee;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.components.Table.Column;
import javax.inject.Named;

public class FeedbackBrowse extends EntityCombinedScreen {


    @Inject
    private DataManager dataManager;

    @Inject
    private GroupDatasource feedbacksDs;

    @Inject
    private UserSessionSource userSessionSource;

    @Named
    private PickerField employeeField;

    @Named
    private TextField msgId;


    String currUser;
    String messId = "";

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);
        currUser = userSessionSource.getUserSession().getUser().getLogin();
        if (currUser.equals("anonymous")) {
//            Map.Entry<String, Object> entry = params.entrySet().iterator().next();
//            messId = (String) entry.getValue();
//            feedbacksDs.refresh(ParamsMap.of("messageId", messId));
            employeeField.setVisible(false);
//            msgId.setVisible(true);
        } else {
//            feedbacksDs.setQuery("select e from zxc$Feedback e");
//            feedbacksDs.refresh();
            employeeField.setVisible(true);
            msgId.setVisible(false);
        }
    }

    @Override
    protected void initNewItem(Entity item) {
        User user = AppBeans.get(UserSessionSource.class).getUserSession().getUser();
        List<Employee> list;
        list = dataManager
                .load(Employee.class)
                .query("SELECT e FROM zxc$Employee e \n" +
                        "WHERE e.cubaUserId.id = :user_id")
                .parameter("user_id", user.getId())
                .list();
        if (!list.isEmpty()) {
            ((Feedback) item).setEmployee(list.get(0));
        }
//        ((Feedback) item).setSignature(messId);
    }

}

