package g8;

import android.content.Context;
import androidx.lifecycle.j1;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static volatile k f5555e;

    /* renamed from: a, reason: collision with root package name */
    public final p8.a f5556a;

    /* renamed from: b, reason: collision with root package name */
    public final p8.a f5557b;

    /* renamed from: c, reason: collision with root package name */
    public final l8.b f5558c;

    /* renamed from: d, reason: collision with root package name */
    public final e6.j f5559d;

    public r(p8.a aVar, p8.a aVar2, l8.b bVar, e6.j jVar, c6.h hVar) {
        this.f5556a = aVar;
        this.f5557b = aVar2;
        this.f5558c = bVar;
        this.f5559d = jVar;
        ((Executor) hVar.f1981x).execute(new j2.h(hVar, 8));
    }

    public static r a() {
        k kVar = f5555e;
        if (kVar != null) {
            return (r) kVar.C.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [g8.j, java.lang.Object] */
    public static void b(Context context) {
        if (f5555e == null) {
            synchronized (r.class) {
                try {
                    if (f5555e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f5542x = context;
                        f5555e = obj.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final q c(l lVar) {
        Set singleton;
        byte[] bytes;
        if (lVar != null) {
            singleton = Collections.unmodifiableSet(e8.a.f4463d);
        } else {
            singleton = Collections.singleton(new d8.c("proto"));
        }
        j1 a10 = i.a();
        lVar.getClass();
        a10.f949y = "cct";
        e8.a aVar = (e8.a) lVar;
        String str = aVar.f4466a;
        String str2 = aVar.f4467b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a10.f950z = bytes;
        return new q(singleton, a10.g(), this);
    }
}
