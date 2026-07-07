package r7;

import bg.j0;
import java.io.IOException;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements CacheRequest {

    /* renamed from: a, reason: collision with root package name */
    public final DiskLruCache.Editor f11860a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f11861b;

    /* renamed from: c, reason: collision with root package name */
    public final f f11862c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f11864e;

    public g(i iVar, DiskLruCache.Editor editor) {
        this.f11864e = iVar;
        this.f11860a = editor;
        j0 newSink = editor.newSink(1);
        this.f11861b = newSink;
        this.f11862c = new f(iVar, this, newSink);
    }

    @Override // okhttp3.internal.cache.CacheRequest
    public final void abort() {
        synchronized (this.f11864e) {
            if (this.f11863d) {
                return;
            }
            this.f11863d = true;
            Util.closeQuietly(this.f11861b);
            try {
                this.f11860a.abort();
            } catch (IOException unused) {
            }
        }
    }

    @Override // okhttp3.internal.cache.CacheRequest
    public final j0 body() {
        return this.f11862c;
    }
}
