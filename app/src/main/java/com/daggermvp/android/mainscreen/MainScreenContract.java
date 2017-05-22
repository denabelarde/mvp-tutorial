package com.daggermvp.android.mainscreen;

import com.daggermvp.android.models.Post;

import java.util.List;

/**
 * Created by denabelarde on 24/04/2017.
 */

public interface MainScreenContract {
    interface View {
        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {
        void loadPost();
    }
}
