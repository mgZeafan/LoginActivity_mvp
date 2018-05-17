package com.example.mohamedg.loginactivity_mvp.CustomerList;

import com.example.mohamedg.loginactivity_mvp.model.ICustomer;

import java.util.ArrayList;

public interface ICustomerListView {
  public void  onReturnResult(ArrayList<ICustomer> customers);
}
