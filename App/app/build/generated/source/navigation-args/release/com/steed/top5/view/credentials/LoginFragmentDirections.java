package com.steed.top5.view.credentials;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.steed.top5.R;
import com.steed.top5.pojo.User;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToSignupFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_signupFragment);
  }

  @NonNull
  public static ActionLoginFragmentToMainActivity actionLoginFragmentToMainActivity() {
    return new ActionLoginFragmentToMainActivity();
  }

  @NonNull
  public static NavDirections actionLoginFragmentToForgotPasswordFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_forgotPasswordFragment);
  }

  public static class ActionLoginFragmentToMainActivity implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionLoginFragmentToMainActivity() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionLoginFragmentToMainActivity setUserArg(@Nullable User userArg) {
      this.arguments.put("userArg", userArg);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("userArg")) {
        User userArg = (User) arguments.get("userArg");
        if (Parcelable.class.isAssignableFrom(User.class) || userArg == null) {
          __result.putParcelable("userArg", Parcelable.class.cast(userArg));
        } else if (Serializable.class.isAssignableFrom(User.class)) {
          __result.putSerializable("userArg", Serializable.class.cast(userArg));
        } else {
          throw new UnsupportedOperationException(User.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      } else {
        __result.putSerializable("userArg", null);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_loginFragment_to_mainActivity;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public User getUserArg() {
      return (User) arguments.get("userArg");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionLoginFragmentToMainActivity that = (ActionLoginFragmentToMainActivity) object;
      if (arguments.containsKey("userArg") != that.arguments.containsKey("userArg")) {
        return false;
      }
      if (getUserArg() != null ? !getUserArg().equals(that.getUserArg()) : that.getUserArg() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getUserArg() != null ? getUserArg().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionLoginFragmentToMainActivity(actionId=" + getActionId() + "){"
          + "userArg=" + getUserArg()
          + "}";
    }
  }
}