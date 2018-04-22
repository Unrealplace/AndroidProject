package com.oliver.oltravel.Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class OLMainHeaderAdAdapter extends PagerAdapter {

   protected Context context;
   protected List<ImageView> images;

    /**
     * 构造方法
     * @param context
     * @param images
     */
    public OLMainHeaderAdAdapter(Context context, List<ImageView> images) {

        this.context = context;
        this.images = images;
    }

    /**
     * 重写初始化方法
     * @param container
     * @param position
     * @return
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        container.addView(images.get(position));
        return images.get(position);
    }

    /**
     * 销毁的方法
     * @param container
     * @param position
     * @param object
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView(images.get(position));
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public int getCount() {
        return null == images?0:images.size();
    }
}
