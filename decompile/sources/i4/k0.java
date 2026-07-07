package i4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.SparseBooleanArray;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6441x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f6442y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f6443z;

    public /* synthetic */ k0(b2.k kVar, int i6, List list, s sVar) {
        this.f6443z = kVar;
        this.f6442y = i6;
        this.A = list;
        this.B = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6441x) {
            case 0:
                b2.k kVar = (b2.k) this.f6443z;
                List list = (List) this.A;
                s sVar = (s) this.B;
                b0 b0Var = ((o0) kVar.A).f6473g;
                int i6 = this.f6442y;
                if (i6 == -1) {
                    b0Var.f6318t.w0(list);
                } else {
                    b0Var.f6318t.Z(i6, list);
                }
                new SparseBooleanArray().append(20, true);
                b0Var.p(sVar);
                return;
            default:
                e6.j jVar = (e6.j) this.f6443z;
                g8.i iVar = (g8.i) this.A;
                int i10 = this.f6442y;
                Runnable runnable = (Runnable) this.B;
                o8.c cVar = (o8.c) jVar.f4393f;
                try {
                    try {
                        n8.d dVar = (n8.d) jVar.f4390c;
                        Objects.requireNonNull(dVar);
                        ((n8.g) cVar).K(new j2.u(dVar, 5));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) jVar.f4388a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            jVar.h(iVar, i10);
                        } else {
                            ((n8.g) cVar).K(new a2.g0(i10, jVar, iVar));
                        }
                    } catch (o8.a unused) {
                        ((androidx.lifecycle.j1) jVar.f4391d).B(iVar, i10 + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    runnable.run();
                    throw th;
                }
        }
    }

    public /* synthetic */ k0(e6.j jVar, g8.i iVar, int i6, Runnable runnable) {
        this.f6443z = jVar;
        this.A = iVar;
        this.f6442y = i6;
        this.B = runnable;
    }
}
