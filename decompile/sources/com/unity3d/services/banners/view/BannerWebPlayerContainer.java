package com.unity3d.services.banners.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.webplayer.WebPlayerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class BannerWebPlayerContainer extends RelativeLayout {
    private String _bannerAdId;
    private int _lastVisibility;
    private UnityBannerSize _size;
    private Runnable _unsubscribeLayoutChange;
    private JSONObject _webPlayerEventSettings;
    private JSONObject _webPlayerSettings;
    private WebPlayerView _webPlayerView;
    private JSONObject _webSettings;

    public BannerWebPlayerContainer(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, UnityBannerSize unityBannerSize) {
        super(context);
        this._lastVisibility = -1;
        this._unsubscribeLayoutChange = null;
        this._size = unityBannerSize;
        this._bannerAdId = str;
        this._webSettings = jSONObject;
        this._webPlayerSettings = jSONObject2;
        this._webPlayerEventSettings = jSONObject3;
        WebPlayerView webPlayerView = new WebPlayerView(context, str, this._webSettings, this._webPlayerSettings);
        this._webPlayerView = webPlayerView;
        webPlayerView.setEventSettings(this._webPlayerEventSettings);
        subscribeOnLayoutChange();
        addView(this._webPlayerView);
        setupLayoutParams();
    }

    private void setupLayoutParams() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(ViewUtilities.pxFromDp(getContext(), this._size.getWidth())), Math.round(ViewUtilities.pxFromDp(getContext(), this._size.getHeight()))));
        ViewGroup.LayoutParams layoutParams = this._webPlayerView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        this._webPlayerView.setLayoutParams(layoutParams);
    }

    private void subscribeOnLayoutChange() {
        Runnable runnable = this._unsubscribeLayoutChange;
        if (runnable != null) {
            runnable.run();
        }
        final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.unity3d.services.banners.view.BannerWebPlayerContainer.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                BannerWebPlayerContainer.this.onLayoutChange(view, i6, i10, i11, i12, i13, i14, i15, i16);
            }
        };
        addOnLayoutChangeListener(onLayoutChangeListener);
        this._unsubscribeLayoutChange = new Runnable() { // from class: com.unity3d.services.banners.view.BannerWebPlayerContainer.2
            @Override // java.lang.Runnable
            public void run() {
                BannerWebPlayerContainer.this.removeOnLayoutChangeListener(onLayoutChangeListener);
            }
        };
    }

    public void destroy() {
        Runnable runnable = this._unsubscribeLayoutChange;
        if (runnable != null) {
            runnable.run();
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.banners.view.BannerWebPlayerContainer.3
            @Override // java.lang.Runnable
            public void run() {
                this.removeAllViews();
                ViewParent parent = this.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this);
                }
                if (this._webPlayerView != null) {
                    this._webPlayerView.destroy();
                }
                this._webPlayerView = null;
            }
        });
    }

    public WebPlayerView getWebPlayer() {
        return this._webPlayerView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        BannerBridge.didAttach(this._bannerAdId);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BannerBridge.didDetach(this._bannerAdId);
    }

    public void onLayoutChange(View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        BannerBridge.resize(this._bannerAdId, i6, i10, i11, i12, getAlpha());
        if (getParent() != null) {
            Rect rect = new Rect();
            getHitRect(rect);
            if ((getParent() instanceof View) && !((View) getParent()).getLocalVisibleRect(rect)) {
                onVisibilityChanged(this, 8);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i6, int i10, int i11, int i12) {
        super.onSizeChanged(i6, i10, i11, i12);
        if (i11 != 0 || i12 != 0) {
            BannerBridge.resize(this._bannerAdId, getLeft(), getRight(), i6, i10, getAlpha());
            Rect rect = new Rect();
            getHitRect(rect);
            if (((View) getParent()).getLocalVisibleRect(rect)) {
                onVisibilityChanged(this, 8);
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i6) {
        if (view == this) {
            int i10 = this._lastVisibility;
            if (i10 == -1) {
                this._lastVisibility = i6;
                return;
            }
            if (i6 != 0 && i10 == 0) {
                BannerBridge.visibilityChanged(this._bannerAdId, i6);
            }
            this._lastVisibility = i6;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f3) {
        super.setAlpha(f3);
        onLayoutChange(this, getLeft(), getTop(), getRight(), getBottom(), getLeft(), getTop(), getRight(), getBottom());
    }

    public void setWebPlayerEventSettings(JSONObject jSONObject) {
        this._webPlayerEventSettings = jSONObject;
    }

    public void setWebPlayerSettings(JSONObject jSONObject, JSONObject jSONObject2) {
        this._webSettings = jSONObject;
        this._webPlayerSettings = jSONObject2;
    }
}
