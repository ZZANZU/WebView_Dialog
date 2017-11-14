package com.tistory.dayglo.rtsp_test;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by user on 2017-11-06.
 */

public class WebViewClientClass extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return super.shouldOverrideUrlLoading(view, url);
    }
}
