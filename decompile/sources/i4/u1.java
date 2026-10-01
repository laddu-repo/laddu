package i4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: f, reason: collision with root package name */
    public static final String f6568f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f6569g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f6570h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f6571i;
    public static final String j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f6572k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f6573l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f6574m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f6575n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f6576o;

    /* renamed from: a, reason: collision with root package name */
    public final int f6577a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6578b;

    /* renamed from: c, reason: collision with root package name */
    public final h1 f6579c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f6580d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaSession.Token f6581e;

    static {
        String str = u1.a0.f12750a;
        f6568f = Integer.toString(0, 36);
        f6569g = Integer.toString(1, 36);
        f6570h = Integer.toString(2, 36);
        f6571i = Integer.toString(3, 36);
        j = Integer.toString(4, 36);
        f6572k = Integer.toString(5, 36);
        f6573l = Integer.toString(6, 36);
        f6574m = Integer.toString(7, 36);
        f6575n = Integer.toString(8, 36);
        f6576o = Integer.toString(9, 36);
    }

    public u1(int i6, String str, h1 h1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f6577a = i6;
        this.f6578b = str;
        this.f6579c = h1Var;
        this.f6580d = bundle;
        this.f6581e = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            if (this.f6577a == u1Var.f6577a && TextUtils.equals(this.f6578b, u1Var.f6578b) && TextUtils.equals(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET) && this.f6579c.equals(u1Var.f6579c) && Objects.equals(this.f6581e, u1Var.f6581e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6577a), 0, 1008000300, 5, this.f6578b, HttpUrl.FRAGMENT_ENCODE_SET, null, this.f6579c, this.f6581e);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.f6578b + " type=0 libraryVersion=1008000300 interfaceVersion=5 service= IMediaSession=" + this.f6579c + " extras=" + this.f6580d + "}";
    }
}
