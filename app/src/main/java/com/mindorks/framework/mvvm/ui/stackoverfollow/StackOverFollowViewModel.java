package com.mindorks.framework.mvvm.ui.stackoverfollow;

import android.util.Log;

import com.mindorks.framework.mvvm.constants.Constants;
import com.mindorks.framework.mvvm.data.DataManager;
import com.mindorks.framework.mvvm.ui.base.BaseViewModel;
import com.mindorks.framework.mvvm.utils.AppLogger;
import com.mindorks.framework.mvvm.utils.rx.SchedulerProvider;

import timber.log.Timber;

public class StackOverFollowViewModel extends BaseViewModel {

    public StackOverFollowViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {

        super(dataManager, schedulerProvider);
    }

    public void fetchStackOverAnswers(String order, String sort, String site){
        setIsLoading(true);
        getCompositeDisposable().add(
                getDataManager().fetchStackOverAnswers(order, sort, site)
        .subscribeOn(getSchedulerProvider().io())
        .observeOn(getSchedulerProvider().ui())
        .subscribe(response -> {
            setIsLoading(false);
            Log.d(Constants.TAG, "fetchStackOverAnswers OK");
            AppLogger.d(Constants.TAG, "fetchStackOverAnswers OK");
        }, throwable -> {
            setIsLoading(false);
            Log.d(Constants.TAG, "fetchStackOverAnswers FAIL");
            AppLogger.d(Constants.TAG, "fetchStackOverAnswers FAIL");
        }));

    }

}
