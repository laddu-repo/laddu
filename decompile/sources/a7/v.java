package a7;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile m f226e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j7.a f227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j7.a f228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f7.b f229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ab.f f230d;

    public v(j7.a aVar, j7.a aVar2, f7.b bVar, ab.f fVar, sb.p pVar) {
        this.f227a = aVar;
        this.f228b = aVar2;
        this.f229c = bVar;
        this.f230d = fVar;
        ((Executor) pVar.f11742w).execute(new androidx.emoji2.text.v(15, pVar));
    }

    public static v a() {
        m mVar = f226e;
        if (mVar != null) {
            return (v) mVar.A.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f226e == null) {
            synchronized (v.class) {
                try {
                    if (f226e == null) {
                        l lVar = new l();
                        context.getClass();
                        lVar.f208v = context;
                        f226e = lVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final t c(n nVar) {
        byte[] bytes;
        Set setUnmodifiableSet = nVar != null ? Collections.unmodifiableSet(y6.a.f14500d) : Collections.singleton(new x6.c("proto"));
        j jVarA = k.a();
        nVar.getClass();
        jVarA.f202w = "cct";
        y6.a aVar = (y6.a) nVar;
        String str = aVar.f14502a;
        String str2 = aVar.f14503b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        jVarA.f203x = bytes;
        return new t(setUnmodifiableSet, jVarA.k(), this);
    }
}
