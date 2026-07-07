package d1;

import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o extends ud.h implements ce.p {
    public /* synthetic */ Object A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f3923z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, sd.c cVar, int i10) {
        super(i, cVar);
        this.f3923z = i10;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        switch (this.f3923z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((o) l((i1) obj, (sd.c) obj2)).o(od.l.f10126a);
            case 1:
                o oVar = (o) l((String) obj, (sd.c) obj2);
                od.l lVar = od.l.f10126a;
                oVar.o(lVar);
                return lVar;
            default:
                return ((o) l((dc.h) obj, (sd.c) obj2)).o(od.l.f10126a);
        }
    }

    @Override // ud.a
    public final sd.c l(Object obj, sd.c cVar) {
        switch (this.f3923z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                o oVar = new o(2, cVar, 0);
                oVar.A = obj;
                return oVar;
            case 1:
                o oVar2 = new o(2, cVar, 1);
                oVar2.A = obj;
                return oVar2;
            default:
                return new o((dc.h) this.A, cVar);
        }
    }

    @Override // ud.a
    public final Object o(Object obj) {
        switch (this.f3923z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                fa.b.z(obj);
                return Boolean.valueOf(!(((i1) this.A) instanceof o0));
            case 1:
                fa.b.z(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.A));
                return od.l.f10126a;
            default:
                fa.b.z(obj);
                return (dc.h) this.A;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(dc.h hVar, sd.c cVar) {
        super(2, cVar);
        this.f3923z = 2;
        this.A = hVar;
    }
}
