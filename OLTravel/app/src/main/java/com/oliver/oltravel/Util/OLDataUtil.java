package com.oliver.oltravel.Util;

import android.content.Context;
import android.widget.ImageView;

import com.oliver.oltravel.Entity.OLMenu;

import java.util.ArrayList;
import java.util.List;

public class OLDataUtil {

    /**
     * 头部广告数据
     * @param context
     * @param icons
     * @return
     */
    public  static List<ImageView> getHeaderAddInfo(Context context,int icons[]) {

        List<ImageView> datas = new ArrayList<>();
        for (int i =0;i<icons.length;i++){
            ImageView icon = new ImageView(context);
            icon.setScaleType(ImageView.ScaleType.CENTER_CROP);
            icon.setImageResource(icons[i]);
            datas.add(icon);
        }

        return datas;

    }

    /**
     * 主菜单数据
     * @param icons
     * @param names
     * @return
     */
    public static List<OLMenu> getMainMenus(int icons[], String names[]){

        List<OLMenu> menus = new ArrayList<>();

        for (int i=0;i<icons.length;i++){
            OLMenu menu = new OLMenu(icons[i],names[i]);
            menus.add(menu);
        }

        return menus;

    }


}
