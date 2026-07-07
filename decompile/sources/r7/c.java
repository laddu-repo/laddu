package r7;

import bg.f0;
import bg.m;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends ResponseBody {
    public final f0 A;

    /* renamed from: x, reason: collision with root package name */
    public final DiskLruCache.Snapshot f11844x;

    /* renamed from: y, reason: collision with root package name */
    public final String f11845y;

    /* renamed from: z, reason: collision with root package name */
    public final String f11846z;

    public c(DiskLruCache.Snapshot snapshot, String str, String str2) {
        this.f11844x = snapshot;
        this.f11845y = str;
        this.f11846z = str2;
        this.A = bg.b.d(new b(snapshot.getSource(1), this));
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        String str = this.f11846z;
        if (str == null) {
            return -1L;
        }
        return Util.toLongOrDefault(str, -1L);
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        String str = this.f11845y;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public final m source() {
        return this.A;
    }
}
