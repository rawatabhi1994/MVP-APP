package com.example.abhirawat.mvp_app.model.presenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Abhi Rawat on 28-09-2017.
 */

public class GetList {
    public void getList(ListPresenterInterface listPresenterInterface) {
        listPresenterInterface.returnList(createList());

    }

    public List<String> createList() {
        return Arrays.asList(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5",
                "Item 6",
                "Item 7",
                "Item 8",
                "Item 9",
                "Item 10"
        );
    }


}

