package com.steed.top5.view.main;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.steed.top5.R;

public class UserPrefFragmentDirections {
  private UserPrefFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionUserPrefFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_userPrefFragment_to_homeFragment);
  }
}
