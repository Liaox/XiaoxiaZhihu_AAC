package cn.mycommons.xiaoxiazhihu.business.api.impl.retrofit;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * RetrofitUtil <br/>
 * Created by xiaqiulei on 2016-08-24.
 */
public class RetrofitUtil {

    public static <T> T createApi(Class<T> tClass, OkHttpClient client, Gson gson) {
        return new Retrofit
                .Builder()
                .client(client)
                .baseUrl("http://news-at.zhihu.com/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(tClass);
    }
}