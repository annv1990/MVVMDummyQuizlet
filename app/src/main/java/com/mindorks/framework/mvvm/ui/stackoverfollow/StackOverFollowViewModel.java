package com.mindorks.framework.mvvm.ui.stackoverfollow;

import com.mindorks.framework.mvvm.data.DataManager;
import com.mindorks.framework.mvvm.ui.base.BaseViewModel;
import com.mindorks.framework.mvvm.utils.rx.SchedulerProvider;

public class StackOverFollowViewModel extends BaseViewModel {

    public StackOverFollowViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {

        super(dataManager, schedulerProvider);
    }

}
