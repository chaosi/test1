<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"><html><head><title>src/com/android/wallpaper/fall/Fall.java - platform/packages/wallpapers/Basic - Git at Google</title><link rel="stylesheet" type="text/css" href="//www.google.com/css/go.css" /><link rel="stylesheet" type="text/css" href="/+static/prettify/prettify.vf-M93Ay4IiiWRQSJKPGWQ.cache.css" /><link rel="stylesheet" type="text/css" href="/+static/gitiles.76iNvupRwElh_9ac4itPQg.cache.css" /><script src="/+static/prettify/prettify_compiled.tBfOdWkOBM1HHwscnUdTAA.cache.js" type="text/javascript"></script></head><body onload="prettyPrint()"><h1><img src="//www.google.com/images/logo_sm.gif" alt="Google" />Git</h1><div class="menu"> <a href="https://www.google.com/accounts/ServiceLogin?service=gerritcodereview&amp;continue=https://android.googlesource.com/login/platform/packages/wallpapers/Basic/%2B/70ebeb824d61ccc8bbc10bf561a14afef019a409/src/com/android/wallpaper/fall/Fall.java">Sign in</a> </div><div class="breadcrumbs"><a href="/?format=HTML">android</a> / <a href="/platform/packages/wallpapers/Basic/">platform/packages/wallpapers/Basic</a> / <a href="/platform/packages/wallpapers/Basic/+/70ebeb824d61ccc8bbc10bf561a14afef019a409">70ebeb824d61ccc8bbc10bf561a14afef019a409</a> / <a href="/platform/packages/wallpapers/Basic/+/70ebeb824d61ccc8bbc10bf561a14afef019a409/">.</a> / <a href="/platform/packages/wallpapers/Basic/+/70ebeb824d61ccc8bbc10bf561a14afef019a409/src">src</a> / <a href="/platform/packages/wallpapers/Basic/+/70ebeb824d61ccc8bbc10bf561a14afef019a409/src/com">com</a> / <a href="/platform/packages/wallpapers/Basic/+/70ebeb824d61ccc8bbc10bf561a14afef019a409/src/com/android">android</a> / <a href="/platform/packages/wallpapers/Basic/+/70ebeb824d61ccc8bbc10bf561a14afef019a409/src/com/android/wallpaper">wallpaper</a> / <a href="/platform/packages/wallpapers/Basic/+/70ebeb824d61ccc8bbc10bf561a14afef019a409/src/com/android/wallpaper/fall">fall</a> / Fall.java</div><div class="sha1">blob: aa3901c71b74151428cb70ade2bfafa1f03ff673 [<a href="/platform/packages/wallpapers/Basic/+log/70ebeb824d61ccc8bbc10bf561a14afef019a409/src/com/android/wallpaper/fall/Fall.java">file history</a>]</div><pre class="git-blob prettyprint linenums lang-java">/*
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

import android.app.Activity;
import android.os.Bundle;

public class Fall extends Activity {
    private FallView mView;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        mView = new FallView(this);
        setContentView(mView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mView.onPause();

        Runtime.getRuntime().exit(0);
    }
}</pre></body></html>