package com.codingblocks.hackathondtu;

import android.annotation.TargetApi;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Build;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class RegistrationTabbedActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_tabbed);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registration_tabbed, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = null;

            if (getArguments() != null) {
                int sectionNumber = getArguments().getInt(ARG_SECTION_NUMBER);

                switch (sectionNumber) {
                    case 1:
                        EditText etname;
                        final EditText etdob;
                        RadioButton rbmale;
                        RadioButton rbfemale;
                        EditText etheight;
                        EditText etweight;
                        Button btnnext;
                        rootView = inflater.inflate(R.layout.fragment_registration_tabbed, container, false);

                        etname = rootView.findViewById(R.id.et_name);
                        etdob = rootView.findViewById(R.id.et_dob);
                        rbmale = rootView.findViewById(R.id.rb_male);
                        rbfemale = rootView.findViewById(R.id.rb_female);
                        etheight = rootView.findViewById(R.id.et_height);
                        etweight = rootView.findViewById(R.id.et_weight);
                        btnnext = rootView.findViewById(R.id.btn_next);


                        break;

                    case 2:
                        RadioButton rbsedentary;
                        RadioButton rbmoderate;
                        RadioButton rbactive;
                        RadioButton rbveryactive;
                        RadioButton rbfat;
                        RadioButton rbhealthy;
                        RadioButton rbmuscle;
                        Button btnsubmit;

                        rootView = inflater.inflate(R.layout.fragment_registrationform2, container, false);

                        rbsedentary = rootView.findViewById(R.id.rb_sedentary);
                        rbmoderate = rootView.findViewById(R.id.rb_moderate);
                        rbactive = rootView.findViewById(R.id.rb_active);
                        rbveryactive = rootView.findViewById(R.id.rb_Vactive);
                        rbfat = rootView.findViewById(R.id.rb_fat);
                        rbhealthy = rootView.findViewById(R.id.rb_healthy);
                        rbmuscle = rootView.findViewById(R.id.rb_muscle);
                        btnsubmit = rootView.findViewById(R.id.btn_submit);

                        break;

                }

            }


            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 2;
        }
    }
}
