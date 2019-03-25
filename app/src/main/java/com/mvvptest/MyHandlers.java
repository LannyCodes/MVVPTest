package com.mvvptest;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by lannyxu on 2019/3/25.
 */
public class MyHandlers {

    public void onClickFriend(User user) {
//        Toast.makeText(view.getContext(), "onClickFriend", Toast.LENGTH_SHORT).show();
//        Log.d("Tag", "onClickFriend" + user.getFirstName());
    }

//    public void updateUser(User user) {
//        //自动更新到TextView中
//        user.setFirstName("MrLi");
//        user.setLastName("MrWang");
//    }

    public void updateUser(User user) {
        //自动更新到TextView中
        user.firstName.set("MrLi");
        user.lastName.set("MrWang");
    }


}
