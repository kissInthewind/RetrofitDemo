package com.hesm.refrofitdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hesm.refrofitdemo.R;
import com.hesm.refrofitdemo.bean.TechBean;

import java.util.List;

/**
 * Created by hesm on 2017/8/30.
 */

public class TechAdapter extends BaseAdapter {

    Context context;
    TechBean bean;

    public TechAdapter(Context context, TechBean bean) {
        this.context = context;
        this.bean = bean;
    }

    @Override
    public int getCount() {
        return bean.getNewslist().size();
    }

    @Override
    public Object getItem(int i) {
        return bean.getNewslist().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        LayoutInflater mInflater = LayoutInflater.from(context);
        if (null == view) {
            viewHolder = new ViewHolder();
            view = mInflater.inflate(R.layout.adapter_tech_item,null);
            viewHolder.textView =(TextView) view.findViewById(R.id.textview_title);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if (null!=bean && bean.getNewslist().size()>0){
            viewHolder.textView.setText(bean.getNewslist().get(i).getTitle());
        }
        return view;
    }

    public class ViewHolder {
        TextView textView;
    }
}
