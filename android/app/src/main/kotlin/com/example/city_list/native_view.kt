package com.example.city_list//package com.example.city_list


import android.content.Context
import android.view.LayoutInflater


import android.view.View
import android.widget.LinearLayout

import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.flutter.plugin.common.EventChannel
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.platform.PlatformView

internal class NativeView(context: Context, cityList: List<CityModel>,   getCityDetailsHandler:GetStateListPlatformHandler) : PlatformView {
  private val rootView: View


  override fun getView(): View {
    return rootView
  }

  override fun dispose() {}

  init {
    // Inflate the activity_main.xml layout
    rootView = LayoutInflater.from(context).inflate(R.layout.activity_main, null)

    // Get the RecyclerView from the inflated layout
    val recyclerView = rootView.findViewById<RecyclerView>(R.id.recyclerView)

    // Create a CityAdapter and set it to the RecyclerView
    val adapter = CityAdapter(cityList, getCityDetailsHandler)
    recyclerView.adapter = adapter
    recyclerView.layoutManager = LinearLayoutManager(context)
  }

//  init {
//    recyclerView = RecyclerView(
//      context
//    )
//
//
//    // Create a com.example.city_list.CityAdapter and set it to the RecyclerView
//    val adapter = CityAdapter(cityList, getCityDetailsHandler)
//    recyclerView.adapter = adapter
//    recyclerView.layoutManager = LinearLayoutManager(context)
//
//  }
}




//import android.content.Context
//import android.graphics.Color
//import android.view.View
//import android.widget.TextView
//import com.example.city_list.CityModel
//import io.flutter.plugin.platform.PlatformView
//
//internal class NativeView(context: Context,cityList: List<CityModel> ) : PlatformView {
//    private val textView: TextView
//
//    override fun getView(): View {
//        return textView
//    }
//
//    override fun dispose() {}
//
//    init {
//        textView = TextView(context)
//        textView.textSize = 72f
//        textView.setBackgroundColor(Color.rgb(255, 255, 255))
//        textView.text = "Rendered on a native Android view (id:"
//    }
//}

