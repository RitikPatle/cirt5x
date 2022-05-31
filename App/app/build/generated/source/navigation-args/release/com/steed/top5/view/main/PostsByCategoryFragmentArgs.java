package com.steed.top5.view.main;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class PostsByCategoryFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private PostsByCategoryFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private PostsByCategoryFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PostsByCategoryFragmentArgs fromBundle(@NonNull Bundle bundle) {
    PostsByCategoryFragmentArgs __result = new PostsByCategoryFragmentArgs();
    bundle.setClassLoader(PostsByCategoryFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("categoryID")) {
      String categoryID;
      categoryID = bundle.getString("categoryID");
      if (categoryID == null) {
        throw new IllegalArgumentException("Argument \"categoryID\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("categoryID", categoryID);
    } else {
      throw new IllegalArgumentException("Required argument \"categoryID\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PostsByCategoryFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    PostsByCategoryFragmentArgs __result = new PostsByCategoryFragmentArgs();
    if (savedStateHandle.contains("categoryID")) {
      String categoryID;
      categoryID = savedStateHandle.get("categoryID");
      if (categoryID == null) {
        throw new IllegalArgumentException("Argument \"categoryID\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("categoryID", categoryID);
    } else {
      throw new IllegalArgumentException("Required argument \"categoryID\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getCategoryID() {
    return (String) arguments.get("categoryID");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("categoryID")) {
      String categoryID = (String) arguments.get("categoryID");
      __result.putString("categoryID", categoryID);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("categoryID")) {
      String categoryID = (String) arguments.get("categoryID");
      __result.set("categoryID", categoryID);
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
    PostsByCategoryFragmentArgs that = (PostsByCategoryFragmentArgs) object;
    if (arguments.containsKey("categoryID") != that.arguments.containsKey("categoryID")) {
      return false;
    }
    if (getCategoryID() != null ? !getCategoryID().equals(that.getCategoryID()) : that.getCategoryID() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getCategoryID() != null ? getCategoryID().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "PostsByCategoryFragmentArgs{"
        + "categoryID=" + getCategoryID()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull PostsByCategoryFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String categoryID) {
      if (categoryID == null) {
        throw new IllegalArgumentException("Argument \"categoryID\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("categoryID", categoryID);
    }

    @NonNull
    public PostsByCategoryFragmentArgs build() {
      PostsByCategoryFragmentArgs result = new PostsByCategoryFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setCategoryID(@NonNull String categoryID) {
      if (categoryID == null) {
        throw new IllegalArgumentException("Argument \"categoryID\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("categoryID", categoryID);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getCategoryID() {
      return (String) arguments.get("categoryID");
    }
  }
}
