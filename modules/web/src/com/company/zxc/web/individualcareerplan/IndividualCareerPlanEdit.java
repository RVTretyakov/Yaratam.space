package com.company.zxc.web.individualcareerplan;

import com.company.zxc.entity.Employee;
import com.company.zxc.entity.IndividualCareerPlan;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.security.entity.User;

import javax.inject.Inject;
import java.util.List;

public class IndividualCareerPlanEdit extends AbstractEditor<IndividualCareerPlan> {

    @Inject
    private DataManager dataManager;

    @Override
    protected void initNewItem(IndividualCareerPlan item) {
//        Employee employee = new Employee();

        //

        User user = AppBeans.get(UserSessionSource.class).getUserSession().getUser();
        System.out.println("user id");
        System.out.println(user.getId());
        List<Employee> list;
        /*list = dataManager
                .load(Employee.class)
                .query("SELECT e FROM zxc_employee e \n" +
                        "WHERE e.CUBA_USER_ID_ID = :user_id")
                .parameter("user_id", user.getId())
//                .view()
                .list();
        if (!list.isEmpty()) {
            item.setEmployee(list.get(0));
        }*/

        list = dataManager.loadList(
                LoadContext.create(Employee.class).setQuery(
                        LoadContext.createQuery("SELECT e FROM zxc_employee e ")));

        item.setEmployee(list.get(0));

    }
}
