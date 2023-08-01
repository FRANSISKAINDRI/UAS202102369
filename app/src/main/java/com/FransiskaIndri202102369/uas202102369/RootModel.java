package com.FransiskaIndri202102369.uas202102369;

import java.util.List;

public class RootModel {
    private List<ListModel> listModelList;

    public RootModel(){
    }

    public List<ListModel> getListModelList(){return listModelList;}

    public void setListModelList(List<ListModel> listModelList){
        this.listModelList = listModelList;
    }

}
