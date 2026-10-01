package c2;

import android.content.Context;
import android.os.Looper;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.ef;
import com.google.android.gms.internal.measurement.qc;
import com.google.android.gms.internal.measurement.we;
import com.google.android.gms.internal.measurement.xe;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements xe {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1988v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1989w;

    public /* synthetic */ w1() {
        this.f1988v = 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.xe
    public /* bridge */ /* synthetic */ Object a(we weVar) throws IOException {
        qc qcVarA;
        InputStream inputStreamH = com.google.android.gms.internal.measurement.e1.h(weVar);
        try {
            int i = 4096;
            if (this.f1989w) {
                if (inputStreamH instanceof ef) {
                    long length = ((ef) inputStreamH).a().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                qcVarA = qc.a(com.google.android.gms.internal.measurement.w0.m(inputStreamH, i), true);
            } else {
                qcVarA = qc.a(com.google.android.gms.internal.measurement.w0.m(inputStreamH, 4096), false);
            }
            u1.c.h(inputStreamH, null);
            return qcVarA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u1.c.h(inputStreamH, th);
                throw th2;
            }
        }
    }

    public void b(boolean z2) {
        switch (this.f1988v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (this.f1989w != z2) {
                    this.f1989w = z2;
                    break;
                }
                break;
            default:
                if (this.f1989w != z2) {
                    this.f1989w = z2;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w1(int i, boolean z2) {
        this.f1988v = i;
        this.f1989w = z2;
    }

    public w1(Context context, Looper looper, w1.v vVar, int i) {
        this.f1988v = i;
        switch (i) {
            case 1:
                new kb.e(context.getApplicationContext());
                vVar.a(looper, null);
                break;
            default:
                new t7.k(context.getApplicationContext());
                vVar.a(looper, null);
                break;
        }
    }

    public w1(x1.o oVar, x1.q qVar) throws x1.p {
        this.f1988v = 5;
        int i = qVar.f14150a;
        ByteBuffer byteBuffer = qVar.f14151b;
        w1.a.d(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        u3.f fVar = new u3.f(iMin, bArr);
        oVar.getClass();
        if (fVar.h()) {
            this.f1989w = false;
            return;
        }
        int i10 = fVar.i(2);
        if (!fVar.h()) {
            this.f1989w = true;
            return;
        }
        if (i10 != 3 && i10 != 0) {
            fVar.h();
        }
        fVar.s();
        throw new x1.p();
    }
}
