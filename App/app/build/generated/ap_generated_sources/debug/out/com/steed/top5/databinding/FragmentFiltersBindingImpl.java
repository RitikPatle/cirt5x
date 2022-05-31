package com.steed.top5.databinding;
import com.steed.top5.R;
import com.steed.top5.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFiltersBindingImpl extends FragmentFiltersBinding  {

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
        sViewsWithIds.put(R.id.main_content_top_gap, 6);
        sViewsWithIds.put(R.id.main_content_start_gap, 7);
        sViewsWithIds.put(R.id.main_content, 8);
        sViewsWithIds.put(R.id.filter_txt, 9);
        sViewsWithIds.put(R.id.checkboxes_top_gap, 10);
        sViewsWithIds.put(R.id.checkboxes_layout, 11);
        sViewsWithIds.put(R.id.checkbox1, 12);
        sViewsWithIds.put(R.id.checkboxInp1, 13);
        sViewsWithIds.put(R.id.checkboxInpTxt1, 14);
        sViewsWithIds.put(R.id.checkboxes_middle_gap_1, 15);
        sViewsWithIds.put(R.id.checkbox2, 16);
        sViewsWithIds.put(R.id.checkboxInp2, 17);
        sViewsWithIds.put(R.id.checkboxInpTxt2, 18);
        sViewsWithIds.put(R.id.checkboxes_middle_gap_2, 19);
        sViewsWithIds.put(R.id.checkbox3, 20);
        sViewsWithIds.put(R.id.checkboxInp3, 21);
        sViewsWithIds.put(R.id.checkboxInpTxt3, 22);
        sViewsWithIds.put(R.id.checkboxes_middle_gap_3, 23);
        sViewsWithIds.put(R.id.checkbox4, 24);
        sViewsWithIds.put(R.id.checkboxInp4, 25);
        sViewsWithIds.put(R.id.checkboxInpTxt4, 26);
        sViewsWithIds.put(R.id.checkboxes_middle_gap_4, 27);
        sViewsWithIds.put(R.id.your_interests_top_gap, 28);
        sViewsWithIds.put(R.id.your_interests_txt, 29);
        sViewsWithIds.put(R.id.interests_list_top_gap, 30);
        sViewsWithIds.put(R.id.interestsList, 31);
        sViewsWithIds.put(R.id.save_btn_top_gap, 32);
        sViewsWithIds.put(R.id.saveBtn, 33);
        sViewsWithIds.put(R.id.loadingLayout, 34);
        sViewsWithIds.put(R.id.progress_bar, 35);
        sViewsWithIds.put(R.id.progressBarHolder, 36);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFiltersBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 37, sIncludes, sViewsWithIds));
    }
    private FragmentFiltersBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[24]
            , (android.widget.CheckBox) bindings[13]
            , (android.widget.CheckBox) bindings[17]
            , (android.widget.CheckBox) bindings[21]
            , (android.widget.CheckBox) bindings[25]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[26]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[23]
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[31]
            , (android.view.View) bindings[30]
            , (android.widget.ScrollView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[34]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[6]
            , (android.widget.ProgressBar) bindings[35]
            , (android.widget.FrameLayout) bindings[36]
            , (android.widget.Button) bindings[33]
            , (android.view.View) bindings[32]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.view.View) bindings[28]
            , (android.widget.TextView) bindings[29]
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