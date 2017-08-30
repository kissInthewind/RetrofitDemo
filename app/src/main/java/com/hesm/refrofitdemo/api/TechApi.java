package com.hesm.refrofitdemo.api;

import com.hesm.refrofitdemo.bean.TechBean;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by hesm on 2017/8/30.
 *
 * 接口的地址  http://api.tianapi.com/keji/?key=63814c64d0a181821dd8fc10259b6e9d&num=10
 */


public interface TechApi {

    @GET("keji/")
    Call<TechBean> getTechData(@Query("key") String key , @Query("num") int num);

}
