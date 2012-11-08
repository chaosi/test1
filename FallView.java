<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"><html><head><title>src/com/android/wallpaper/fall/FallView.java - platform/packages/wallpapers/Basic - Git at Google</title><link rel="stylesheet" type="text/css" href="//www.google.com/css/go.css" /><link rel="stylesheet" type="text/css" href="/+static/prettify/prettify.vf-M93Ay4IiiWRQSJKPGWQ.cache.css" /><link rel="stylesheet" type="text/css" href="/+static/gitiles.76iNvupRwElh_9ac4itPQg.cache.css" /><script src="/+static/prettify/prettify_compiled.tBfOdWkOBM1HHwscnUdTAA.cache.js" type="text/javascript"></script></head><body onload="prettyPrint()"><h1><img src="//www.google.com/images/logo_sm.gif" alt="Google" />Git</h1><div class="menu"> <a href="https://www.google.com/accounts/ServiceLogin?service=gerritcodereview&amp;continue=https://android.googlesource.com/login/platform/packages/wallpapers/Basic/%2B/70ebeb824d61ccc8bbc10bf561a14afef019a409/src/com/android/wallpaper/fall/FallView.java">Sign in</a> </div><div class="breadcrumbs"><a href="/?format=HTML">android</a> / <a href="/platform/packages/wallpapers/Basic/">platform/packages/wallpapers/Basic</a> / <a href="/platform/packages/wallpapers/Basic/+/70ebeb824d61ccc8bbc10bf561a14afef019a409">70ebeb824d61ccc8bbc10bf561a14afef019a409</a> / <a href="/platform/packages/wallpapers/Basic/+/70ebeb824d61ccc8bbc10bf561a14afef019a409/">.</a> / <a href="/platform/packages/wallpapers/Basic/+/70ebeb824d61ccc8bbc10bf561a14afef019a409/src">src</a> / <a href="/platform/packages/wallpapers/Basic/+/70ebeb824d61ccc8bbc10bf561a14afef019a409/src/com">com</a> / <a href="/platform/packages/wallpapers/Basic/+/70ebeb824d61ccc8bbc10bf561a14afef019a409/src/com/android">android</a> / <a href="/platform/packages/wallpapers/Basic/+/70ebeb824d61ccc8bbc10bf561a14afef019a409/src/com/android/wallpaper">wallpaper</a> / <a href="/platform/packages/wallpapers/Basic/+/70ebeb824d61ccc8bbc10bf561a14afef019a409/src/com/android/wallpaper/fall">fall</a> / FallView.java</div><div class="sha1">blob: 25c7efb3027d197135061e84d1321e8c29718762 [<a href="/platform/packages/wallpapers/Basic/+log/70ebeb824d61ccc8bbc10bf561a14afef019a409/src/com/android/wallpaper/fall/FallView.java">file history</a>]</div><pre class="git-blob prettyprint linenums lang-java">/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.android.wallpaper.fall;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.MotionEvent;
import android.renderscript.RenderScript;
import android.renderscript.RSSurfaceView;

class FallView extends RSSurfaceView {
    private FallRS mRender;

    public FallView(Context context) {
        super(context);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
        super.surfaceChanged(holder, format, w, h);

        RenderScript RS = createRenderScript(false);
        mRender = new FallRS(w, h);
        mRender.init(RS, getResources(), false);
        mRender.start();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            //case MotionEvent.ACTION_MOVE:
                mRender.addDrop(event.getX(), event.getY());
                try {
                    Thread.sleep(16);
                } catch (InterruptedException e) {
                    // Ignore
                }
                break;
        }
        return true;
    }
}</pre></body></html>