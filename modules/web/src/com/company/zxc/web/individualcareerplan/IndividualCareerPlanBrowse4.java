package com.company.zxc.web.individualcareerplan;

import java.util.*;

import com.company.zxc.entity.Employee;
import com.company.zxc.entity.IndividualCareerPlan;
import com.company.zxc.entity.Iprdetail;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.components.EntityCombinedScreen;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import com.haulmont.cuba.security.entity.User;

import javax.inject.Inject;
import com.haulmont.cuba.gui.components.Component;
import org.apache.commons.lang3.StringUtils;

public class IndividualCareerPlanBrowse4 extends EntityCombinedScreen {

    @Inject
    private DataManager dataManager;

    @Inject
    protected ComponentsFactory componentsFactory;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);
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
            ((IndividualCareerPlan) item).setEmployee(list.get(0));
        }
        /*list = dataManager.loadList(
                LoadContext.create(Employee.class)
                        .setQuery(LoadContext.createQuery("SELECT e FROM zxc$Employee e WHERE e.cubaUserId = :user_id")
                                .setParameter("user_id", user)));
        if (!list.isEmpty()) {
            ((IndividualCareerPlan) item).setEmployee(list.get(0));
        }*/
    }

    public Component generateGoalsCell(IndividualCareerPlan entity) {
        String goals = "";
        int i = 1;
        for (Iprdetail iprdetail : entity.getIprdetail()) {
            if (!StringUtils.isEmpty(iprdetail.getGoal())) {
                goals = goals
                        .concat(String.valueOf(i++))
                        .concat(". ")
                        .concat(iprdetail.getGoal())
                        .concat("\n");
            }
        }

        com.haulmont.cuba.gui.components.Label label = (com.haulmont.cuba.gui.components.Label) componentsFactory.createComponent(com.haulmont.cuba.gui.components.Label.NAME);
        label.setValue(goals);

        return label;
    }
}
