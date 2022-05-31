package com.steed.top5;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.steed.top5.databinding.ActivityMainBindingImpl;
import com.steed.top5.databinding.ActivityPhotoPickerBindingImpl;
import com.steed.top5.databinding.BrowseCategoriesListSingleItemViewBindingImpl;
import com.steed.top5.databinding.CategoriesListSingleItemViewBindingImpl;
import com.steed.top5.databinding.CategoryListSingleItemLayoutBindingImpl;
import com.steed.top5.databinding.CommentsListSingleItemLayoutBindingImpl;
import com.steed.top5.databinding.FragmentBrowseBindingImpl;
import com.steed.top5.databinding.FragmentCategoryBindingImpl;
import com.steed.top5.databinding.FragmentCommentsBindingImpl;
import com.steed.top5.databinding.FragmentContentBindingImpl;
import com.steed.top5.databinding.FragmentDetailsBindingImpl;
import com.steed.top5.databinding.FragmentFiltersBindingImpl;
import com.steed.top5.databinding.FragmentForgotPasswordBindingImpl;
import com.steed.top5.databinding.FragmentHomeBindingImpl;
import com.steed.top5.databinding.FragmentLoginBindingImpl;
import com.steed.top5.databinding.FragmentPostsByCategoryBindingImpl;
import com.steed.top5.databinding.FragmentProfileBindingImpl;
import com.steed.top5.databinding.FragmentSavedBindingImpl;
import com.steed.top5.databinding.FragmentSignupBindingImpl;
import com.steed.top5.databinding.FragmentSplashBindingImpl;
import com.steed.top5.databinding.FragmentStartBindingImpl;
import com.steed.top5.databinding.FragmentTagPostsBindingImpl;
import com.steed.top5.databinding.FragmentUserPrefBindingImpl;
import com.steed.top5.databinding.InterestsListSingleItemViewBindingImpl;
import com.steed.top5.databinding.PopularListSingleItemViewBindingImpl;
import com.steed.top5.databinding.PreferenceItemsListSingleItemLayoutBindingImpl;
import com.steed.top5.databinding.ProfileInterestsListSingleItemLayoutBindingImpl;
import com.steed.top5.databinding.SearchItemsListSingleItemLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYPHOTOPICKER = 2;

  private static final int LAYOUT_BROWSECATEGORIESLISTSINGLEITEMVIEW = 3;

  private static final int LAYOUT_CATEGORIESLISTSINGLEITEMVIEW = 4;

  private static final int LAYOUT_CATEGORYLISTSINGLEITEMLAYOUT = 5;

  private static final int LAYOUT_COMMENTSLISTSINGLEITEMLAYOUT = 6;

  private static final int LAYOUT_FRAGMENTBROWSE = 7;

  private static final int LAYOUT_FRAGMENTCATEGORY = 8;

  private static final int LAYOUT_FRAGMENTCOMMENTS = 9;

  private static final int LAYOUT_FRAGMENTCONTENT = 10;

  private static final int LAYOUT_FRAGMENTDETAILS = 11;

  private static final int LAYOUT_FRAGMENTFILTERS = 12;

  private static final int LAYOUT_FRAGMENTFORGOTPASSWORD = 13;

  private static final int LAYOUT_FRAGMENTHOME = 14;

  private static final int LAYOUT_FRAGMENTLOGIN = 15;

  private static final int LAYOUT_FRAGMENTPOSTSBYCATEGORY = 16;

  private static final int LAYOUT_FRAGMENTPROFILE = 17;

  private static final int LAYOUT_FRAGMENTSAVED = 18;

  private static final int LAYOUT_FRAGMENTSIGNUP = 19;

  private static final int LAYOUT_FRAGMENTSPLASH = 20;

  private static final int LAYOUT_FRAGMENTSTART = 21;

  private static final int LAYOUT_FRAGMENTTAGPOSTS = 22;

  private static final int LAYOUT_FRAGMENTUSERPREF = 23;

  private static final int LAYOUT_INTERESTSLISTSINGLEITEMVIEW = 24;

  private static final int LAYOUT_POPULARLISTSINGLEITEMVIEW = 25;

  private static final int LAYOUT_PREFERENCEITEMSLISTSINGLEITEMLAYOUT = 26;

  private static final int LAYOUT_PROFILEINTERESTSLISTSINGLEITEMLAYOUT = 27;

  private static final int LAYOUT_SEARCHITEMSLISTSINGLEITEMLAYOUT = 28;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(28);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.activity_photo_picker, LAYOUT_ACTIVITYPHOTOPICKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.browse_categories_list_single_item_view, LAYOUT_BROWSECATEGORIESLISTSINGLEITEMVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.categories_list_single_item_view, LAYOUT_CATEGORIESLISTSINGLEITEMVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.category_list_single_item_layout, LAYOUT_CATEGORYLISTSINGLEITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.comments_list_single_item_layout, LAYOUT_COMMENTSLISTSINGLEITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_browse, LAYOUT_FRAGMENTBROWSE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_category, LAYOUT_FRAGMENTCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_comments, LAYOUT_FRAGMENTCOMMENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_content, LAYOUT_FRAGMENTCONTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_details, LAYOUT_FRAGMENTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_filters, LAYOUT_FRAGMENTFILTERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_forgot_password, LAYOUT_FRAGMENTFORGOTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_posts_by_category, LAYOUT_FRAGMENTPOSTSBYCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_saved, LAYOUT_FRAGMENTSAVED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_signup, LAYOUT_FRAGMENTSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_start, LAYOUT_FRAGMENTSTART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_tag_posts, LAYOUT_FRAGMENTTAGPOSTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.fragment_user_pref, LAYOUT_FRAGMENTUSERPREF);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.interests_list_single_item_view, LAYOUT_INTERESTSLISTSINGLEITEMVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.popular_list_single_item_view, LAYOUT_POPULARLISTSINGLEITEMVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.preference_items_list_single_item_layout, LAYOUT_PREFERENCEITEMSLISTSINGLEITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.profile_interests_list_single_item_layout, LAYOUT_PROFILEINTERESTSLISTSINGLEITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.steed.top5.R.layout.search_items_list_single_item_layout, LAYOUT_SEARCHITEMSLISTSINGLEITEMLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPHOTOPICKER: {
          if ("layout/activity_photo_picker_0".equals(tag)) {
            return new ActivityPhotoPickerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_photo_picker is invalid. Received: " + tag);
        }
        case  LAYOUT_BROWSECATEGORIESLISTSINGLEITEMVIEW: {
          if ("layout/browse_categories_list_single_item_view_0".equals(tag)) {
            return new BrowseCategoriesListSingleItemViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for browse_categories_list_single_item_view is invalid. Received: " + tag);
        }
        case  LAYOUT_CATEGORIESLISTSINGLEITEMVIEW: {
          if ("layout/categories_list_single_item_view_0".equals(tag)) {
            return new CategoriesListSingleItemViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for categories_list_single_item_view is invalid. Received: " + tag);
        }
        case  LAYOUT_CATEGORYLISTSINGLEITEMLAYOUT: {
          if ("layout/category_list_single_item_layout_0".equals(tag)) {
            return new CategoryListSingleItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for category_list_single_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_COMMENTSLISTSINGLEITEMLAYOUT: {
          if ("layout/comments_list_single_item_layout_0".equals(tag)) {
            return new CommentsListSingleItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for comments_list_single_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBROWSE: {
          if ("layout/fragment_browse_0".equals(tag)) {
            return new FragmentBrowseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_browse is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCATEGORY: {
          if ("layout/fragment_category_0".equals(tag)) {
            return new FragmentCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_category is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCOMMENTS: {
          if ("layout/fragment_comments_0".equals(tag)) {
            return new FragmentCommentsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_comments is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONTENT: {
          if ("layout/fragment_content_0".equals(tag)) {
            return new FragmentContentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_content is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAILS: {
          if ("layout/fragment_details_0".equals(tag)) {
            return new FragmentDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFILTERS: {
          if ("layout/fragment_filters_0".equals(tag)) {
            return new FragmentFiltersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_filters is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFORGOTPASSWORD: {
          if ("layout/fragment_forgot_password_0".equals(tag)) {
            return new FragmentForgotPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_forgot_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPOSTSBYCATEGORY: {
          if ("layout/fragment_posts_by_category_0".equals(tag)) {
            return new FragmentPostsByCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_posts_by_category is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSAVED: {
          if ("layout/fragment_saved_0".equals(tag)) {
            return new FragmentSavedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_saved is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNUP: {
          if ("layout/fragment_signup_0".equals(tag)) {
            return new FragmentSignupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_signup is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTART: {
          if ("layout/fragment_start_0".equals(tag)) {
            return new FragmentStartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_start is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTAGPOSTS: {
          if ("layout/fragment_tag_posts_0".equals(tag)) {
            return new FragmentTagPostsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tag_posts is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUSERPREF: {
          if ("layout/fragment_user_pref_0".equals(tag)) {
            return new FragmentUserPrefBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_user_pref is invalid. Received: " + tag);
        }
        case  LAYOUT_INTERESTSLISTSINGLEITEMVIEW: {
          if ("layout/interests_list_single_item_view_0".equals(tag)) {
            return new InterestsListSingleItemViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for interests_list_single_item_view is invalid. Received: " + tag);
        }
        case  LAYOUT_POPULARLISTSINGLEITEMVIEW: {
          if ("layout/popular_list_single_item_view_0".equals(tag)) {
            return new PopularListSingleItemViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for popular_list_single_item_view is invalid. Received: " + tag);
        }
        case  LAYOUT_PREFERENCEITEMSLISTSINGLEITEMLAYOUT: {
          if ("layout/preference_items_list_single_item_layout_0".equals(tag)) {
            return new PreferenceItemsListSingleItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for preference_items_list_single_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_PROFILEINTERESTSLISTSINGLEITEMLAYOUT: {
          if ("layout/profile_interests_list_single_item_layout_0".equals(tag)) {
            return new ProfileInterestsListSingleItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for profile_interests_list_single_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_SEARCHITEMSLISTSINGLEITEMLAYOUT: {
          if ("layout/search_items_list_single_item_layout_0".equals(tag)) {
            return new SearchItemsListSingleItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for search_items_list_single_item_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(28);

    static {
      sKeys.put("layout/activity_main_0", com.steed.top5.R.layout.activity_main);
      sKeys.put("layout/activity_photo_picker_0", com.steed.top5.R.layout.activity_photo_picker);
      sKeys.put("layout/browse_categories_list_single_item_view_0", com.steed.top5.R.layout.browse_categories_list_single_item_view);
      sKeys.put("layout/categories_list_single_item_view_0", com.steed.top5.R.layout.categories_list_single_item_view);
      sKeys.put("layout/category_list_single_item_layout_0", com.steed.top5.R.layout.category_list_single_item_layout);
      sKeys.put("layout/comments_list_single_item_layout_0", com.steed.top5.R.layout.comments_list_single_item_layout);
      sKeys.put("layout/fragment_browse_0", com.steed.top5.R.layout.fragment_browse);
      sKeys.put("layout/fragment_category_0", com.steed.top5.R.layout.fragment_category);
      sKeys.put("layout/fragment_comments_0", com.steed.top5.R.layout.fragment_comments);
      sKeys.put("layout/fragment_content_0", com.steed.top5.R.layout.fragment_content);
      sKeys.put("layout/fragment_details_0", com.steed.top5.R.layout.fragment_details);
      sKeys.put("layout/fragment_filters_0", com.steed.top5.R.layout.fragment_filters);
      sKeys.put("layout/fragment_forgot_password_0", com.steed.top5.R.layout.fragment_forgot_password);
      sKeys.put("layout/fragment_home_0", com.steed.top5.R.layout.fragment_home);
      sKeys.put("layout/fragment_login_0", com.steed.top5.R.layout.fragment_login);
      sKeys.put("layout/fragment_posts_by_category_0", com.steed.top5.R.layout.fragment_posts_by_category);
      sKeys.put("layout/fragment_profile_0", com.steed.top5.R.layout.fragment_profile);
      sKeys.put("layout/fragment_saved_0", com.steed.top5.R.layout.fragment_saved);
      sKeys.put("layout/fragment_signup_0", com.steed.top5.R.layout.fragment_signup);
      sKeys.put("layout/fragment_splash_0", com.steed.top5.R.layout.fragment_splash);
      sKeys.put("layout/fragment_start_0", com.steed.top5.R.layout.fragment_start);
      sKeys.put("layout/fragment_tag_posts_0", com.steed.top5.R.layout.fragment_tag_posts);
      sKeys.put("layout/fragment_user_pref_0", com.steed.top5.R.layout.fragment_user_pref);
      sKeys.put("layout/interests_list_single_item_view_0", com.steed.top5.R.layout.interests_list_single_item_view);
      sKeys.put("layout/popular_list_single_item_view_0", com.steed.top5.R.layout.popular_list_single_item_view);
      sKeys.put("layout/preference_items_list_single_item_layout_0", com.steed.top5.R.layout.preference_items_list_single_item_layout);
      sKeys.put("layout/profile_interests_list_single_item_layout_0", com.steed.top5.R.layout.profile_interests_list_single_item_layout);
      sKeys.put("layout/search_items_list_single_item_layout_0", com.steed.top5.R.layout.search_items_list_single_item_layout);
    }
  }
}
