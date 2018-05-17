package com.example.mohamedg.loginactivity_mvp.CustomerList;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.mohamedg.loginactivity_mvp.CustomerList.adapter.CustomerListAdapter;
import com.example.mohamedg.loginactivity_mvp.R;
import com.example.mohamedg.loginactivity_mvp.model.ICustomer;

import java.util.ArrayList;

public class CustomerListActivity extends AppCompatActivity implements ICustomerListView {
ListView listCustomer;
ArrayList<ICustomer> customers;
ICustomerListPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);
        InilizeUI();
        presenter=new CustomerListPresenter(this);
        presenter.GetDataFromDatabase();
        CustomerListAdapter customerList=new CustomerListAdapter(this,customers);
        listCustomer.setAdapter(customerList);
    }

    private void InilizeUI() {
    listCustomer=findViewById(R.id.listView);
    }

    @Override
    public void onReturnResult(ArrayList<ICustomer> _customers) {
        this.customers=_customers;
        listCustomer.deferNotifyDataSetChanged();
    }
}
