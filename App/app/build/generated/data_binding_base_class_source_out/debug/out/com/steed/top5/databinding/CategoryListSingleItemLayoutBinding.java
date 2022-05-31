// Generated by data binding compiler. Do not edit!
package com.steed.top5.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.steed.top5.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CategoryListSingleItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ImageView categoryImage;

  @NonNull
  public final ConstraintLayout categoryImageContainer;

  @NonNull
  public final TextView categoryNameTextView;

  protected CategoryListSingleItemLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView categoryImage, ConstraintLayout categoryImageContainer,
      TextView categoryNameTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.categoryImage = categoryImage;
    this.categoryImageContainer = categoryImageContainer;
    this.categoryNameTextView = categoryNameTextView;
  }

  @NonNull
  public static CategoryListSingleItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.category_list_single_item_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CategoryListSingleItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CategoryListSingleItemLayoutBinding>inflateInternal(inflater, R.layout.category_list_single_item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static CategoryListSingleItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.category_list_single_item_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CategoryListSingleItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CategoryListSingleItemLayoutBinding>inflateInternal(inflater, R.layout.category_list_single_item_layout, null, false, component);
  }

  public static CategoryListSingleItemLayoutBinding bind(@NonNull View view) {
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
  public static CategoryListSingleItemLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (CategoryListSingleItemLayoutBinding)bind(component, view, R.layout.category_list_single_item_layout);
  }
}