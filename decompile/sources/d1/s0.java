package d1;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends ud.h implements ce.p {
    public final /* synthetic */ w0 A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f3937z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(w0 w0Var, sd.c cVar, int i) {
        super(2, cVar);
        this.f3937z = i;
        this.A = w0Var;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        me.v vVar = (me.v) obj;
        sd.c cVar = (sd.c) obj2;
        switch (this.f3937z) {
        }
        return ((s0) l(vVar, cVar)).o(od.l.f10126a);
    }

    @Override // ud.a
    public final sd.c l(Object obj, sd.c cVar) {
        switch (this.f3937z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new s0(this.A, cVar, 0);
            default:
                return new s0(this.A, cVar, 1);
        }
    }

    @Override // ud.a
    public final Object o(Object obj) {
        int i = this.f3937z;
        fa.b.z(obj);
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new Integer(d1.f3860b.nativeGetCounterValue(((d1) this.A.i.getValue()).f3861a));
            default:
                return new Integer(d1.f3860b.nativeIncrementAndGetCounterValue(((d1) this.A.i.getValue()).f3861a));
        }
    }
}
