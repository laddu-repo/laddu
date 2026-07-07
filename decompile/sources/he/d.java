package he;

import java.io.Serializable;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements f, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final Object f6070x;

    public d(OkHttpClient okHttpClient) {
        this.f6070x = okHttpClient;
    }

    @Override // he.f
    public final Object getValue() {
        return this.f6070x;
    }

    public final String toString() {
        return String.valueOf(this.f6070x);
    }
}
