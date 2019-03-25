package com.mvvptest;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by lannyxu on 2019/3/25.
 */
//public class User extends BaseObservable {
//
//    private String firstName;
//    private String lastName;
//
//    public User(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    @Bindable
//    public String getFirstName() {
//        return firstName;
//    }
//
//    @Bindable
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//        notifyPropertyChanged(com.mvvptest.BR.firstName);
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//        notifyPropertyChanged(com.mvvptest.BR.lastName);
//    }
//}

public class User extends BaseObservable {

    public final ObservableField<String> firstName =
            new ObservableField<>();

    public final ObservableField<String> lastName =
            new ObservableField<>();
}

