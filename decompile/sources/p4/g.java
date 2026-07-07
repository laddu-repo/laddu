package p4;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import me.y0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f10300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f10301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f10302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f10303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f10304e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f10305g;

    /* JADX WARN: Type inference failed for: r1v4, types: [p4.f] */
    /* JADX WARN: Type inference failed for: r1v5, types: [p4.f] */
    public g(u uVar, HashMap map, HashMap map2, String... strArr) {
        this.f10300a = uVar;
        l0 l0Var = new l0(uVar, map, map2, strArr, uVar.f10362j, new y0(1, this, g.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 1));
        this.f10301b = l0Var;
        this.f10302c = new LinkedHashMap();
        this.f10303d = new ReentrantLock();
        final int i = 0;
        this.f10304e = new ce.a(this) { // from class: p4.f

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ g f10297w;

            {
                this.f10297w = this;
            }

            @Override // ce.a
            public final Object b() {
                switch (i) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        this.f10297w.getClass();
                        break;
                    case 1:
                        this.f10297w.getClass();
                        break;
                    default:
                        g gVar = this.f10297w;
                        return Boolean.valueOf(!gVar.f10300a.m() || gVar.f10300a.p());
                }
                return od.l.f10126a;
            }
        };
        final int i10 = 1;
        this.f = new ce.a(this) { // from class: p4.f

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ g f10297w;

            {
                this.f10297w = this;
            }

            @Override // ce.a
            public final Object b() {
                switch (i10) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        this.f10297w.getClass();
                        break;
                    case 1:
                        this.f10297w.getClass();
                        break;
                    default:
                        g gVar = this.f10297w;
                        return Boolean.valueOf(!gVar.f10300a.m() || gVar.f10300a.p());
                }
                return od.l.f10126a;
            }
        };
        de.i.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.f10305g = new Object();
        final int i11 = 2;
        l0Var.f10333j = new ce.a(this) { // from class: p4.f

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ g f10297w;

            {
                this.f10297w = this;
            }

            @Override // ce.a
            public final Object b() {
                switch (i11) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        this.f10297w.getClass();
                        break;
                    case 1:
                        this.f10297w.getClass();
                        break;
                    default:
                        g gVar = this.f10297w;
                        return Boolean.valueOf(!gVar.f10300a.m() || gVar.f10300a.p());
                }
                return od.l.f10126a;
            }
        };
    }
}
