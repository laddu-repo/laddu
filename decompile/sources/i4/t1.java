package i4;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: b, reason: collision with root package name */
    public static final String f6561b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f6562c;

    /* renamed from: a, reason: collision with root package name */
    public final u1 f6563a;

    static {
        r1.f0.a("media3.session");
        String str = u1.a0.f12750a;
        f6561b = Integer.toString(0, 36);
        f6562c = Integer.toString(1, 36);
    }

    public t1(int i6, String str, h1 h1Var, Bundle bundle, MediaSession.Token token) {
        this.f6563a = new u1(i6, str, h1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t1)) {
            return false;
        }
        return this.f6563a.equals(((t1) obj).f6563a);
    }

    public final int hashCode() {
        return this.f6563a.hashCode();
    }

    public final String toString() {
        return this.f6563a.toString();
    }
}
