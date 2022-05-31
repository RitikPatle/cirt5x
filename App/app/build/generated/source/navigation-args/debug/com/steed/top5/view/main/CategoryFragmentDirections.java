package com.steed.top5.view.main;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.steed.top5.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CategoryFragmentDirections {
  private CategoryFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionCategoryFragmentToProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_categoryFragment_to_profileFragment);
  }

  @NonNull
  public static NavDirections actionCategoryFragmentToFiltersFragment() {
    return new ActionOnlyNavDirections(R.id.action_categoryFragment_to_filtersFragment);
  }

  @NonNull
  public static ActionCategoryFragmentToPostsByCategoryFragment actionCategoryFragmentToPostsByCategoryFragment(
      @NonNull String categoryID) {
    return new ActionCategoryFragmentToPostsByCategoryFragment(categoryID);
  }

  public static class ActionCategoryFragmentToPostsByCategoryFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionCategoryFragmentToPostsByCategoryFragment(@NonNull String categoryID) {
      if (categoryID == null) {
        throw new IllegalArgumentException("Argument \"categoryID\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("categoryID", categoryID);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionCategoryFragmentToPostsByCategoryFragment setCategoryID(
        @NonNull String categoryID) {
      if (categoryID == null) {
        throw new IllegalArgumentException("Argument \"categoryID\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("categoryID", categoryID);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("categoryID")) {
        String categoryID = (String) arguments.get("categoryID");
        __result.putString("categoryID", categoryID);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_categoryFragment_to_postsByCategoryFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCategoryID() {
      return (String) arguments.get("categoryID");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionCategoryFragmentToPostsByCategoryFragment that = (ActionCategoryFragmentToPostsByCategoryFragment) object;
      if (arguments.containsKey("categoryID") != that.arguments.containsKey("categoryID")) {
        return false;
      }
      if (getCategoryID() != null ? !getCategoryID().equals(that.getCategoryID()) : that.getCategoryID() != null) {
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
      result = 31 * result + (getCategoryID() != null ? getCategoryID().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionCategoryFragmentToPostsByCategoryFragment(actionId=" + getActionId() + "){"
          + "categoryID=" + getCategoryID()
          + "}";
    }
  }
}
