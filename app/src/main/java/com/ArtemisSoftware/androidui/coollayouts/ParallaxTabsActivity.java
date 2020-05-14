package com.ArtemisSoftware.androidui.coollayouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.ArtemisSoftware.androidui.R;

public class ParallaxTabsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallax_tabs);

        final Toolbar toolbar = findViewById(R.id.htab_toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) getSupportActionBar().setTitle("Parallax Tabs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /*
        final ViewPager viewPager = findViewById(R.id.htab_viewpager);
        setupViewPager(viewPager);


        TabLayout tabLayout = findViewById(R.id.htab_tabs);
        tabLayout.setupWithViewPager(viewPager);

        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.htab_collapse_toolbar);

        try {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.header);
            Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
                @SuppressWarnings("ResourceType")
                @Override
                public void onGenerated(Palette palette) {

                    int vibrantColor = palette.getVibrantColor(R.color.primary_500);
                    int vibrantDarkColor = palette.getDarkVibrantColor(R.color.primary_700);
                    collapsingToolbarLayout.setContentScrimColor(vibrantColor);
                    collapsingToolbarLayout.setStatusBarScrimColor(vibrantDarkColor);
                }
            });

        } catch (Exception e) {
            // if Bitmap fetch fails, fallback to primary colors
            Log.e(TAG, "onCreate: failed to create bitmap from background", e.fillInStackTrace());
            collapsingToolbarLayout.setContentScrimColor(
                    ContextCompat.getColor(this, R.color.primary_500)
            );
            collapsingToolbarLayout.setStatusBarScrimColor(
                    ContextCompat.getColor(this, R.color.primary_700)
            );
        }

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());
                Log.d(TAG, "onTabSelected: pos: " + tab.getPosition());

                switch (tab.getPosition()) {
                    case 0:
                        showToast("One");
                        break;
                    case 1:
                        showToast("Two");
                        break;
                    case 2:
                        showToast("Three");
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        */
    }

    /*
    private void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ParallaxViewPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFrag(new DummyFragment(
                ContextCompat.getColor(this, R.color.cyan_50)), "Cyan");
        adapter.addFrag(new DummyFragment(
                ContextCompat.getColor(this, R.color.amber_50)), "Amber");
        adapter.addFrag(new DummyFragment(
                ContextCompat.getColor(this, R.color.purple_50)), "Purple");
        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public static class DummyFragment extends Fragment {
        int color;

        public DummyFragment() {
        }

        @SuppressLint("ValidFragment")
        public DummyFragment(int color) {
            this.color = color;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.dummy_fragment, container, false);

            final FrameLayout frameLayout = view.findViewById(R.id.dummyfrag_bg);
            frameLayout.setBackgroundColor(color);

            RecyclerView recyclerView = view.findViewById(R.id.dummyfrag_scrollableview);

            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setHasFixedSize(true);

            List<String> list = Arrays.asList(VersionModel.data);

            SimpleRecyclerAdapter adapter = new SimpleRecyclerAdapter(list);
            recyclerView.setAdapter(adapter);

            return view;
        }
    }

     */
}