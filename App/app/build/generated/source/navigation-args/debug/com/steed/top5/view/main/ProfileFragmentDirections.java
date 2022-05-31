package com.steed.top5.view.main;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.steed.top5.R;

public class ProfileFragmentDirections {
  private ProfileFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionProfileFragmentToFiltersFragment() {
    return new ActionOnlyNavDirections(R.id.action_profileFragment_to_filtersFragment);
  }

  @NonNull
  public static NavDirections actionProfileFragmentToCredentialsActivity() {
    return new ActionOnlyNavDirections(R.id.action_profileFragment_to_credentialsActivity);
  }
}
