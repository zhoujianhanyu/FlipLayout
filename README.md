FlipLayout
==========

Android Flip 3D animation like web G+. (类似web版Google+的3D翻转效果)

![FlipLayout](https://raw2.github.com/stormzhang/FlipLayout/master/art/FlipLayout.gif)

## 使用方法

像一般的Android组件直接在xml中使用

    <?xml version="1.0" encoding="utf-8"?>
    <com.storm.fliplayout.lib.FlipLayout xmlns:android="http://schemas.android.com/apk/res/android"
	    android:id="@+id/flipLayout"
	    android:layout_width="match_parent"
	    android:layout_height="match_parent" >

	    <TextView
	        android:layout_width="match_parent"
	        android:layout_height="200dp"
	        android:layout_gravity="center"
	        android:background="#FFCCCCCC"
	        android:gravity="center"
	        android:text="@string/front"
	        android:textAppearance="@android:style/TextAppearance.Large" />

	    <TextView
	        android:layout_width="match_parent"
	        android:layout_height="200dp"
	        android:layout_centerInParent="true"
	        android:layout_gravity="center"
	        android:background="#FF999999"
	        android:gravity="center"
	        android:text="@string/back"
	        android:textAppearance="@android:style/TextAppearance.Large"
	        android:visibility="gone" />

	</com.storm.fliplayout.lib.FlipLayout>

## 关于我

[见这里](http://stormzhang.github.io/about.html)

License
============

    Copyright 2014 Storm Zhang

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.