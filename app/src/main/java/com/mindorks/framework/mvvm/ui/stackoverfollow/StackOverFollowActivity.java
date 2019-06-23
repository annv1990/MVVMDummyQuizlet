package com.mindorks.framework.mvvm.ui.stackoverfollow;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.mindorks.framework.mvvm.BR;
import com.mindorks.framework.mvvm.R;
import com.mindorks.framework.mvvm.ViewModelProviderFactory;
import com.mindorks.framework.mvvm.databinding.ActivityStackoverBinding;
import com.mindorks.framework.mvvm.ui.base.BaseActivity;
import com.mindorks.framework.mvvm.ui.main.MainActivity;

import javax.inject.Inject;

public class StackOverFollowActivity extends BaseActivity<ActivityStackoverBinding, StackOverFollowViewModel>
        implements StackOverNavigator {

    @Inject
    ViewModelProviderFactory mFactory;

    StackOverFollowViewModel mModel;

    ActivityStackoverBinding mBinding;

    public static Intent newIntent(Context context) {
        return new Intent(context, StackOverFollowActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = getViewDataBinding();
        mModel.setNavigator(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_stackover;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.newIntent(StackOverFollowActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    public StackOverFollowViewModel getViewModel() {
        mModel = ViewModelProviders.of(this, mFactory).get(StackOverFollowViewModel.class);
        return mModel;
    }
}
