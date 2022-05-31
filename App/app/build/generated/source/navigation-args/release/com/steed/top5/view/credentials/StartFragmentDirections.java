package com.steed.top5.view.credentials;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.steed.top5.R;

public class StartFragmentDirections {
  private StartFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionStartFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_startFragment_to_loginFragment);
  }

  @NonNull
  public static NavDirections actionStartFragmentToSignupFragment() {
    return new ActionOnlyNavDirections(R.id.action_startFragment_to_signupFragment);
  }
}
