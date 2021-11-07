package com.example.steadily;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class FragmentAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
    public FragmentAdapter(@NonNull FragmentManager fm){
        super(fm);
        fragmentList.add(new completelist()); // 전체목록
        fragmentList.add(new todaylist()); // 오늘 실천
        fragmentList.add(new statistics()); // 통계
    }

    @NonNull
    @Override
    public Fragment getItem(int position) { // 채울 화면의 순서
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {return fragmentList.size();} //
}
