package com.mindorks.framework.mvvm.data.remote;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Singleton
public class RetrofitService<S> {

    RetrofitService mRetrofitService;

    @Inject
    public RetrofitService(RetrofitService service) {
        mRetrofitService = service;
    }

    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.stackexchange.com/2.2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    public S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }

}
