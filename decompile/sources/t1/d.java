package t1;

import android.os.Bundle;
import android.text.Spanned;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12481a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f12482b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f12483c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f12484d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f12485e;

    static {
        String str = a0.f12750a;
        f12481a = Integer.toString(0, 36);
        f12482b = Integer.toString(1, 36);
        f12483c = Integer.toString(2, 36);
        f12484d = Integer.toString(3, 36);
        f12485e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i6, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f12481a, spanned.getSpanStart(obj));
        bundle2.putInt(f12482b, spanned.getSpanEnd(obj));
        bundle2.putInt(f12483c, spanned.getSpanFlags(obj));
        bundle2.putInt(f12484d, i6);
        if (bundle != null) {
            bundle2.putBundle(f12485e, bundle);
        }
        return bundle2;
    }
}
