package com.steed.top5.view.main;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.steed.top5.pojo.Post;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CommentsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private CommentsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private CommentsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static CommentsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    CommentsFragmentArgs __result = new CommentsFragmentArgs();
    bundle.setClassLoader(CommentsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("postArg")) {
      Post postArg;
      if (Parcelable.class.isAssignableFrom(Post.class) || Serializable.class.isAssignableFrom(Post.class)) {
        postArg = (Post) bundle.get("postArg");
      } else {
        throw new UnsupportedOperationException(Post.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      __result.arguments.put("postArg", postArg);
    } else {
      __result.arguments.put("postArg", null);
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static CommentsFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    CommentsFragmentArgs __result = new CommentsFragmentArgs();
    if (savedStateHandle.contains("postArg")) {
      Post postArg;
      postArg = savedStateHandle.get("postArg");
      __result.arguments.put("postArg", postArg);
    } else {
      __result.arguments.put("postArg", null);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public Post getPostArg() {
    return (Post) arguments.get("postArg");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("postArg")) {
      Post postArg = (Post) arguments.get("postArg");
      if (Parcelable.class.isAssignableFrom(Post.class) || postArg == null) {
        __result.putParcelable("postArg", Parcelable.class.cast(postArg));
      } else if (Serializable.class.isAssignableFrom(Post.class)) {
        __result.putSerializable("postArg", Serializable.class.cast(postArg));
      } else {
        throw new UnsupportedOperationException(Post.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    } else {
      __result.putSerializable("postArg", null);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("postArg")) {
      Post postArg = (Post) arguments.get("postArg");
      if (Parcelable.class.isAssignableFrom(Post.class) || postArg == null) {
        __result.set("postArg", Parcelable.class.cast(postArg));
      } else if (Serializable.class.isAssignableFrom(Post.class)) {
        __result.set("postArg", Serializable.class.cast(postArg));
      } else {
        throw new UnsupportedOperationException(Post.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    } else {
      __result.set("postArg", null);
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
    CommentsFragmentArgs that = (CommentsFragmentArgs) object;
    if (arguments.containsKey("postArg") != that.arguments.containsKey("postArg")) {
      return false;
    }
    if (getPostArg() != null ? !getPostArg().equals(that.getPostArg()) : that.getPostArg() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getPostArg() != null ? getPostArg().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "CommentsFragmentArgs{"
        + "postArg=" + getPostArg()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull CommentsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public CommentsFragmentArgs build() {
      CommentsFragmentArgs result = new CommentsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPostArg(@Nullable Post postArg) {
      this.arguments.put("postArg", postArg);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @Nullable
    public Post getPostArg() {
      return (Post) arguments.get("postArg");
    }
  }
}
