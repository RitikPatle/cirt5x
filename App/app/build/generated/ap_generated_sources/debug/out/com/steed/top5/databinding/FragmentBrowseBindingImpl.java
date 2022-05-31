package com.steed.top5.databinding;
import com.steed.top5.R;
import com.steed.top5.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBrowseBindingImpl extends FragmentBrowseBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_layout, 1);
        sViewsWithIds.put(R.id.search_bar_top_gap, 2);
        sViewsWithIds.put(R.id.searchBar, 3);
        sViewsWithIds.put(R.id.searchInput, 4);
        sViewsWithIds.put(R.id.searchBtn, 5);
        sViewsWithIds.put(R.id.search_bar_bottom_space, 6);
        sViewsWithIds.put(R.id.noSearchTermLayout, 7);
        sViewsWithIds.put(R.id.browseCategoriesList, 8);
        sViewsWithIds.put(R.id.popular_top_space, 9);
        sViewsWithIds.put(R.id.popularTxt, 10);
        sViewsWithIds.put(R.id.popular_list_top_space, 11);
        sViewsWithIds.put(R.id.popularList, 12);
        sViewsWithIds.put(R.id.popular_list_bottom_space, 13);
        sViewsWithIds.put(R.id.searchTermLayout, 14);
        sViewsWithIds.put(R.id.searchItemsList, 15);
        sViewsWithIds.put(R.id.noneLayout, 16);
        sViewsWithIds.put(R.id.statusTxt, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentBrowseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentBrowseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.core.widget.NestedScrollView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[2]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.EditText) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (android.widget.TextView) bindings[17]
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