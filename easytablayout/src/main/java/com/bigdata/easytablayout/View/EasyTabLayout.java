package com.bigdata.easytablayout.View;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.bigdata.easytablayout.Adapter.EasyViewpageAdapter;
import com.bigdata.easytablayout.R;

import java.util.ArrayList;

/**
 * Created by xiuer on 17/5/26.
 *
 * @emil: 15536849144@163.com
 * @desc:
 */

public class EasyTabLayout extends LinearLayout{

        private  String TAG="MarketView";

        private  ArrayList<String>titles;

        private TabLayout mTabLayout;

        private ViewPager mViewPager;

        private ArrayList<Fragment> fragments;

        private FragmentManager mFragmentManger;


        public static  int   NORMAL=0;

        public  static  int  INDICATOR=1;

        public  static  int  LIGHT=2;

       public void setData(ArrayList<String> titles,ArrayList<Fragment> fragments) {
           initView(titles,fragments);
       }

         private  int mStyle;


        public EasyTabLayout(Context context) {
                this(context,null);
        }

        public EasyTabLayout(Context context, @Nullable AttributeSet attrs) {
               this(context,attrs,0);
        }

        public EasyTabLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
                super(context, attrs, defStyleAttr);
                LayoutInflater.from(context).inflate(R.layout.view_easytablayout, this, true);

                mTabLayout= (TabLayout) findViewById(R.id.easy_tab);
               mViewPager=(ViewPager)findViewById(R.id.easy_tab_viewPager);

                mFragmentManger= ((FragmentActivity)context).getSupportFragmentManager();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
                  mTabLayout.setLayoutMode(TabLayout.MODE_SCROLLABLE);
               }

                 if(titles!=null&&fragments!=null){
                     initView(titles,fragments);
                 }

        }


        public  void   setStyle(int styleCode){

            if(styleCode==NORMAL){
                mTabLayout.setTabTextColors(Color.WHITE,Color.RED);
                mTabLayout.setSelectedTabIndicatorColor(Color.BLACK);
                mTabLayout.setBackgroundColor(Color.BLACK);
            }
            else if(styleCode==LIGHT) {

                mTabLayout.setTabTextColors(Color.BLACK,Color.RED);
                mTabLayout.setSelectedTabIndicatorColor(Color.WHITE);
                mTabLayout.setBackgroundColor(Color.WHITE);

            }else if(styleCode==INDICATOR){

                mTabLayout.setTabTextColors(Color.BLACK,Color.RED);
                mTabLayout.setSelectedTabIndicatorColor(Color.RED);
                mTabLayout.setBackgroundColor(Color.WHITE);

            }



        }


        public   void  initView(ArrayList<String> titles,ArrayList<Fragment>fragments){

            mViewPager.setAdapter(new EasyViewpageAdapter(mFragmentManger,fragments,titles));

            mTabLayout.setupWithViewPager(mViewPager);

        }
}
