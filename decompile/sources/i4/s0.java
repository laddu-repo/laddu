package i4;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements g1, u1.g, s9.e {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6544x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f6545y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f6546z;

    public /* synthetic */ s0(Object obj, boolean z10, int i6) {
        this.f6544x = i6;
        this.f6546z = obj;
        this.f6545y = z10;
    }

    @Override // u1.g
    public void accept(Object obj) {
        ((l1) obj).C0((r1.d) this.f6546z, this.f6545y);
    }

    @Override // i4.g1
    public Object c(b0 b0Var, s sVar, int i6) {
        int m02;
        long currentPosition;
        int m03;
        long currentPosition2;
        switch (this.f6544x) {
            case 0:
                db.c1 o10 = db.k0.o((r1.e0) this.f6546z);
                boolean z10 = this.f6545y;
                if (z10) {
                    m02 = -1;
                } else {
                    m02 = b0Var.f6318t.m0();
                }
                if (z10) {
                    currentPosition = -9223372036854775807L;
                } else {
                    currentPosition = b0Var.f6318t.getCurrentPosition();
                }
                return b0Var.q(sVar, o10, m02, currentPosition);
            default:
                List list = (List) this.f6546z;
                boolean z11 = this.f6545y;
                if (z11) {
                    m03 = -1;
                } else {
                    m03 = b0Var.f6318t.m0();
                }
                if (z11) {
                    currentPosition2 = -9223372036854775807L;
                } else {
                    currentPosition2 = b0Var.f6318t.getCurrentPosition();
                }
                return b0Var.q(sVar, list, m03, currentPosition2);
        }
    }

    @Override // s9.e
    public void onSuccess(Object obj) {
        SharedPreferences.Editor edit = a8.d.e((Context) this.f6546z).edit();
        edit.putBoolean("proxy_retention", this.f6545y);
        edit.apply();
    }
}
