
package android.databinding;
import com.test.databinding.BR;
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 24;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.test.databinding.R.layout.activity_main3:
                    return com.test.databinding.databinding.ActivityMain3Binding.bind(view, bindingComponent);
                case com.test.databinding.R.layout.listview_item2:
                    return com.test.databinding.databinding.ListviewItem2Binding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 251402720: {
                if(tag.equals("layout/activity_main3_0")) {
                    return com.test.databinding.R.layout.activity_main3;
                }
                break;
            }
            case 216821689: {
                if(tag.equals("layout/listview_item2_0")) {
                    return com.test.databinding.R.layout.listview_item2;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"image"
            ,"info"
            ,"testInfo2"
            ,"testInfo3"
            ,"testinfo21"
            ,"title"};
    }
}