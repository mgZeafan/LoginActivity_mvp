package com.example.mohamedg.loginactivity_mvp.CustomerList;

import com.example.mohamedg.loginactivity_mvp.model.Customer;
import com.example.mohamedg.loginactivity_mvp.model.Databs;
import com.example.mohamedg.loginactivity_mvp.model.ICustomer;

import java.util.ArrayList;

public class CustomerListPresenter implements ICustomerListPresenter {
    ICustomerListView view;

    public CustomerListPresenter(ICustomerListView view) {
        this.view = view;
    }

    @Override
    public void GetDataFromDatabase() {
        Databs databs =new Databs();
        ArrayList<ICustomer> customers=databs.Getcustomers();
        view.onReturnResult(customers);
    }
}
