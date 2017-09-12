package com.test.databinding.databinding;
import com.test.databinding.R;
import com.test.databinding.BR;
import android.view.View;
public class ListviewItem2Binding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.TextView mboundView1;
    private final android.widget.TextView mboundView2;
    private final android.widget.TextView mboundView3;
    // variables
    private com.test.databinding.model.TestInfo2 mTestinfo21;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListviewItem2Binding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.testinfo21 :
                setTestinfo21((com.test.databinding.model.TestInfo2) variable);
                return true;
        }
        return false;
    }

    public void setTestinfo21(com.test.databinding.model.TestInfo2 Testinfo21) {
        updateRegistration(0, Testinfo21);
        this.mTestinfo21 = Testinfo21;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.testinfo21);
        super.requestRebind();
    }
    public com.test.databinding.model.TestInfo2 getTestinfo21() {
        return mTestinfo21;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTestinfo21((com.test.databinding.model.TestInfo2) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTestinfo21(com.test.databinding.model.TestInfo2 Testinfo21, int fieldId) {
        switch (fieldId) {
            case BR.title: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
            case BR.image: {
                synchronized(this) {
                        mDirtyFlags |= 0x4L;
                }
                return true;
            }
            case BR.info: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
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
        java.lang.String testinfo21Title = null;
        java.lang.String testinfo21Info = null;
        int testinfo21Image = 0;
        java.lang.String stringValueOfTestinfo21Image = null;
        com.test.databinding.model.TestInfo2 testinfo21 = mTestinfo21;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x13L) != 0) {

                    if (testinfo21 != null) {
                        // read testinfo21.title
                        testinfo21Title = testinfo21.getTitle();
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (testinfo21 != null) {
                        // read testinfo21.info
                        testinfo21Info = testinfo21.getInfo();
                    }
            }
            if ((dirtyFlags & 0x15L) != 0) {

                    if (testinfo21 != null) {
                        // read testinfo21.image
                        testinfo21Image = testinfo21.getImage();
                    }


                    // read String.valueOf(testinfo21.image)
                    stringValueOfTestinfo21Image = java.lang.String.valueOf(testinfo21Image);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            this.mboundView1.setText(testinfo21Title);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            this.mboundView2.setText(stringValueOfTestinfo21Image);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.mboundView3.setText(testinfo21Info);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ListviewItem2Binding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListviewItem2Binding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ListviewItem2Binding>inflate(inflater, com.test.databinding.R.layout.listview_item2, root, attachToRoot, bindingComponent);
    }
    public static ListviewItem2Binding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListviewItem2Binding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.test.databinding.R.layout.listview_item2, null, false), bindingComponent);
    }
    public static ListviewItem2Binding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListviewItem2Binding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/listview_item2_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ListviewItem2Binding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): testinfo21
        flag 1 (0x2L): testinfo21.title
        flag 2 (0x3L): testinfo21.image
        flag 3 (0x4L): testinfo21.info
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}