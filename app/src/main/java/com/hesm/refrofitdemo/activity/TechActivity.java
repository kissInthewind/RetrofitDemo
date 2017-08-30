package com.hesm.refrofitdemo.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.hesm.refrofitdemo.R;
import com.hesm.refrofitdemo.adapter.TechAdapter;
import com.hesm.refrofitdemo.api.TechApi;
import com.hesm.refrofitdemo.bean.TechBean;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 科技新闻
 */

public class TechActivity extends AppCompatActivity {

    public static void launch(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, TechActivity.class);
        context.startActivity(intent);
    }

    ListView listView;
    String baseUrl = "http://api.tianapi.com/";
    String key = "63814c64d0a181821dd8fc10259b6e9d";
    TechAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);
        listView = (ListView) findViewById(R.id.listview_tech);
        getData();

    }

    /**
     * 从天行接口获取数据
     * 接口的地址  http://api.tianapi.com/keji/?key=63814c64d0a181821dd8fc10259b6e9d&num=10
     */

    private void getData(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TechApi techApi = retrofit.create(TechApi.class);
        Call<TechBean> call = techApi.getTechData(key,10);
        call.enqueue(new Callback<TechBean>() {
            @Override
            public void onResponse(Call<TechBean> call, Response<TechBean> response) {
                Log.d("hesm",response.body().getNewslist().get(0).getTitle());
                adapter = new TechAdapter(TechActivity.this,response.body());
                listView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<TechBean> call, Throwable t) {

            }
        });
    }


}
