// Generated by data binding compiler. Do not edit!
package com.steed.top5.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.steed.top5.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLoginBinding extends ViewDataBinding {
  @NonNull
  public final View emailBarTopSpace;

  @NonNull
  public final EditText emailInp;

  @NonNull
  public final ImageView emailInpWarning;

  @NonNull
  public final ConstraintLayout emailInputContainer;

  @NonNull
  public final View emailInputEndGap;

  @NonNull
  public final View emailInputStartGap;

  @NonNull
  public final TextView forgotPasswordBtn;

  @NonNull
  public final View forgotPasswordTopSpace;

  @NonNull
  public final ImageView icEmail;

  @NonNull
  public final View icEmailStartGap;

  @NonNull
  public final ImageView icPassword;

  @NonNull
  public final View icPasswordStartGap;

  @NonNull
  public final View loginBarTopSpace;

  @NonNull
  public final Button loginBtn;

  @NonNull
  public final LinearLayout logo;

  @NonNull
  public final View logoTopSpace;

  @NonNull
  public final TextView newAccBtn;

  @NonNull
  public final View newAccTopSpace;

  @NonNull
  public final View passwordBarTopSpace;

  @NonNull
  public final EditText passwordInp;

  @NonNull
  public final ImageView passwordInpWarning;

  @NonNull
  public final ConstraintLayout passwordInputContainer;

  @NonNull
  public final View passwordInputEndGap;

  @NonNull
  public final View passwordInputStartGap;

  @NonNull
  public final FrameLayout progressBarHolder;

  protected FragmentLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      View emailBarTopSpace, EditText emailInp, ImageView emailInpWarning,
      ConstraintLayout emailInputContainer, View emailInputEndGap, View emailInputStartGap,
      TextView forgotPasswordBtn, View forgotPasswordTopSpace, ImageView icEmail,
      View icEmailStartGap, ImageView icPassword, View icPasswordStartGap, View loginBarTopSpace,
      Button loginBtn, LinearLayout logo, View logoTopSpace, TextView newAccBtn,
      View newAccTopSpace, View passwordBarTopSpace, EditText passwordInp,
      ImageView passwordInpWarning, ConstraintLayout passwordInputContainer,
      View passwordInputEndGap, View passwordInputStartGap, FrameLayout progressBarHolder) {
    super(_bindingComponent, _root, _localFieldCount);
    this.emailBarTopSpace = emailBarTopSpace;
    this.emailInp = emailInp;
    this.emailInpWarning = emailInpWarning;
    this.emailInputContainer = emailInputContainer;
    this.emailInputEndGap = emailInputEndGap;
    this.emailInputStartGap = emailInputStartGap;
    this.forgotPasswordBtn = forgotPasswordBtn;
    this.forgotPasswordTopSpace = forgotPasswordTopSpace;
    this.icEmail = icEmail;
    this.icEmailStartGap = icEmailStartGap;
    this.icPassword = icPassword;
    this.icPasswordStartGap = icPasswordStartGap;
    this.loginBarTopSpace = loginBarTopSpace;
    this.loginBtn = loginBtn;
    this.logo = logo;
    this.logoTopSpace = logoTopSpace;
    this.newAccBtn = newAccBtn;
    this.newAccTopSpace = newAccTopSpace;
    this.passwordBarTopSpace = passwordBarTopSpace;
    this.passwordInp = passwordInp;
    this.passwordInpWarning = passwordInpWarning;
    this.passwordInputContainer = passwordInputContainer;
    this.passwordInputEndGap = passwordInputEndGap;
    this.passwordInputStartGap = passwordInputStartGap;
    this.progressBarHolder = progressBarHolder;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, null, false, component);
  }

  public static FragmentLoginBinding bind(@NonNull View view) {
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
  public static FragmentLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLoginBinding)bind(component, view, R.layout.fragment_login);
  }
}