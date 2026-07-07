package z7;

import androidx.lifecycle.w;
import gf.c0;
import gf.f0;
import gf.i1;
import gf.j1;
import gf.y;
import java.io.Closeable;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import le.h;
import ne.j;
import s1.c;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements c0, Closeable {
    public j A;
    public boolean B;
    public boolean C;
    public boolean D;

    /* renamed from: x, reason: collision with root package name */
    public p f15225x;

    /* renamed from: y, reason: collision with root package name */
    public final l6.j f15226y;

    /* renamed from: z, reason: collision with root package name */
    public final h f15227z;

    /* JADX WARN: Type inference failed for: r0v1, types: [ve.a, kotlin.jvm.internal.l] */
    public b(y yVar) {
        w lifeEvent = w.ON_DESTROY;
        k.e(lifeEvent, "lifeEvent");
        b8.b.a(new l(0));
        l6.j jVar = new l6.j(this);
        this.f15226y = jVar;
        this.f15227z = yVar.plus(jVar).plus(f0.e());
        this.B = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c.c(this.f15226y);
        j1 j1Var = (j1) this.f15227z.get(i1.f5682x);
        if (j1Var != null) {
            j1Var.d(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + this).toString());
        }
    }

    @Override // gf.c0
    public final h getCoroutineContext() {
        return this.f15227z;
    }
}
