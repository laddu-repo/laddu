package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import i2.d;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface ImageOutput {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1062a = new Object();

    void a();

    void onImageAvailable(long j, Bitmap bitmap);
}
