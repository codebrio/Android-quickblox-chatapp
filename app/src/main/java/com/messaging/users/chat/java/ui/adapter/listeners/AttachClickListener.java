package com.messaging.users.chat.java.ui.adapter.listeners;

import android.view.View;

import com.quickblox.chat.model.QBAttachment;

public interface AttachClickListener {

    void onAttachmentClicked(int itemViewType, View view, QBAttachment attachment);
}