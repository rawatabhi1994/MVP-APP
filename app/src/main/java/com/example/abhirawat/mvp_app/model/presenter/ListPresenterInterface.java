package com.example.abhirawat.mvp_app.model.presenter;

import java.util.List;

/**
 * Created by Abhi Rawat on 28-09-2017.
 */

public interface ListPresenterInterface {
   public void onResume();
    public void returnList(List<String> list);
    public void setItemMessage(String item,int position);

}
