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

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToFiltersFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_filtersFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_profileFragment);
  }

  @NonNull
  public static ActionHomeFragmentToDetailsFragment actionHomeFragmentToDetailsFragment() {
    return new ActionHomeFragmentToDetailsFragment();
  }

  @NonNull
  public static ActionHomeFragmentToContentFragment actionHomeFragmentToContentFragment() {
    return new ActionHomeFragmentToContentFragment();
  }

  @NonNull
  public static ActionHomeFragmentToCommentsFragment actionHomeFragmentToCommentsFragment() {
    return new ActionHomeFragmentToCommentsFragment();
  }

  public static class ActionHomeFragmentToDetailsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeFragmentToDetailsFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToDetailsFragment setPostArg(@Nullable Post postArg) {
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
      return R.id.action_homeFragment_to_detailsFragment;
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
      ActionHomeFragmentToDetailsFragment that = (ActionHomeFragmentToDetailsFragment) object;
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
      return "ActionHomeFragmentToDetailsFragment(actionId=" + getActionId() + "){"
          + "postArg=" + getPostArg()
          + "}";
    }
  }

  public static class ActionHomeFragmentToContentFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeFragmentToContentFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToContentFragment setPostArg(@Nullable Post postArg) {
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
      return R.id.action_homeFragment_to_contentFragment;
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
      ActionHomeFragmentToContentFragment that = (ActionHomeFragmentToContentFragment) object;
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
      return "ActionHomeFragmentToContentFragment(actionId=" + getActionId() + "){"
          + "postArg=" + getPostArg()
          + "}";
    }
  }

  public static class ActionHomeFragmentToCommentsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeFragmentToCommentsFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToCommentsFragment setPostArg(@Nullable Post postArg) {
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
      return R.id.action_homeFragment_to_commentsFragment;
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
      ActionHomeFragmentToCommentsFragment that = (ActionHomeFragmentToCommentsFragment) object;
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
      return "ActionHomeFragmentToCommentsFragment(actionId=" + getActionId() + "){"
          + "postArg=" + getPostArg()
          + "}";
    }
  }
}
