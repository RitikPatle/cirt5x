package com.steed.top5.databinding;
import com.steed.top5.R;
import com.steed.top5.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSignupBindingImpl extends FragmentSignupBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.logo_top_space, 1);
        sViewsWithIds.put(R.id.logo, 2);
        sViewsWithIds.put(R.id.username_bar_top_space, 3);
        sViewsWithIds.put(R.id.username_input_container, 4);
        sViewsWithIds.put(R.id.ic_username_start_gap, 5);
        sViewsWithIds.put(R.id.ic_username, 6);
        sViewsWithIds.put(R.id.username_input_start_gap, 7);
        sViewsWithIds.put(R.id.usernameInp, 8);
        sViewsWithIds.put(R.id.usernameInpWarning, 9);
        sViewsWithIds.put(R.id.username_input_end_gap, 10);
        sViewsWithIds.put(R.id.email_bar_top_space, 11);
        sViewsWithIds.put(R.id.email_input_container, 12);
        sViewsWithIds.put(R.id.ic_email_start_gap, 13);
        sViewsWithIds.put(R.id.ic_email, 14);
        sViewsWithIds.put(R.id.email_input_start_gap, 15);
        sViewsWithIds.put(R.id.emailInp, 16);
        sViewsWithIds.put(R.id.emailInpWarning, 17);
        sViewsWithIds.put(R.id.email_input_end_gap, 18);
        sViewsWithIds.put(R.id.password_bar_top_space, 19);
        sViewsWithIds.put(R.id.password_input_container, 20);
        sViewsWithIds.put(R.id.ic_password_start_gap, 21);
        sViewsWithIds.put(R.id.ic_password, 22);
        sViewsWithIds.put(R.id.password_input_start_gap, 23);
        sViewsWithIds.put(R.id.passwordInp, 24);
        sViewsWithIds.put(R.id.passwordInpWarning, 25);
        sViewsWithIds.put(R.id.password_input_end_gap, 26);
        sViewsWithIds.put(R.id.confirm_password_bar_top_space, 27);
        sViewsWithIds.put(R.id.confirm_password_input_container, 28);
        sViewsWithIds.put(R.id.ic_confirm_password_start_gap, 29);
        sViewsWithIds.put(R.id.ic_confirm_password, 30);
        sViewsWithIds.put(R.id.confirm_password_input_start_gap, 31);
        sViewsWithIds.put(R.id.confirmPasswordInp, 32);
        sViewsWithIds.put(R.id.confirmPasswordInpWarning, 33);
        sViewsWithIds.put(R.id.confirm_password_input_end_gap, 34);
        sViewsWithIds.put(R.id.signup_bar_top_space, 35);
        sViewsWithIds.put(R.id.signUpBtn, 36);
        sViewsWithIds.put(R.id.existing_acc_top_space, 37);
        sViewsWithIds.put(R.id.existingAccBtn, 38);
        sViewsWithIds.put(R.id.progressBarHolder, 39);
        sViewsWithIds.put(R.id.footerLayout, 40);
        sViewsWithIds.put(R.id.privacyPolicyTextView, 41);
        sViewsWithIds.put(R.id.termsOfUseTextView, 42);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSignupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 43, sIncludes, sViewsWithIds));
    }
    private FragmentSignupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[27]
            , (android.widget.EditText) bindings[32]
            , (android.widget.ImageView) bindings[33]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[28]
            , (android.view.View) bindings[34]
            , (android.view.View) bindings[31]
            , (android.view.View) bindings[11]
            , (android.widget.EditText) bindings[16]
            , (android.widget.ImageView) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[15]
            , (android.widget.TextView) bindings[38]
            , (android.view.View) bindings[37]
            , (android.widget.LinearLayout) bindings[40]
            , (android.widget.ImageView) bindings[30]
            , (android.view.View) bindings[29]
            , (android.widget.ImageView) bindings[14]
            , (android.view.View) bindings[13]
            , (android.widget.ImageView) bindings[22]
            , (android.view.View) bindings[21]
            , (android.widget.ImageView) bindings[6]
            , (android.view.View) bindings[5]
            , (android.widget.LinearLayout) bindings[2]
            , (android.view.View) bindings[1]
            , (android.view.View) bindings[19]
            , (android.widget.EditText) bindings[24]
            , (android.widget.ImageView) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (android.view.View) bindings[26]
            , (android.view.View) bindings[23]
            , (android.widget.TextView) bindings[41]
            , (android.widget.FrameLayout) bindings[39]
            , (android.widget.Button) bindings[36]
            , (android.view.View) bindings[35]
            , (android.widget.TextView) bindings[42]
            , (android.view.View) bindings[3]
            , (android.widget.EditText) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[7]
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