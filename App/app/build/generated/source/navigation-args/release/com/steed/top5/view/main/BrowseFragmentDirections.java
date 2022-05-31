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
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class BrowseFragmentDirections {
  private BrowseFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionBrowseFragmentToFiltersFragment() {
    return new ActionOnlyNavDirections(R.id.action_browseFragment_to_filtersFragment);
  }

  @NonNull
  public static NavDirections actionBrowseFragmentToProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_browseFragment_to_profileFragment);
  }

  @NonNull
  public static ActionBrowseFragmentToDetailsFragment actionBrowseFragmentToDetailsFragment() {
    return new ActionBrowseFragmentToDetailsFragment();
  }

  @NonNull
  public static ActionBrowseFragmentToCommentsFragment actionBrowseFragmentToCommentsFragment() {
    return new ActionBrowseFragmentToCommentsFragment();
  }

  @NonNull
  public static ActionBrowseFragmentToContentFragment actionBrowseFragmentToContentFragment() {
    return new ActionBrowseFragmentToContentFragment();
  }

  @NonNull
  public static ActionBrowseFragmentToTagPostsFragment actionBrowseFragmentToTagPostsFragment(
      @NonNull String tagNameArg) {
    return new ActionBrowseFragmentToTagPostsFragment(tagNameArg);
  }

  public static class ActionBrowseFragmentToDetailsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionBrowseFragmentToDetailsFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionBrowseFragmentToDetailsFragment setPostArg(@Nullable Post postArg) {
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
      return R.id.action_browseFragment_to_detailsFragment;
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
      ActionBrowseFragmentToDetailsFragment that = (ActionBrowseFragmentToDetailsFragment) object;
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
      return "ActionBrowseFragmentToDetailsFragment(actionId=" + getActionId() + "){"
          + "postArg=" + getPostArg()
          + "}";
    }
  }

  public static class ActionBrowseFragmentToCommentsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionBrowseFragmentToCommentsFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionBrowseFragmentToCommentsFragment setPostArg(@Nullable Post postArg) {
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
      return R.id.action_browseFragment_to_commentsFragment;
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
      ActionBrowseFragmentToCommentsFragment that = (ActionBrowseFragmentToCommentsFragment) object;
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
      return "ActionBrowseFragmentToCommentsFragment(actionId=" + getActionId() + "){"
          + "postArg=" + getPostArg()
          + "}";
    }
  }

  public static class ActionBrowseFragmentToContentFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionBrowseFragmentToContentFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionBrowseFragmentToContentFragment setPostArg(@Nullable Post postArg) {
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
      return R.id.action_browseFragment_to_contentFragment;
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
      ActionBrowseFragmentToContentFragment that = (ActionBrowseFragmentToContentFragment) object;
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
      return "ActionBrowseFragmentToContentFragment(actionId=" + getActionId() + "){"
          + "postArg=" + getPostArg()
          + "}";
    }
  }

  public static class ActionBrowseFragmentToTagPostsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionBrowseFragmentToTagPostsFragment(@NonNull String tagNameArg) {
      if (tagNameArg == null) {
        throw new IllegalArgumentException("Argument \"tagNameArg\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tagNameArg", tagNameArg);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionBrowseFragmentToTagPostsFragment setTagNameArg(@NonNull String tagNameArg) {
      if (tagNameArg == null) {
        throw new IllegalArgumentException("Argument \"tagNameArg\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tagNameArg", tagNameArg);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("tagNameArg")) {
        String tagNameArg = (String) arguments.get("tagNameArg");
        __result.putString("tagNameArg", tagNameArg);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_browseFragment_to_tagPostsFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTagNameArg() {
      return (String) arguments.get("tagNameArg");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionBrowseFragmentToTagPostsFragment that = (ActionBrowseFragmentToTagPostsFragment) object;
      if (arguments.containsKey("tagNameArg") != that.arguments.containsKey("tagNameArg")) {
        return false;
      }
      if (getTagNameArg() != null ? !getTagNameArg().equals(that.getTagNameArg()) : that.getTagNameArg() != null) {
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
      result = 31 * result + (getTagNameArg() != null ? getTagNameArg().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionBrowseFragmentToTagPostsFragment(actionId=" + getActionId() + "){"
          + "tagNameArg=" + getTagNameArg()
          + "}";
    }
  }
}
