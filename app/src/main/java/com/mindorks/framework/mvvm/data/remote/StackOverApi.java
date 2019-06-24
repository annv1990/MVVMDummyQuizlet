package com.mindorks.framework.mvvm.data.remote;

import com.mindorks.framework.mvvm.data.model.api.response.stackover.StackOverAnswersResponse;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StackOverApi {

    @GET("answers")
    Single<StackOverAnswersResponse> getAnswers(@Query("order") String order,
                                                @Query("sort") String sort,
                                                @Query("site") String site);
}
