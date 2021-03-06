package t3.henu.neteasymusic.appMain;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by 高逸博 on 2017/4/1.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    public MyViewPagerAdapter(FragmentManager fragmentManager, List<Fragment> fragments) {
        super(fragmentManager);
        this.fragments=fragments;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

}
