package com.example.mohamedg.loginactivity_mvp.CustomerList.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mohamedg.loginactivity_mvp.R;
import com.example.mohamedg.loginactivity_mvp.model.ICustomer;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class CustomerListAdapter extends BaseAdapter {
    Context _customerListActivity;
    ArrayList<ICustomer> _customers;
    public CustomerListAdapter(Context customerListActivity, ArrayList<ICustomer> customers) {
        this._customerListActivity=customerListActivity;
        this._customers=customers;
    }

    @Override
    public int getCount() {
        return _customers.size();
    }

    @Override
    public Object getItem(int position) {
        return _customers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view==null)
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_item,null);
        return ReturnView(view,position);
    }

    private View ReturnView(View view, int position) {
        ImageView imageView=view.findViewById(R.id.imgCard);
        TextView texttitle=view.findViewById(R.id.txtTitle);
        TextView textdetail=view.findViewById(R.id.txtDetails);
        Picasso.with(_customerListActivity).load(_customers.get(position).getURLImage()).fit().into(imageView);
        texttitle.setText(_customers.get(position).getTitle());
        textdetail.setText(_customers.get(position).getDetails());
        return view;

    }
}
