package com.x10host.dhanushpatel.paddlecamcardboard;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class MainActivity extends Activity {

    private WebView webView;
    private WebView webView2;
    public static final int USER_MOBILE = 0;
    public static final int USER_DESKTOP = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUserAgentString("Android");
        webView2 = (WebView) findViewById(R.id.webView2);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.getSettings().setUserAgentString("Android");
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.setWebChromeClient(new WebChromeClient() {
        });
        webView2.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView2.setWebChromeClient(new WebChromeClient() {
        });
//youtube video url
////http://www.youtube.com/watch?v=WM5HccvYYQg

        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        //String html = getHTML("RJeEuzznGxE");
       webView.loadUrl("http://10.21.184.243:8080/browserfs.html");
       webView2.loadUrl("http://10.21.184.243:8080/browserfs.html");

       // webView.loadDataWithBaseURL("", "10.101.2.171:8080", mimeType, encoding, "");
       // webView2.loadDataWithBaseURL("", "10.101.2.171:8080", mimeType, encoding, "");
    }



    public String getHTML(String videoId) {

        String html =
                "<iframe class=\"youtube-player\" "
                        + "style=\"border: 0; width: 100%; height: 95%;"
                        + "padding:0px; margin:0px\" "
                        + "id=\"ytplayer\" type=\"text/html\" "
                        + "src=\"http://www.youtube.com/embed/" + videoId
                        + "?fs=0\" frameborder=\"0\" " + "allowfullscreen autobuffer "
                        + "controls onclick=\"this.play()\">\n" + "</iframe>\n";

/**
 * <iframe id="ytplayer" type="text/html" width="640" height="360"
 * src="https://www.youtube.com/embed/WM5HccvYYQg" frameborder="0"
 * allowfullscreen>
 **/

        return html;
    }
    //webView2.getSettings().setPluginsEnabled(true);

    //webView.loadUrl("https://www.youtube.com/watch?v=RJeEuzznGxE");
    //webView2.loadUrl("https://www.youtube.com/watch?v=RJeEuzznGxE");
}
