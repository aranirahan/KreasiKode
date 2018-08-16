package com.aranirahan.city.api;

import com.aranirahan.city.model.city.ItemCity;
import com.aranirahan.city.model.province.ItemProvince;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiService {

    @GET("province")
    @Headers("key:0cb08732d0064245f748121c208963ca")
    Call<ItemProvince> getProvince ();

    @GET("city")
    @Headers("key:0cb08732d0064245f748121c208963ca")
    Call<ItemCity> getCity (@Query("province") String province);


}
