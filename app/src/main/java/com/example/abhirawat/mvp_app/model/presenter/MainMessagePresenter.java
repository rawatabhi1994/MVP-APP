package com.example.abhirawat.mvp_app.model.presenter;

import com.example.abhirawat.mvp_app.model.Message;

/**
 * Created by Abhi Rawat on 27-09-2017.
 */

public class MainMessagePresenter implements checkDetails {
    Message message;
    CheckCredentialsTask checkTask;
    Navigate nav;

    public MainMessagePresenter() {
        checkTask = new CheckCredentialsTask();
        message = new Message();
    }

    public void checkDetails(Navigate nav, String name, String password) {
        this.nav = nav;
        checkTask.checkTask(this, name, password);
    }


    @Override
    public void success() {
        nav.navigate();
    }

    @Override
    public void failure() {
        nav.failed();
    }
}
