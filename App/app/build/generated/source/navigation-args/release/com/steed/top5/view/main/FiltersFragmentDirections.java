package com.steed.top5.view.main;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.steed.top5.R;

public class FiltersFragmentDirections {
  private FiltersFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFiltersFragmentToProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_filtersFragment_to_profileFragment);
  }
}
