package b2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;
import okhttp3.HttpUrl;
import u5.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f1409a;

    /* renamed from: b, reason: collision with root package name */
    public final r f1410b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1411c;

    static {
        new m(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public m(String str) {
        r rVar;
        LogSessionId logSessionId;
        this.f1409a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            rVar = new r(1, false);
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            rVar.f12916y = logSessionId;
        } else {
            rVar = null;
        }
        this.f1410b = rVar;
        this.f1411c = new Object();
    }

    public final synchronized LogSessionId a() {
        r rVar;
        rVar = this.f1410b;
        rVar.getClass();
        return (LogSessionId) rVar.f12916y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (Objects.equals(this.f1409a, mVar.f1409a) && Objects.equals(this.f1410b, mVar.f1410b) && Objects.equals(this.f1411c, mVar.f1411c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1409a, this.f1410b, this.f1411c);
    }
}
