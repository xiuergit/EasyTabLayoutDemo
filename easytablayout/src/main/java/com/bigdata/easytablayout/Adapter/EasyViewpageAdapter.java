package com.bigdata.easytablayout.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by xiuer on 17/5/26.
 *
 * @emil: 15536849144@163.com
 * @desc:
 */

public class EasyViewpageAdapter  extends  FragmentStatePagerAdapter{


    private ArrayList<Fragment> fragments;

    private  ArrayList<String>titles;

    public EasyViewpageAdapter(FragmentManager fm, ArrayList<Fragment>fragments, ArrayList<String>titles) {
        super(fm);
        this.fragments=fragments;
        this.titles=titles;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return this.titles.get(position);
    }

    @Override
    public Fragment getItem(int position) {


        return fragments!=null?fragments.get(position):null;
    }

    @Override
    public int getCount() {

        return fragments!=null?fragments.size():0;
    }

}



