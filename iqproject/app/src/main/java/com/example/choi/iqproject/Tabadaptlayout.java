package com.example.choi.iqproject;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Tabadaptlayout extends FragmentStatePagerAdapter {

private int tabCount;

  public Tabadaptlayout(FragmentManager fm, int tabCount){
      super(fm);
      this.tabCount=   tabCount;
  }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tab1layout tab1layout=new Tab1layout();
                return tab1layout;
            case 1:
                Tab1layout tab2layout=new Tab1layout();
                return tab2layout;

                default:
            return null;
        }


    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
