package com.steed.top5.databinding;
import com.steed.top5.R;
import com.steed.top5.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentContentBindingImpl extends FragmentContentBinding  {

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
        sViewsWithIds.put(R.id.postName, 5);
        sViewsWithIds.put(R.id.contentLayout, 6);
        sViewsWithIds.put(R.id.img, 7);
        sViewsWithIds.put(R.id.video, 8);
        sViewsWithIds.put(R.id.text, 9);
        sViewsWithIds.put(R.id.webView, 10);
        sViewsWithIds.put(R.id.description, 11);
        sViewsWithIds.put(R.id.postActionBar, 12);
        sViewsWithIds.put(R.id.bottom_bar_start_gap, 13);
        sViewsWithIds.put(R.id.likesContainer, 14);
        sViewsWithIds.put(R.id.liked, 15);
        sViewsWithIds.put(R.id.likes, 16);
        sViewsWithIds.put(R.id.commentsContainer, 17);
        sViewsWithIds.put(R.id.ic_comments, 18);
        sViewsWithIds.put(R.id.comments, 19);
        sViewsWithIds.put(R.id.saveBtn, 20);
        sViewsWithIds.put(R.id.saveBtnImg, 21);
        sViewsWithIds.put(R.id.bottom_bar_end_gap, 22);
        sViewsWithIds.put(R.id.likerStrLayout, 23);
        sViewsWithIds.put(R.id.liker, 24);
        sViewsWithIds.put(R.id.commentsList, 25);
        sViewsWithIds.put(R.id.postCommentBar, 26);
        sViewsWithIds.put(R.id.userImage, 27);
        sViewsWithIds.put(R.id.commentInp, 28);
        sViewsWithIds.put(R.id.sendBtn, 29);
        sViewsWithIds.put(R.id.progressBar, 30);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentContentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private FragmentContentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.view.View) bindings[3]
            , (android.view.View) bindings[2]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[13]
            , (android.widget.EditText) bindings[28]
            , (android.widget.TextView) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.recyclerview.widget.RecyclerView) bindings[25]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[11]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.TextView) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[23]
            , (android.widget.TextView) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ProgressBar) bindings[30]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.ImageView) bindings[27]
            , (com.google.android.exoplayer2.ui.PlayerView) bindings[8]
            , (android.webkit.WebView) bindings[10]
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