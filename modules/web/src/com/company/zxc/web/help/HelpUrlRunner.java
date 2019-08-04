package com.company.zxc.web.help;

import com.haulmont.cuba.web.App;
import com.haulmont.cuba.web.WebWindowManager;

public class HelpUrlRunner implements Runnable {
    @Override
    public void run() {
        App app = App.getInstance();
        WebWindowManager wm = app.getWindowManager();
        wm.showWebPage("http://my-help-page.my", null);

    }
}
