package com.unity3d.services.ads.offerwall;

import a2.c0;
import android.graphics.Bitmap;
import androidx.media3.ui.PlayerView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3404b;

    public /* synthetic */ a(Object obj, int i6) {
        this.f3403a = i6;
        this.f3404b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object tapjoyPlacementListener$lambda$0;
        int i6 = this.f3403a;
        Object obj2 = this.f3404b;
        switch (i6) {
            case 0:
                tapjoyPlacementListener$lambda$0 = OfferwallAdapterBridge.tapjoyPlacementListener$lambda$0((OfferwallAdapterBridge) obj2, obj, method, objArr);
                return tapjoyPlacementListener$lambda$0;
            default:
                PlayerView playerView = (PlayerView) obj2;
                int i10 = PlayerView.f1091h0;
                if (method.getName().equals("onImageAvailable")) {
                    playerView.L.post(new c0(28, playerView, (Bitmap) objArr[1]));
                    return null;
                }
                return null;
        }
    }
}
