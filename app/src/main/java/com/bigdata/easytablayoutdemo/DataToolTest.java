package com.bigdata.easytablayoutdemo;

import android.support.v4.app.Fragment;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by xiuer on 17/5/19.
 *
 * @emil: 15536849144@163.com
 * @desc:
 */

public  class DataToolTest {

    private  static String TAG="DataToolTest";


    public  static ArrayList<Fragment> fragments(int size){

        ArrayList <Fragment>fragments=new ArrayList<>();
        TestFragment fragment ;

        for ( int i=0;i<size;i++){
            fragment=TestFragment.newInstance(titles().get(i),"2");
            fragments.add(fragment);
        }

        return  fragments;

    }

    public  static ArrayList<String> titles(){

        ArrayList <String>titles=new ArrayList<>();
        String []title={"首页","全部A股","B","C","D"};

        for ( int i=0;i<title.length;i++){
            titles.add(title[i]);
        }

        Log.i(TAG, "titles: "+titles);
        return  titles;

    }





}
