package com.example.abhirawat.mvp_app.model.presenter;

import java.util.List;

/**
 * Created by Abhi Rawat on 28-09-2017.
 */

public class ListMakerPresenter implements ListPresenterInterface {
    private ListInterface listInterface;
    private List<String> list;
    private GetList getList;

    public ListMakerPresenter(ListInterface listInterface, List<String> list) {
        this.listInterface = listInterface;
        this.list = list;
        getList = new GetList();
    }

    @Override
    public void onResume() {
        getList.getList(this);
    }

    @Override
    public void returnList(List<String> list) {
        listInterface.setItems(list);
    }

    @Override
    public void setItemMessage(String item, int position) {
        listInterface.showMessage("Clicked Item " + item + " at position " + position);
    }


}
