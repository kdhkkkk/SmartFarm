package com.smartfarm.www.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.smartfarm.www.R;
import com.smartfarm.www.appInfo;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView; // 바텀 네비게이션 뷰
    private FragmentManager fm; //
    private FragmentTransaction ft; //
    private HomeActivity frag1; //각 프래그먼트
    private ControlActivity frag2;
    private CropActivity frag3;
    private MypageActivity frag4;


    TextView show_temp_live, show_humidity_live, show_soil_live; //현재 온,습,수분 뷰

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        appInfo a =  (appInfo)getApplicationContext();

        Toast.makeText(getApplicationContext(),a.test, Toast.LENGTH_SHORT).show();

        bottomNavigationView = findViewById(R.id.bottomNavi);
        show_temp_live = findViewById(R.id.show_temp);
        show_humidity_live = findViewById(R.id.show_humidity);
        show_soil_live = findViewById(R.id.show_soil);

        SharedPreferences auto = getSharedPreferences("auto", Activity.MODE_PRIVATE);

        //바텀네비게이션 이벤트
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.tab1:
                        setFrag(0);
                        break;
                    case R.id.tab2:
                        setFrag(1);
                        break;
                    case R.id.tab3:
                        setFrag(2);
                        break;
                    case R.id.tab4:
                        setFrag(3);
                        break;
                }
                return true;
            }
        });

        frag1=new HomeActivity();
        frag2=new ControlActivity();
        frag3=new CropActivity();
        frag4=new MypageActivity();
        setFrag(0); // 첫 프래그먼트 화면 지정
    }

    // 프레그먼트 교체
    private void setFrag(int n)
    {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n)
        {
            case 0:
                ft.replace(R.id.Main_Frame,frag1);
                ft.commit();
                break;

            case 1:
                ft.replace(R.id.Main_Frame,frag2);
                ft.commit();
                break;

            case 2:
                ft.replace(R.id.Main_Frame,frag3);
                ft.commit();
                break;
            case 3:
                ft.replace(R.id.Main_Frame,frag4);
                ft.commit();

        }
    }
}
