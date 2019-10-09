package androidx.viewpager.widget;

import android.database.DataSetObserver;

public abstract class MYNPagerAdapter extends PagerAdapter {

    @Override
    public void setViewPagerObserver(DataSetObserver observer) {
        super.setViewPagerObserver(observer);
    }
}
