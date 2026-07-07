package i4;

import android.os.Bundle;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f6547e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f6548f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f6549g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f6550h;

    /* renamed from: a, reason: collision with root package name */
    public final int f6551a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f6552b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6553c;

    /* renamed from: d, reason: collision with root package name */
    public final q1 f6554d;

    static {
        String str = u1.a0.f12750a;
        f6547e = Integer.toString(0, 36);
        f6548f = Integer.toString(1, 36);
        f6549g = Integer.toString(2, 36);
        f6550h = Integer.toString(3, 36);
    }

    public s1(int i6) {
        this(i6, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static s1 a(Bundle bundle) {
        q1 q1Var;
        int i6 = bundle.getInt(f6547e, -1);
        Bundle bundle2 = bundle.getBundle(f6548f);
        long j = bundle.getLong(f6549g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(f6550h);
        if (bundle3 != null) {
            int i10 = bundle3.getInt(q1.f6511d, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
            String string = bundle3.getString(q1.f6512e, HttpUrl.FRAGMENT_ENCODE_SET);
            Bundle bundle4 = bundle3.getBundle(q1.f6513f);
            if (bundle4 == null) {
                bundle4 = Bundle.EMPTY;
            }
            q1Var = new q1(i10, string, bundle4);
        } else if (i6 != 0) {
            q1Var = new q1(i6);
        } else {
            q1Var = null;
        }
        q1 q1Var2 = q1Var;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new s1(i6, bundle2, j, q1Var2);
    }

    public s1(int i6, Bundle bundle, long j, q1 q1Var) {
        u1.c.b(q1Var == null || i6 < 0);
        this.f6551a = i6;
        this.f6552b = new Bundle(bundle);
        this.f6553c = j;
        if (q1Var == null && i6 < 0) {
            q1Var = new q1(i6);
        }
        this.f6554d = q1Var;
    }
}
