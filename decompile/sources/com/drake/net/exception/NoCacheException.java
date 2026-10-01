package com.drake.net.exception;

import bg.n;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.Request;
import r4.a;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class NoCacheException extends NetException {
    public /* synthetic */ NoCacheException(Request request, String str, Throwable th, int i6, f fVar) {
        this(request, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : th);
    }

    @Override // com.drake.net.exception.NetException, java.lang.Throwable
    public String getLocalizedMessage() {
        StringBuilder sb2 = new StringBuilder("cacheKey = ");
        Request request = getRequest();
        k.e(request, "request");
        a.t(request.tag(a8.a.class));
        String str = request.method() + request.url();
        n nVar = n.A;
        sb2.append(l.u(str).c(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).e());
        sb2.append(' ');
        sb2.append(super.getLocalizedMessage());
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoCacheException(Request request, String str, Throwable th) {
        super(request, str, th);
        k.e(request, "request");
    }
}
