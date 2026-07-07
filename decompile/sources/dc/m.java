package dc;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.atomic.AtomicReference;
import me.v;
import pe.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ud.h implements ce.p {
    public int A;
    public final /* synthetic */ o B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f4492z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, sd.c cVar, int i) {
        super(2, cVar);
        this.f4492z = i;
        this.B = oVar;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        v vVar = (v) obj;
        sd.c cVar = (sd.c) obj2;
        switch (this.f4492z) {
        }
        return ((m) l(vVar, cVar)).o(od.l.f10126a);
    }

    @Override // ud.a
    public final sd.c l(Object obj, sd.c cVar) {
        switch (this.f4492z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new m(this.B, cVar, 0);
            default:
                return new m(this.B, cVar, 1);
        }
    }

    @Override // ud.a
    public final Object o(Object obj) {
        switch (this.f4492z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i = this.A;
                if (i == 0) {
                    fa.b.z(obj);
                    o oVar = this.B;
                    pe.c cVarB = oVar.f4496b.b();
                    final AtomicReference atomicReference = oVar.f4497c;
                    pe.d dVar = new pe.d() { // from class: dc.l
                        public final boolean equals(Object obj2) {
                            if ((obj2 instanceof pe.d) && (obj2 instanceof l)) {
                                return new de.a(atomicReference).equals(new de.a(atomicReference));
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return ((((((((((AtomicReference.class.hashCode() + ((atomicReference != null ? r0.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + 1237) * 31) + 2) * 31) + 2;
                        }

                        @Override // pe.d
                        public final Object j(Object obj2, sd.c cVar) {
                            atomicReference.set((h) obj2);
                            return od.l.f10126a;
                        }
                    };
                    this.A = 1;
                    Object objG = cVarB.g(dVar, this);
                    td.a aVar = td.a.f12544v;
                    if (objG == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fa.b.z(obj);
                }
                return od.l.f10126a;
            default:
                int i10 = this.A;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fa.b.z(obj);
                    return obj;
                }
                fa.b.z(obj);
                pe.c cVarB2 = this.B.f4496b.b();
                this.A = 1;
                Object objD = y.d(cVarB2, this);
                td.a aVar2 = td.a.f12544v;
                return objD == aVar2 ? aVar2 : objD;
        }
    }
}
