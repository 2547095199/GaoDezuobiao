package chenzhe20171211.bwie.com.gaode;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MapView mMapView = null;
    private AMap aMap;
    Marker preMarker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取地图控件引用
        mMapView = (MapView) findViewById(R.id.map);
        //在activity执行onCreate时执行mMapView.onCreate(savedInstanceState)，创建地图
        mMapView.onCreate(savedInstanceState);

        aMap = mMapView.getMap();

        aMap.setInfoWindowAdapter(new AMap.InfoWindowAdapter() {
            @Override
            public View getInfoWindow(Marker marker) {
                return null;
            }

            @Override
            public View getInfoContents(Marker marker) {
                return null;
            }
        });
        //解析数据
        JsonBean jsonBean = new Gson().fromJson(JsonStr.str, JsonBean.class);
        addMark(jsonBean);
        aMap.setOnMarkerClickListener(new AMap.OnMarkerClickListener() {

            private BitmapDescriptor preIcon;

            @Override
            public boolean onMarkerClick(Marker marker) {
                if (preMarker!=null){
                    preMarker.setIcon(preIcon);
                }
                preMarker = marker;
                ArrayList<BitmapDescriptor> icons = marker.getIcons();
                preIcon = icons.get(0);

                marker.setIcon(BitmapDescriptorFactory.fromBitmap(BitmapFactory
                        .decodeResource(getResources(), R.drawable.charge_no_net)));
                return false;
            }
        });
    }

    private void addMark(JsonBean jsonBean) {
        List<JsonBean.ListBean> list = jsonBean.getList();
        for (int i = 0; i < list.size(); i++) {
            JsonBean.ListBean listBean = list.get(i);
            double lat = listBean.getLat();
            double lng = listBean.getLng();
            LatLng latLng = new LatLng(lat, lng);

//            final Marker marker = aMap.addMarker(new MarkerOptions().position(latLng).title(listBean.getSite_name()));
            MarkerOptions markerOption = new MarkerOptions();
            markerOption.position(latLng);
            markerOption.title(listBean.getSite_name()).snippet(listBean.getAddress());

            markerOption.draggable(true);//设置Marker可拖动
            markerOption.icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory
                    .decodeResource(getResources(), R.drawable.charge_has_net)));
            // 将Marker设置为贴地显示，可以双指下拉地图查看效果
            markerOption.setFlat(true);//设置marker平贴地图效果
            Marker marker = aMap.addMarker(markerOption);

        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，销毁地图
        mMapView.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView.onResume ()，重新绘制加载地图
        mMapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView.onPause ()，暂停地图的绘制
        mMapView.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，保存地图当前的状态
        mMapView.onSaveInstanceState(outState);
    }
}
