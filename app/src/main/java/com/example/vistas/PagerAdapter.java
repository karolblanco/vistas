package com.example.vistas;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public  class PagerAdapter extends FragmentPagerAdapter {

    private int numoftabs;

//lifecycle  deberia ser numoftabs
    public PagerAdapter(@NonNull FragmentManager fragmentManager, int numoftabs) {
        super(fragmentManager);
        this.numoftabs = numoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Asignatura_fragment();
            case 1: return new Estudiantes();
            case 2 : return new Profesor();
            default: return null;
    }
    }
    public int getCount() {
        return numoftabs;
    }


    public int getItemCount() {
        return numoftabs;
    }
}
