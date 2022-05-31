package com.steed.top5.databinding;
import com.steed.top5.R;
import com.steed.top5.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentUserPrefBindingImpl extends FragmentUserPrefBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.search_bar_top_gap, 1);
        sViewsWithIds.put(R.id.searchBar, 2);
        sViewsWithIds.put(R.id.searchInput, 3);
        sViewsWithIds.put(R.id.search_input_end_gap, 4);
        sViewsWithIds.put(R.id.searchBtn, 5);
        sViewsWithIds.put(R.id.ins_top_gap, 6);
        sViewsWithIds.put(R.id.insTxt, 7);
        sViewsWithIds.put(R.id.loadedLayout, 8);
        sViewsWithIds.put(R.id.categories_grid_top_space, 9);
        sViewsWithIds.put(R.id.categoriesGrid, 10);
        sViewsWithIds.put(R.id.categories_grid_bottom_gap, 11);
        sViewsWithIds.put(R.id.saveBtn, 12);
        sViewsWithIds.put(R.id.save_btn_bottom_gap, 13);
        sViewsWithIds.put(R.id.loadingLayout, 14);
        sViewsWithIds.put(R.id.progress_bar, 15);
        sViewsWithIds.put(R.id.progressBarHolder, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUserPrefBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentUserPrefBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (android.widget.ProgressBar) bindings[15]
            , (android.widget.FrameLayout) bindings[16]
            , (android.widget.Button) bindings[12]
            , (android.view.View) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.view.View) bindings[1]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.EditText) bindings[3]
            , (android.view.View) bindings[4]
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