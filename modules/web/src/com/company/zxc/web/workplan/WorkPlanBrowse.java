package com.company.zxc.web.workplan;

import com.company.zxc.entity.Employee;
import com.company.zxc.entity.WorkPlan;
import com.company.zxc.entity.WorkPlanDetail;
import com.company.zxc.entity.WorkPlanDetailTask;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.components.EntityCombinedScreen;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

import javax.inject.Inject;
import java.util.List;
import com.haulmont.cuba.gui.components.Component;
import org.apache.commons.lang3.StringUtils;

public class WorkPlanBrowse extends EntityCombinedScreen {

    @Inject
    private DataManager dataManager;

    @Inject
    protected ComponentsFactory componentsFactory;

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
            ((WorkPlan) item).setEmployee(list.get(0));
        }
    }

    public Component generateTasks_aggregateCell(WorkPlan entity) {
        String tasks = "";
        int i = 1;
        for (WorkPlanDetailTask detail : entity.getWorkPlanDetailTasks()) {
            if (!StringUtils.isEmpty(detail.getTaskName())) {
                tasks = tasks
                        .concat(String.valueOf(i++))
                        .concat(". ")
                        .concat(detail.getTaskName())
                        .concat("\n");
            }
        }

        com.haulmont.cuba.gui.components.Label label = (com.haulmont.cuba.gui.components.Label) componentsFactory.createComponent(com.haulmont.cuba.gui.components.Label.NAME);
        label.setValue(tasks);

        return label;
    }
}