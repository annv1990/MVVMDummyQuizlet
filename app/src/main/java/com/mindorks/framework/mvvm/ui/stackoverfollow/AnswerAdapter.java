package com.mindorks.framework.mvvm.ui.stackoverfollow;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mindorks.framework.mvvm.data.model.api.response.stackover.Item;
import com.mindorks.framework.mvvm.ui.base.BaseViewHolder;

import java.util.List;

public class AnswerAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    List<Item> mAnswers;

    public AnswerAdapter( List<Item> items){
        mAnswers = items;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {

    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemCount() {
        return mAnswers.size();
    }
}
