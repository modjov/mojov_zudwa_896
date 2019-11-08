package new_project_zudwa;

public class Main {

    public static void main(String[] args) {
	System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "\n" +
            "-<manifest package=\"aleksandr.anikin.com.simpleforecast\" xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "\n" +
            "<uses-permission android:name=\"android.permission.INTERNET\"/>\n" +
            "\n" +
            "\n" +
            "-<application android:theme=\"@style/AppTheme\" android:supportsRtl=\"true\" android:roundIcon=\"@drawable/weather_app_icon\" android:label=\"@string/app_name\" android:icon=\"@drawable/weather_app_icon\" android:allowBackup=\"true\">\n" +
            "\n" +
            "\n" +
            "-<activity android:name=\".MainActivity\" android:screenOrientation=\"portrait\">\n" +
            "\n" +
            "\n" +
            "-<intent-filter>\n" +
            "\n" +
            "<action android:name=\"android.intent.action.MAIN\"/>\n" +
            "\n" +
            "<category android:name=\"android.intent.category.LAUNCHER\"/>\n" +
            "\n" +
            "</intent-filter>\n" +
            "\n" +
            "</activity>\n" +
            "\n" +
            "</application>\n" +
            "\n" +
            "</manifest>");
    }
}
