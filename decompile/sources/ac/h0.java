package ac;

import android.content.Context;
import android.os.Process;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od.j f384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final od.j f386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final od.j f387e;
    public boolean f;

    public h0(Context context, l1 l1Var) {
        de.i.e(context, "appContext");
        de.i.e(l1Var, "uuidGenerator");
        this.f383a = context;
        final int i = 0;
        this.f384b = new od.j(new ce.a(this) { // from class: ac.f0

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ h0 f358w;

            {
                this.f358w = this;
            }

            @Override // ce.a
            public final Object b() {
                switch (i) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        return ((i0) this.f358w.f387e.getValue()).f403a;
                    default:
                        return x.b(this.f358w.f383a);
                }
            }
        });
        this.f385c = Process.myPid();
        this.f386d = new od.j(new g0(0, l1Var));
        final int i10 = 1;
        this.f387e = new od.j(new ce.a(this) { // from class: ac.f0

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ h0 f358w;

            {
                this.f358w = this;
            }

            @Override // ce.a
            public final Object b() {
                switch (i10) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        return ((i0) this.f358w.f387e.getValue()).f403a;
                    default:
                        return x.b(this.f358w.f383a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f384b.getValue();
    }

    public final Map b(Map map) {
        od.j jVar = this.f386d;
        if (map != null) {
            LinkedHashMap linkedHashMapU = pd.s.U(map);
            linkedHashMapU.put(a(), new e0(Process.myPid(), (String) jVar.getValue()));
            return pd.s.T(linkedHashMapU);
        }
        Map mapSingletonMap = Collections.singletonMap(a(), new e0(Process.myPid(), (String) jVar.getValue()));
        de.i.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }
}
