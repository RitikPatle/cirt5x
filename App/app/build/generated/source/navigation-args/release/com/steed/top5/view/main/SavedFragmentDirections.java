package com.steed.top5.view.main;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.steed.top5.R;
import com.steed.top5.pojo.Post;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SavedFragmentDirections {
  private SavedFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSavedFragmentToProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_savedFragment_to_profileFragment);
  }

  @NonNull
  public static NavDirections actionSavedFragmentToFiltersFragment() {
    return new ActionOnlyNavDirections(R.id.action_savedFragment_to_filtersFragment);
  }

  @NonNull
  public static ActionSavedFragmentToCommentsFragment actionSavedFragmentToCommentsFragment() {
    return new ActionSavedFragmentToCommentsFragment();
  }

  @NonNull
  public static ActionSavedFragmentToContentFragment actionSavedFragmentToContentFragment() {
    return new ActionSavedFragmentToContentFragment();
  }

  public static class ActionSavedFragmentToCommentsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionSavedFragmentToCommentsFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSavedFragmentToCommentsFragment setPostArg(@Nullable Post postArg) {
      this.arguments.put("postArg", postArg);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.action_savedFragment_to_commentsFragment;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public Post getPostArg() {
      return (Post) arguments.get("postArg");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSavedFragmentToCommentsFragment that = (ActionSavedFragmentToCommentsFragment) object;
      if (arguments.containsKey("postArg") != that.arguments.containsKey("postArg")) {
        return false;
      }
      if (getPostArg() != null ? !getPostArg().equals(that.getPostArg()) : that.getPostArg() != null) {
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
      result = 31 * result + (getPostArg() != null ? getPostArg().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSavedFragmentToCommentsFragment(actionId=" + getActionId() + "){"
          + "postArg=" + getPostArg()
          + "}";
    }
  }

  public static class ActionSavedFragmentToContentFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionSavedFragmentToContentFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSavedFragmentToContentFragment setPostArg(@Nullable Post postArg) {
      this.arguments.put("postArg", postArg);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.action_savedFragment_to_contentFragment;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public Post getPostArg() {
      return (Post) arguments.get("postArg");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSavedFragmentToContentFragment that = (ActionSavedFragmentToContentFragment) object;
      if (arguments.containsKey("postArg") != that.arguments.containsKey("postArg")) {
        return false;
      }
      if (getPostArg() != null ? !getPostArg().equals(that.getPostArg()) : that.getPostArg() != null) {
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
      result = 31 * result + (getPostArg() != null ? getPostArg().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSavedFragmentToContentFragment(actionId=" + getActionId() + "){"
          + "postArg=" + getPostArg()
          + "}";
    }
  }
}
