package com.messaging.users.chat.java.utils.imagepick;

import com.messaging.users.chat.java.utils.imagepick.fragment.ImagePickHelperFragment;
import com.messaging.users.chat.java.utils.imagepick.fragment.ImageSourcePickDialogFragment;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public class ImagePickHelper {

    public void pickAnImage(FragmentActivity activity, int requestCode) {
        ImagePickHelperFragment imagePickHelperFragment = ImagePickHelperFragment.start(activity, requestCode);
        showImageSourcePickerDialog(activity.getSupportFragmentManager(), imagePickHelperFragment);
    }

    private void showImageSourcePickerDialog(FragmentManager fm, ImagePickHelperFragment fragment) {
        ImageSourcePickDialogFragment.show(fm,
                new ImageSourcePickDialogFragment.LoggableActivityImageSourcePickedListener(fragment));
    }
}