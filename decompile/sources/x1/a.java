package x1;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import s8.l;
import w1.g;
import w1.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: x, reason: collision with root package name */
    public final l f14457x = new l(14);

    /* renamed from: y, reason: collision with root package name */
    public final Call.Factory f14458y;

    /* renamed from: z, reason: collision with root package name */
    public String f14459z;

    public a(OkHttpClient okHttpClient) {
        this.f14458y = okHttpClient;
    }

    @Override // w1.g
    public final h c() {
        return new b(this.f14458y, this.f14459z, this.f14457x);
    }
}
