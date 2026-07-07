package p4;

import android.database.SQLException;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends ud.h implements ce.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ l0 C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f10306z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(l0 l0Var, sd.c cVar, int i) {
        super(2, cVar);
        this.f10306z = i;
        this.C = l0Var;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        switch (this.f10306z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((g0) l((r4.i) obj, (sd.c) obj2)).o(od.l.f10126a);
            default:
                return ((g0) l((d0) obj, (sd.c) obj2)).o(od.l.f10126a);
        }
    }

    @Override // ud.a
    public final sd.c l(Object obj, sd.c cVar) {
        switch (this.f10306z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                g0 g0Var = new g0(this.C, cVar, 0);
                g0Var.B = obj;
                return g0Var;
            default:
                g0 g0Var2 = new g0(this.C, cVar, 1);
                g0Var2.B = obj;
                return g0Var2;
        }
    }

    @Override // ud.a
    public final Object o(Object obj) {
        d0 d0Var;
        switch (this.f10306z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i = this.A;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fa.b.z(obj);
                    return obj;
                }
                fa.b.z(obj);
                r4.i iVar = (r4.i) this.B;
                this.A = 1;
                Object objA = l0.a(this.C, iVar, this);
                td.a aVar = td.a.f12544v;
                return objA == aVar ? aVar : objA;
            default:
                int i10 = this.A;
                td.a aVar2 = td.a.f12544v;
                try {
                    if (i10 == 0) {
                        fa.b.z(obj);
                        d0Var = (d0) this.B;
                        this.B = d0Var;
                        this.A = 1;
                        obj = d0Var.b(this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fa.b.z(obj);
                            return (Set) obj;
                        }
                        d0Var = (d0) this.B;
                        fa.b.z(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        c0 c0Var = c0.f10290w;
                        g0 g0Var = new g0(this.C, null, 0);
                        this.B = null;
                        this.A = 2;
                        obj = d0Var.d(c0Var, g0Var, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return pd.r.f10553v;
        }
    }
}
