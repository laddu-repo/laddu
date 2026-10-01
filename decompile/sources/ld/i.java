package ld;

import android.graphics.Path;
import android.graphics.Rect;
import com.playfy.tv.ui.CornerLabelTextview;
import com.unity3d.services.UnityAdsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: x, reason: collision with root package name */
    public static final a f8329x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ i[] f8330y;

    static {
        a aVar = new a();
        f8329x = aVar;
        f8330y = new i[]{aVar, new i() { // from class: ld.b
            @Override // ld.i
            public final float[] a(CornerLabelTextview cornerLabelTextview, int i6, int i10, int i11) {
                return CornerLabelTextview.a(cornerLabelTextview, new Rect(i11, 0, i6 + i11, i10), (i6 / 2) + i11, i10 / 2, 45.0f);
            }

            @Override // ld.i
            public final Path b(CornerLabelTextview cornerLabelTextview, Path path, int i6, int i10) {
                int i11 = CornerLabelTextview.F;
                float f3 = i6;
                float f10 = i10;
                path.lineTo(f3, f10);
                path.lineTo(f3, f10 - cornerLabelTextview.f3376z);
                path.lineTo(cornerLabelTextview.f3376z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return path;
            }
        }, new i() { // from class: ld.c
            @Override // ld.i
            public final float[] a(CornerLabelTextview cornerLabelTextview, int i6, int i10, int i11) {
                return CornerLabelTextview.a(cornerLabelTextview, new Rect(0, i11, i6, i10 + i11), i6 / 2, (i10 / 2) + i11, 45.0f);
            }

            @Override // ld.i
            public final Path b(CornerLabelTextview cornerLabelTextview, Path path, int i6, int i10) {
                int i11 = CornerLabelTextview.F;
                float f3 = i6;
                float f10 = i10;
                path.lineTo(f3, f10);
                path.lineTo(f3 - cornerLabelTextview.f3376z, f10);
                path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cornerLabelTextview.f3376z);
                return path;
            }
        }, new i() { // from class: ld.d
            @Override // ld.i
            public final float[] a(CornerLabelTextview cornerLabelTextview, int i6, int i10, int i11) {
                return CornerLabelTextview.a(cornerLabelTextview, new Rect(i11, i11, i6 + i11, i10 + i11), (i6 / 2) + i11, (i10 / 2) + i11, -45.0f);
            }

            @Override // ld.i
            public final Path b(CornerLabelTextview cornerLabelTextview, Path path, int i6, int i10) {
                int i11 = CornerLabelTextview.F;
                float f3 = i10;
                path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
                path.lineTo(cornerLabelTextview.f3376z, f3);
                float f10 = i6;
                path.lineTo(f10, cornerLabelTextview.f3376z);
                path.lineTo(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return path;
            }
        }, new i() { // from class: ld.e
            @Override // ld.i
            public final float[] a(CornerLabelTextview cornerLabelTextview, int i6, int i10, int i11) {
                return CornerLabelTextview.a(cornerLabelTextview, new Rect(0, 0, i6, i10), i6 / 2, i10 / 2, -45.0f);
            }

            @Override // ld.i
            public final Path b(CornerLabelTextview cornerLabelTextview, Path path, int i6, int i10) {
                int i11 = CornerLabelTextview.F;
                path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i10);
                path.lineTo(i6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return path;
            }
        }, new i() { // from class: ld.f
            @Override // ld.i
            public final float[] a(CornerLabelTextview cornerLabelTextview, int i6, int i10, int i11) {
                return CornerLabelTextview.a(cornerLabelTextview, new Rect(i11, 0, i6 + i11, i10), (i6 / 2) + i11, i10 / 2, 45.0f);
            }

            @Override // ld.i
            public final Path b(CornerLabelTextview cornerLabelTextview, Path path, int i6, int i10) {
                int i11 = CornerLabelTextview.F;
                float f3 = i6;
                path.lineTo(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.lineTo(f3, i10);
                return path;
            }
        }, new i() { // from class: ld.g
            @Override // ld.i
            public final float[] a(CornerLabelTextview cornerLabelTextview, int i6, int i10, int i11) {
                return CornerLabelTextview.a(cornerLabelTextview, new Rect(0, i11, i6, i10 + i11), i6 / 2, (i10 / 2) + i11, 45.0f);
            }

            @Override // ld.i
            public final Path b(CornerLabelTextview cornerLabelTextview, Path path, int i6, int i10) {
                int i11 = CornerLabelTextview.F;
                float f3 = i6;
                float f10 = i10;
                path.lineTo(f3, f10);
                path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10);
                return path;
            }
        }, new i() { // from class: ld.h
            @Override // ld.i
            public final float[] a(CornerLabelTextview cornerLabelTextview, int i6, int i10, int i11) {
                return CornerLabelTextview.a(cornerLabelTextview, new Rect(i11, i11, i6 + i11, i10 + i11), (i6 / 2) + i11, (i10 / 2) + i11, -45.0f);
            }

            @Override // ld.i
            public final Path b(CornerLabelTextview cornerLabelTextview, Path path, int i6, int i10) {
                int i11 = CornerLabelTextview.F;
                float f3 = i10;
                path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
                float f10 = i6;
                path.lineTo(f10, f3);
                path.lineTo(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return path;
            }
        }};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f8330y.clone();
    }

    public abstract float[] a(CornerLabelTextview cornerLabelTextview, int i6, int i10, int i11);

    public abstract Path b(CornerLabelTextview cornerLabelTextview, Path path, int i6, int i10);
}
