package c8;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import dd.b;
import ic.s;
import java.util.concurrent.atomic.AtomicReference;
import k7.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final s f1985a;

    public a(s sVar) {
        this.f1985a = sVar;
    }

    @JavascriptInterface
    public void returnResultToJava(String str) {
        s sVar = this.f1985a;
        b bVar = (b) ((AtomicReference) sVar.f6783z).getAndSet(null);
        if (bVar == null) {
            return;
        }
        c cVar = (c) sVar.A;
        ((Handler) cVar.f7745y).post(new hb.s(2, str, bVar));
    }
}
