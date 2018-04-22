package com.oliver.oltravel.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.oliver.oltravel.Entity.OLMenu;
import com.oliver.oltravel.R;

import java.util.List;

public class OLMainMenuAdapter extends RecyclerView.Adapter<MainMenuViewHolder>{

    protected Context context;
    protected List<OLMenu> menus;

    public OLMainMenuAdapter(Context context, List<OLMenu> menus) {
        this.context = context;
        this.menus = menus;
    }

    @Override
    public MainMenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainMenuViewHolder(LayoutInflater.from(context).inflate(R.layout.item_main_menu,null));
    }

    @Override
    public void onBindViewHolder(MainMenuViewHolder holder, int position) {

        OLMenu menu = (OLMenu) menus.get(position);
        holder.imageViewIcon.setImageResource(menu.getIcon());
        holder.txtView.setText(menu.getMenuName());

    }

    @Override
    public int getItemCount() {
        return null==menus?0:menus.size();
    }


}

class MainMenuViewHolder extends RecyclerView.ViewHolder{

    protected ImageView imageViewIcon;
    protected TextView txtView;

    public MainMenuViewHolder(View itemView) {
        super(itemView);
        imageViewIcon = itemView.findViewById(R.id.img_menu_icon);
        txtView = itemView.findViewById(R.id.txt_menu_name);

    }
}