// Generated by data binding compiler. Do not edit!
package com.steed.top5.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.makeramen.roundedimageview.RoundedImageView;
import com.steed.top5.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CommentsListSingleItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView comment;

  @NonNull
  public final ImageView deleteCommentBtn;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView reply;

  @NonNull
  public final TextView timestamp;

  @NonNull
  public final RoundedImageView userImage;

  protected CommentsListSingleItemLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView comment, ImageView deleteCommentBtn, TextView name,
      TextView reply, TextView timestamp, RoundedImageView userImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.comment = comment;
    this.deleteCommentBtn = deleteCommentBtn;
    this.name = name;
    this.reply = reply;
    this.timestamp = timestamp;
    this.userImage = userImage;
  }

  @NonNull
  public static CommentsListSingleItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.comments_list_single_item_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CommentsListSingleItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CommentsListSingleItemLayoutBinding>inflateInternal(inflater, R.layout.comments_list_single_item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static CommentsListSingleItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.comments_list_single_item_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CommentsListSingleItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CommentsListSingleItemLayoutBinding>inflateInternal(inflater, R.layout.comments_list_single_item_layout, null, false, component);
  }

  public static CommentsListSingleItemLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static CommentsListSingleItemLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (CommentsListSingleItemLayoutBinding)bind(component, view, R.layout.comments_list_single_item_layout);
  }
}
