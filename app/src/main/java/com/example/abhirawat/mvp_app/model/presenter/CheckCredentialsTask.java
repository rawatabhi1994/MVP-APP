package com.example.abhirawat.mvp_app.model.presenter;

/**
 * Created by Abhi Rawat on 27-09-2017.
 */

public class CheckCredentialsTask {
    public void checkTask(checkDetails details, String name, String password) {
        if (name.length() > 3 && password.length() > 3) {
            details.success();
        } else {
            details.failure();
        }
    }
}
