package com.steed.top5.databinding;
import com.steed.top5.R;
import com.steed.top5.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentStartBindingImpl extends FragmentStartBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.logo_top_space, 1);
        sViewsWithIds.put(R.id.logo, 2);
        sViewsWithIds.put(R.id.your_fav_top_space, 3);
        sViewsWithIds.put(R.id.rec_app_top_space, 4);
        sViewsWithIds.put(R.id.yourFavTxt, 5);
        sViewsWithIds.put(R.id.recAppTxt, 6);
        sViewsWithIds.put(R.id.login_btn_top_space, 7);
        sViewsWithIds.put(R.id.loginBtn, 8);
        sViewsWithIds.put(R.id.signup_btn_top_space, 9);
        sViewsWithIds.put(R.id.signUpBtn, 10);
        sViewsWithIds.put(R.id.footerLayout, 11);
        sViewsWithIds.put(R.id.privacyPolicyTextView, 12);
        sViewsWithIds.put(R.id.termsOfUseTextView, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentStartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.Button) bindings[8]
            , (android.view.View) bindings[7]
            , (android.widget.LinearLayout) bindings[2]
            , (android.view.View) bindings[1]
            , (android.widget.TextView) bindings[12]
            , (android.view.View) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[10]
            , (android.view.View) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (android.view.View) bindings[3]
            , (android.widget.TextView) bindings[5]
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