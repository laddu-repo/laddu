package i4;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements n0, s9.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f6398x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f6399y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f6400z;

    public /* synthetic */ i0(Object obj, Object obj2, boolean z10) {
        this.f6399y = obj;
        this.f6400z = obj2;
        this.f6398x = z10;
    }

    @Override // s9.a
    public Object e(Task task) {
        Context context = (Context) this.f6399y;
        Intent intent = (Intent) this.f6400z;
        if (a9.b.d() && ((Integer) task.f()).intValue() == 402) {
            return ic.h.a(context, intent, this.f6398x).j(new q.a(1), new u0(10));
        }
        return task;
    }

    @Override // i4.n0
    public void f(s sVar) {
        o0 o0Var = (o0) this.f6399y;
        hb.d0 q9 = o0Var.f6473g.q(sVar, db.k0.o((r1.e0) this.f6400z), -1, -9223372036854775807L);
        q9.a(new hb.s(0, q9, new j4(o0Var, sVar, this.f6398x)), hb.q.f6029x);
    }
}
