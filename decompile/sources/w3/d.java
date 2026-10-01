package w3;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d2.a f13755c = new d2.a(18);

    /* renamed from: a, reason: collision with root package name */
    public final t1.b f13756a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13757b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f3, int i6, float f10, int i10, boolean z10, int i11, int i12) {
        int i13;
        if (z10) {
            i13 = i11;
        } else {
            i13 = -16777216;
        }
        this.f13756a = new t1.b(spannableStringBuilder, alignment, null, null, f3, 0, i6, f10, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z10, i13, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        this.f13757b = i12;
    }
}
