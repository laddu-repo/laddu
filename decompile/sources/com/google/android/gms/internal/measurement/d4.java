package com.google.android.gms.internal.measurement;

import android.app.NotificationManager;
import android.content.Context;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.UserManager;
import android.view.Surface;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d4 {
    public static /* bridge */ /* synthetic */ boolean A(SpinnerAdapter spinnerAdapter) {
        return spinnerAdapter instanceof ThemedSpinnerAdapter;
    }

    public static /* bridge */ /* synthetic */ void C(MediaCodec mediaCodec, j2.b bVar, Handler handler) {
        mediaCodec.setOnFrameRenderedListener(bVar, handler);
    }

    public static /* bridge */ /* synthetic */ ThemedSpinnerAdapter i(SpinnerAdapter spinnerAdapter) {
        return (ThemedSpinnerAdapter) spinnerAdapter;
    }

    public static /* bridge */ /* synthetic */ Object j(Context context) {
        return context.getSystemService(UserManager.class);
    }

    public static /* bridge */ /* synthetic */ Object k(FirebaseMessagingService firebaseMessagingService) {
        return firebaseMessagingService.getSystemService(NotificationManager.class);
    }

    public static /* bridge */ /* synthetic */ void p(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }
}
