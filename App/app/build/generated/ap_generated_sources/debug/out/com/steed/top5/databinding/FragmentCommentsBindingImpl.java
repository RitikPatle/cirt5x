package com.steed.top5.databinding;
import com.steed.top5.R;
import com.steed.top5.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCommentsBindingImpl extends FragmentCommentsBinding  {

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
        sViewsWithIds.put(R.id.liker, 6);
        sViewsWithIds.put(R.id.commentsList, 7);
        sViewsWithIds.put(R.id.postCommentBar, 8);
        sViewsWithIds.put(R.id.userImage, 9);
        sViewsWithIds.put(R.id.commentInp, 10);
        sViewsWithIds.put(R.id.sendBtn, 11);
        sViewsWithIds.put(R.id.loadingLayout, 12);
        sViewsWithIds.put(R.id.progress_bar, 13);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCommentsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentCommentsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[3]
            , (android.widget.EditText) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RelativeLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.ProgressBar) bindings[13]
            , (android.widget.TextView) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.ImageView) bindings[9]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
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