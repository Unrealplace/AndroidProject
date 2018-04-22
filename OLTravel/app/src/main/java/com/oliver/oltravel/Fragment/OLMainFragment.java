package com.oliver.oltravel.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.oliver.oltravel.Adapter.OLMainHeaderAdAdapter;
import com.oliver.oltravel.Adapter.OLMainMenuAdapter;
import com.oliver.oltravel.R;
import com.oliver.oltravel.Util.OLDataUtil;

/**
 * 主界面视图
 *
 */
public class OLMainFragment extends Fragment {

    private ViewPager viewPager;
    private RecyclerView recyclerView;
    private EditText editText;

    private int[] icons = { R.mipmap.header_pic_ad1,
                            R.mipmap.header_pic_ad2,
                            R.mipmap.header_pic_ad1};

    private int[] menuIcons = { R.mipmap.menu_airport,
                                R.mipmap.menu_car,
                                R.mipmap.menu_course,
                                R.mipmap.menu_hatol,
                                R.mipmap.menu_nearby,
                                R.mipmap.menu_train,
                                R.mipmap.menu_ticket,
                                R.mipmap.menu_train};

    private String[] menuNames;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        menuNames = this.getActivity().getResources().getStringArray(R.array.main_menu);

        /**
         * 广告图
         */
        viewPager = (ViewPager) getView().findViewById(R.id.viewpager_main_header_ad);
        OLMainHeaderAdAdapter mainHeaderAdAdapter = new OLMainHeaderAdAdapter(getActivity(), OLDataUtil.getHeaderAddInfo(getActivity(),icons));
        viewPager.setAdapter(mainHeaderAdAdapter);

        /**
         * 菜单图
         */
        OLMainMenuAdapter menuAdapter = new OLMainMenuAdapter(getActivity(),OLDataUtil.getMainMenus(menuIcons,menuNames));
        recyclerView = getView().findViewById(R.id.recyclerview_main_menu);
        recyclerView.setFocusable(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),4){
            @Override
            public boolean canScrollVertically() {
                return false;
            }

            @Override
            public boolean canScrollHorizontally() {
                return false;
            }
        });

        recyclerView.setAdapter(menuAdapter);

//        editText = getView().findViewById(R.id.main_editTxt);
//        editText.clearFocus();

    }


}
