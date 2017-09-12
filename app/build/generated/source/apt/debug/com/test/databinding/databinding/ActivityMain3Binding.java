package com.test.databinding.databinding;
import com.test.databinding.R;
import com.test.databinding.BR;
import android.view.View;
public class ActivityMain3Binding extends android.databinding.ViewDataBinding  {

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
    // variables
    private com.test.databinding.model.TestInfo3 mTestInfo3;
    private com.test.databinding.model.TestInfo2 mTestInfo2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMain3Binding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
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
            case BR.testInfo3 :
                setTestInfo3((com.test.databinding.model.TestInfo3) variable);
                return true;
            case BR.testInfo2 :
                setTestInfo2((com.test.databinding.model.TestInfo2) variable);
                return true;
        }
        return false;
    }

    public void setTestInfo3(com.test.databinding.model.TestInfo3 TestInfo3) {
        this.mTestInfo3 = TestInfo3;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.testInfo3);
        super.requestRebind();
    }
    public com.test.databinding.model.TestInfo3 getTestInfo3() {
        return mTestInfo3;
    }
    public void setTestInfo2(com.test.databinding.model.TestInfo2 TestInfo2) {
        updateRegistration(1, TestInfo2);
        this.mTestInfo2 = TestInfo2;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.testInfo2);
        super.requestRebind();
    }
    public com.test.databinding.model.TestInfo2 getTestInfo2() {
        return mTestInfo2;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTestInfo3Title((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeTestInfo2((com.test.databinding.model.TestInfo2) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTestInfo3Title(android.databinding.ObservableField<java.lang.String> TestInfo3Title, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }
    private boolean onChangeTestInfo2(com.test.databinding.model.TestInfo2 TestInfo2, int fieldId) {
        switch (fieldId) {
            case BR.info: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
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
        android.databinding.ObservableField<java.lang.String> testInfo3Title = null;
        com.test.databinding.model.TestInfo3 testInfo3 = mTestInfo3;
        boolean testInfo2InfoJavaLangObjectNull = false;
        com.test.databinding.model.TestInfo2 testInfo2 = mTestInfo2;
        java.lang.String testInfo3TitleGet = null;
        java.lang.String testInfo2Info = null;
        java.lang.String testInfo2InfoJavaLangObjectNullMboundView1AndroidStringNullStringTestInfo2Info = null;

        if ((dirtyFlags & 0x15L) != 0) {



                if (testInfo3 != null) {
                    // read testInfo3.title
                    testInfo3Title = testInfo3.title;
                }
                updateRegistration(0, testInfo3Title);


                if (testInfo3Title != null) {
                    // read testInfo3.title.get()
                    testInfo3TitleGet = testInfo3Title.get();
                }
        }
        if ((dirtyFlags & 0x1aL) != 0) {



                if (testInfo2 != null) {
                    // read testInfo2.info
                    testInfo2Info = testInfo2.getInfo();
                }


                // read testInfo2.info == null
                testInfo2InfoJavaLangObjectNull = (testInfo2Info) == (null);
            if((dirtyFlags & 0x1aL) != 0) {
                if(testInfo2InfoJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1aL) != 0) {

                // read testInfo2.info == null ? @android:string/nullString : testInfo2.info
                testInfo2InfoJavaLangObjectNullMboundView1AndroidStringNullStringTestInfo2Info = ((testInfo2InfoJavaLangObjectNull) ? (mboundView1.getResources().getString(R.string.nullString)) : (testInfo2Info));
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.mboundView1.setText(testInfo2InfoJavaLangObjectNullMboundView1AndroidStringNullStringTestInfo2Info);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            this.mboundView2.setText(testInfo3TitleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityMain3Binding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMain3Binding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMain3Binding>inflate(inflater, com.test.databinding.R.layout.activity_main3, root, attachToRoot, bindingComponent);
    }
    public static ActivityMain3Binding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMain3Binding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.test.databinding.R.layout.activity_main3, null, false), bindingComponent);
    }
    public static ActivityMain3Binding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMain3Binding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main3_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMain3Binding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): testInfo3.title
        flag 1 (0x2L): testInfo2
        flag 2 (0x3L): testInfo3
        flag 3 (0x4L): testInfo2.info
        flag 4 (0x5L): null
        flag 5 (0x6L): testInfo2.info == null ? @android:string/nullString : testInfo2.info
        flag 6 (0x7L): testInfo2.info == null ? @android:string/nullString : testInfo2.info
    flag mapping end*/
    //end
}