package com.steed.top5.view.main;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.steed.top5.pojo.User;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MainActivityArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private MainActivityArgs() {
  }

  @SuppressWarnings("unchecked")
  private MainActivityArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MainActivityArgs fromBundle(@NonNull Bundle bundle) {
    MainActivityArgs __result = new MainActivityArgs();
    bundle.setClassLoader(MainActivityArgs.class.getClassLoader());
    if (bundle.containsKey("userArg")) {
      User userArg;
      if (Parcelable.class.isAssignableFrom(User.class) || Serializable.class.isAssignableFrom(User.class)) {
        userArg = (User) bundle.get("userArg");
      } else {
        throw new UnsupportedOperationException(User.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      __result.arguments.put("userArg", userArg);
    } else {
      __result.arguments.put("userArg", null);
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MainActivityArgs fromSavedStateHandle(@NonNull SavedStateHandle savedStateHandle) {
    MainActivityArgs __result = new MainActivityArgs();
    if (savedStateHandle.contains("userArg")) {
      User userArg;
      userArg = savedStateHandle.get("userArg");
      __result.arguments.put("userArg", userArg);
    } else {
      __result.arguments.put("userArg", null);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public User getUserArg() {
    return (User) arguments.get("userArg");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("userArg")) {
      User userArg = (User) arguments.get("userArg");
      if (Parcelable.class.isAssignableFrom(User.class) || userArg == null) {
        __result.set("userArg", Parcelable.class.cast(userArg));
      } else if (Serializable.class.isAssignableFrom(User.class)) {
        __result.set("userArg", Serializable.class.cast(userArg));
      } else {
        throw new UnsupportedOperationException(User.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    } else {
      __result.set("userArg", null);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    MainActivityArgs that = (MainActivityArgs) object;
    if (arguments.containsKey("userArg") != that.arguments.containsKey("userArg")) {
      return false;
    }
    if (getUserArg() != null ? !getUserArg().equals(that.getUserArg()) : that.getUserArg() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getUserArg() != null ? getUserArg().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "MainActivityArgs{"
        + "userArg=" + getUserArg()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull MainActivityArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public MainActivityArgs build() {
      MainActivityArgs result = new MainActivityArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setUserArg(@Nullable User userArg) {
      this.arguments.put("userArg", userArg);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @Nullable
    public User getUserArg() {
      return (User) arguments.get("userArg");
    }
  }
}
