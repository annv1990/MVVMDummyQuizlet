package com.mindorks.framework.mvvm.ui.stackoverfollow;

import androidx.databinding.ObservableField;

import com.mindorks.framework.mvvm.data.model.api.response.stackover.Item;
import com.mindorks.framework.mvvm.data.model.api.response.stackover.Owner;

public class AnswerItemViewModel {

    AnswerItemViewModelClickListener mListener;

    public final ObservableField<Owner> owner;

    public final ObservableField<Integer> score;

    Item mItem;

    public AnswerItemViewModel(Item item/*, AnswerItemViewModelClickListener listener*/ ) {
        mItem = item;
//        mListener = listener;
        owner = new ObservableField<>(mItem.getOwner());
        score = new ObservableField<>(mItem.getScore());
    }

    public interface AnswerItemViewModelClickListener {
        void onItemClick(String blogUrl);
    }
}
