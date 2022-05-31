package com.steed.top5.databinding;
import com.steed.top5.R;
import com.steed.top5.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loadedLayout, 1);
        sViewsWithIds.put(R.id.topBar, 2);
        sViewsWithIds.put(R.id.back_btn_top_gap, 3);
        sViewsWithIds.put(R.id.back_btn_start_gap, 4);
        sViewsWithIds.put(R.id.backBtn, 5);
        sViewsWithIds.put(R.id.user_image_top_gap, 6);
        sViewsWithIds.put(R.id.userImage, 7);
        sViewsWithIds.put(R.id.user_name_top_gap, 8);
        sViewsWithIds.put(R.id.userName, 9);
        sViewsWithIds.put(R.id.userEmail, 10);
        sViewsWithIds.put(R.id.main_content_top_gap, 11);
        sViewsWithIds.put(R.id.main_content_start_gap, 12);
        sViewsWithIds.put(R.id.main_content, 13);
        sViewsWithIds.put(R.id.your_interests_top_gap, 14);
        sViewsWithIds.put(R.id.your_interests_txt, 15);
        sViewsWithIds.put(R.id.interests_list_top_gap, 16);
        sViewsWithIds.put(R.id.yourInterestsNone, 17);
        sViewsWithIds.put(R.id.interestsList, 18);
        sViewsWithIds.put(R.id.main_content1, 19);
        sViewsWithIds.put(R.id.lang_switch_top_gap, 20);
        sViewsWithIds.put(R.id.language_txt, 21);
        sViewsWithIds.put(R.id.lang_switch_layout_top_gap, 22);
        sViewsWithIds.put(R.id.lang_switch_layout, 23);
        sViewsWithIds.put(R.id.langSwitch, 24);
        sViewsWithIds.put(R.id.save_btn_top_gap, 25);
        sViewsWithIds.put(R.id.saveBtn, 26);
        sViewsWithIds.put(R.id.save_btn_bottom_gap, 27);
        sViewsWithIds.put(R.id.loadingLayout, 28);
        sViewsWithIds.put(R.id.progress_bar, 29);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (android.view.View) bindings[16]
            , (android.widget.Switch) bindings[24]
            , (android.widget.LinearLayout) bindings[23]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[20]
            , (android.widget.TextView) bindings[21]
            , (android.widget.ScrollView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[28]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[11]
            , (android.widget.ProgressBar) bindings[29]
            , (android.widget.Button) bindings[26]
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[7]
            , (android.view.View) bindings[6]
            , (android.widget.TextView) bindings[9]
            , (android.view.View) bindings[8]
            , (android.widget.TextView) bindings[17]
            , (android.view.View) bindings[14]
            , (android.widget.TextView) bindings[15]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}