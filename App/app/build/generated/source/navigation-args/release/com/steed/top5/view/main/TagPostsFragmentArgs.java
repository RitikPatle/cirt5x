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

public class TagPostsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private TagPostsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private TagPostsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static TagPostsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    TagPostsFragmentArgs __result = new TagPostsFragmentArgs();
    bundle.setClassLoader(TagPostsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("tagNameArg")) {
      String tagNameArg;
      tagNameArg = bundle.getString("tagNameArg");
      if (tagNameArg == null) {
        throw new IllegalArgumentException("Argument \"tagNameArg\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("tagNameArg", tagNameArg);
    } else {
      throw new IllegalArgumentException("Required argument \"tagNameArg\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static TagPostsFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    TagPostsFragmentArgs __result = new TagPostsFragmentArgs();
    if (savedStateHandle.contains("tagNameArg")) {
      String tagNameArg;
      tagNameArg = savedStateHandle.get("tagNameArg");
      if (tagNameArg == null) {
        throw new IllegalArgumentException("Argument \"tagNameArg\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("tagNameArg", tagNameArg);
    } else {
      throw new IllegalArgumentException("Required argument \"tagNameArg\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getTagNameArg() {
    return (String) arguments.get("tagNameArg");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("tagNameArg")) {
      String tagNameArg = (String) arguments.get("tagNameArg");
      __result.putString("tagNameArg", tagNameArg);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("tagNameArg")) {
      String tagNameArg = (String) arguments.get("tagNameArg");
      __result.set("tagNameArg", tagNameArg);
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
    TagPostsFragmentArgs that = (TagPostsFragmentArgs) object;
    if (arguments.containsKey("tagNameArg") != that.arguments.containsKey("tagNameArg")) {
      return false;
    }
    if (getTagNameArg() != null ? !getTagNameArg().equals(that.getTagNameArg()) : that.getTagNameArg() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getTagNameArg() != null ? getTagNameArg().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "TagPostsFragmentArgs{"
        + "tagNameArg=" + getTagNameArg()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull TagPostsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String tagNameArg) {
      if (tagNameArg == null) {
        throw new IllegalArgumentException("Argument \"tagNameArg\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tagNameArg", tagNameArg);
    }

    @NonNull
    public TagPostsFragmentArgs build() {
      TagPostsFragmentArgs result = new TagPostsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setTagNameArg(@NonNull String tagNameArg) {
      if (tagNameArg == null) {
        throw new IllegalArgumentException("Argument \"tagNameArg\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tagNameArg", tagNameArg);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getTagNameArg() {
      return (String) arguments.get("tagNameArg");
    }
  }
}
