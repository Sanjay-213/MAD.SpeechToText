<manifest xmlns:android="http://schemas.android.com/apk/res/android"
package="com.example.ex_3">
<application
android:allowBackup="true"
android:icon="@mipmap/ic_launcher" android:label="@string/app_name"
android roundicon="@mipmap/ic_launcher_round" android:supportsRt="true"
android:theme="@style/App Theme">
<activity android:name="MainActivity"> <intent-filter>
<action android:name="android.intent.action.MAIN">
<category android:name="android.intent.category LAUNCHER"> </intent-filter>
</activity> <application>
<Button
android:id="@+id/b1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_margin="1dp"
android:layout_weight="0.25"
android:text="Circle"
android:singleLine="false">
<Button
android:id="@+id/b2"
android:layout_width="wrap_content" android:layout_height="wrap_content"
android:layout_margin="1dp"
android:layout_weight="0.25" android:text="Square">
<Button
android:id="@+id/b3"
android:layout_width="wrap_content"
android:layout_height="wrap_content" android:layout_margin="ldp"
android:layout_weight="0.25"
android:text="Text">
<Button
android:id="@+id/b4"
android:layout_width="wrap_content" android:layout_height="wrap_content"
android:layout_margin="1dp" android:layout_weight="0.5"
android:text="Clear"> </LinearLayout>
</manifest>
activity main xml
<com.example.ex 3.TouchScreen
android:id="@+id 11" android:layout_width="fill_parent"
android:layout_height="fill_parent" android:layout_weight="1"/>
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android" android:layout_width="match_parent" android:layout_height="match_parent" tools:context="MainActivity">
xmlns:app="http://schemas.android.com/apk/res-auto" xmlns:tools="http://schemas.android.com/tools
android:orientation="vertical"
<LinearLayout>
<LinearLayout
android:layout_width="match_parent"
android:layout_height="50dp"
android:orientation="horizontal"
android:layout_gravity="bottom">
<TextView
android:layout_width="match_parent" android:layout_height="match_parent" android textStyle="bold" android textSize="20dp">
android:text="Graphical Primitives" android:textAlignment="center"
<LinearLayout>
<LinearLayout
android:layout_width="match_parent" android:layout_height="wrap_content" android:orientation="horizontal" android:layout_gravity="bottom">">