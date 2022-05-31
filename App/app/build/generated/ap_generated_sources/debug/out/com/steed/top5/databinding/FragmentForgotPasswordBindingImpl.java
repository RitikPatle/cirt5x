package com.steed.top5.databinding;
import com.steed.top5.R;
import com.steed.top5.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentForgotPasswordBindingImpl extends FragmentForgotPasswordBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.topBar, 1);
        sViewsWithIds.put(R.id.back_btn_top_gap, 2);
        sViewsWithIds.put(R.id.back_btn_start_gap, 3);
        sViewsWithIds.put(R.id.backBtn, 4);
        sViewsWithIds.put(R.id.ins_txt_top_space, 5);
        sViewsWithIds.put(R.id.insTxt, 6);
        sViewsWithIds.put(R.id.email_input_container, 7);
        sViewsWithIds.put(R.id.ic_email_start_gap, 8);
        sViewsWithIds.put(R.id.ic_email, 9);
        sViewsWithIds.put(R.id.email_input_start_gap, 10);
        sViewsWithIds.put(R.id.emailInp, 11);
        sViewsWithIds.put(R.id.emailInpWarning, 12);
        sViewsWithIds.put(R.id.email_input_end_gap, 13);
        sViewsWithIds.put(R.id.send_btn_top_space, 14);
        sViewsWithIds.put(R.id.sendBtn, 15);
        sViewsWithIds.put(R.id.progressBarHolder, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentForgotPasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentForgotPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.view.View) bindings[3]
            , (android.view.View) bindings[2]
            , (android.widget.EditText) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[10]
            , (android.widget.ImageView) bindings[9]
            , (android.view.View) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[5]
            , (android.widget.FrameLayout) bindings[16]
            , (android.widget.Button) bindings[15]
            , (android.view.View) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
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