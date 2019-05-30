package com.eddardgao.mymvvmdemo01.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.view.MenuItem;

import com.eddardgao.mymvvmdemo01.R;
import com.eddardgao.mymvvmdemo01.bean.IBaseBindingAdapterItem;
import com.eddardgao.mymvvmdemo01.bean.Text01Item;
import com.eddardgao.mymvvmdemo01.bean.Text02Item;
import com.eddardgao.mymvvmdemo01.bean.UserBean;
import com.eddardgao.mymvvmdemo01.databinding.ActivityTest05Binding;
import com.eddardgao.mymvvmdemo01.viewModel.Test05ViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试RecycelrView 使用Databinding
 * 可以 mydatabindingdemo 中已有的案例
 * <p>
 * 测试下拉刷新  上拉加载的方法
 */
public class Test05Activity extends AppCompatActivity {

    private List<IBaseBindingAdapterItem> mList = new ArrayList<>();
    private ActivityTest05Binding binding;
    private LinearLayoutManager layoutManager;
    private String TAG = "Test05Activity";

    private int lastItemPosition;
    private Test05ViewModel test05ViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_test05);

        layoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL, false);
        test05ViewModel = new Test05ViewModel(Test05Activity.this);
        binding.recyclerView05.setLayoutManager(layoutManager);

        /**
         *  显示回退键
         */
        setSupportActionBar(binding.toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        binding.navigationTest05.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                binding.drawerTest05.closeDrawers();
                return false;
            }
        });

        /**
         *
         *  在非RecyclerView的滚动事件监听中，获取LastItemPosition 都是 -1
         *          RecyclerView 在初始化完成后，onScrolled 方法会回调一次，返回当前的lastposition
         *
         lastItemPosition = layoutManager.findLastVisibleItemPosition();
         Log.d(TAG, "onCreate: 当前显示的最后一个Item 的Position ====" + lastItemPosition);
         */

        /**
        binding.recyclerView05.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                //Log.d(TAG, "onScrollStateChanged: 触发了状态 newState===== " + newState);
                //     SCROLL_STATE_IDLE   = 1   手指按住滑动状态
                //     SCROLL_STATE_IDLE   = 2   手指松开，惯性滑动
                //     SCROLL_STATE_IDLE   = 0   滑动停止
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {


                }
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                lastItemPosition = layoutManager.findLastVisibleItemPosition();
                Log.d(TAG, "onCreate: 当前显示的最后一个Item 的Position ====" + lastItemPosition);

            }
        });
         */

        binding.swipeRefresh.setColorSchemeResources(R.color.colorPrimary);

        /**
        binding.swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                test05ViewModel.addAdapterTail(binding.swipeRefresh);

            }
        });
        */

        /**
         * 最后一步，给binding添加ViewModel
         */
        binding.setTest05viewmodel(test05ViewModel);

    }

    /**
     * 点击Item的事件，打开侧标的drawalayout 并展示
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                binding.drawerTest05.openDrawer(GravityCompat.START);
                break;
        }
        return true;
    }

    private void initData() {
        mList.add(new Text01Item("哦哈哈哈哈"));
        mList.add(new Text01Item("哦哈哈哈哈"));
        mList.add(new Text01Item("哦哈哈哈哈"));
        mList.add(new Text02Item(new UserBean("王二", "100", "男", 23)));
        mList.add(new Text02Item(new UserBean("死亡如风", "100", "男", 23)));
        mList.add(new Text02Item(new UserBean("常伴吾身", "100", "男", 23)));
        mList.add(new Text01Item("巴拉巴拉巴拉"));
        mList.add(new Text01Item("噜啦啦啦"));
        mList.add(new Text02Item(new UserBean("死亡如风", "100", "男", 23)));
        mList.add(new Text02Item(new UserBean("常伴吾身", "100", "男", 23)));

    }

}
