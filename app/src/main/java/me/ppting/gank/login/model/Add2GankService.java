package me.ppting.gank.login.model;

import java.util.Map;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by PPTing on 2016/10/13.
 */

public interface Add2GankService {
    @Headers("Content-type:application/x-www-form-urlencoded;charset=UTF-8")
    @FormUrlEncoded
    @POST("/api/add2gank")
    Call<ResponseBody> add2Gank(@FieldMap Map<String,Object> map);
}
