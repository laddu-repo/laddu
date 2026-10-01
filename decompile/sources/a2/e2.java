package a2;

import android.os.Looper;
import android.os.SystemClock;
import com.playfy.tv.activities.PlayerActivity;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e2 implements a7.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f217b;

    public /* synthetic */ e2(int i6, boolean z10) {
        this.f216a = i6;
        this.f217b = z10;
    }

    @Override // a7.i
    public boolean a(w6.h hVar) {
        return this.f217b;
    }

    @Override // a7.i
    public boolean b() {
        return this.f217b;
    }

    public void c(boolean z10) {
        switch (this.f216a) {
            case 0:
                if (this.f217b != z10) {
                    this.f217b = z10;
                    return;
                }
                return;
            default:
                if (this.f217b != z10) {
                    this.f217b = z10;
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.f216a) {
            case 3:
                return "Progress(currentByteCount=0, totalByteCount=0, finish=" + this.f217b + ')';
            default:
                return super.toString();
        }
    }

    public e2(int i6) {
        this.f216a = i6;
        switch (i6) {
            case 4:
                return;
            default:
                SystemClock.elapsedRealtime();
                return;
        }
    }

    public e2(PlayerActivity playerActivity, Looper looper, u1.v vVar, int i6) {
        this.f216a = i6;
        switch (i6) {
            case 1:
                new zb.d(playerActivity.getApplicationContext());
                vVar.a(looper, null);
                return;
            default:
                new w8.l(playerActivity.getApplicationContext());
                vVar.a(looper, null);
                return;
        }
    }

    public e2(v1.o oVar, v1.q qVar) {
        this.f216a = 5;
        int i6 = qVar.f13251a;
        ByteBuffer byteBuffer = qVar.f13252b;
        u1.c.b(i6 == 6 || i6 == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        u1.s sVar = new u1.s(min, bArr);
        oVar.getClass();
        if (sVar.h()) {
            this.f217b = false;
            return;
        }
        int i10 = sVar.i(2);
        if (!sVar.h()) {
            this.f217b = true;
            return;
        }
        if (i10 != 3 && i10 != 0) {
            sVar.h();
        }
        sVar.s();
        throw new Exception();
    }
}
