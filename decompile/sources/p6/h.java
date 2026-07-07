package p6;

import android.webkit.MimeTypeMap;
import bg.c0;
import bg.q;
import java.io.File;
import m6.p;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final File f10595a;

    public h(File file) {
        this.f10595a = file;
    }

    @Override // p6.g
    public final Object a(le.c cVar) {
        String str = c0.f1692y;
        File file = this.f10595a;
        p pVar = new p(zb.d.u(file), q.f1741a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        kotlin.jvm.internal.k.d(name, "getName(...)");
        return new m(pVar, singleton.getMimeTypeFromExtension(df.m.f0('.', name, HttpUrl.FRAGMENT_ENCODE_SET)), m6.h.f8663z);
    }
}
