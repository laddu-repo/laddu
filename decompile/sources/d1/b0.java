package d1;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends de.j implements ce.l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3851w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3852x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, Object obj) {
        super(1);
        this.f3851w = i;
        this.f3852x = obj;
    }

    @Override // ce.l
    public final Object a(Object obj) {
        switch (this.f3851w) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Throwable th = (Throwable) obj;
                e0 e0Var = (e0) this.f3852x;
                od.j jVar = e0Var.f3871j;
                if (th != null) {
                    e0Var.f3870h.A(new o0(th));
                }
                if (jVar.a()) {
                    ((l0) jVar.getValue()).close();
                }
                return od.l.f10126a;
            default:
                File file = (File) obj;
                de.i.e(file, "it");
                return new w0(((re.c) this.f3852x).f11376v, file);
        }
    }
}
