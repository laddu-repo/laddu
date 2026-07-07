package gd;

import android.os.CountDownTimer;
import android.widget.TextView;
import p.q3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5610a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q3 f5611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5612c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j, long j10, long j11, q3 q3Var) {
        super(j, 1000L);
        this.f5612c = j10;
        this.f5613d = j11;
        this.f5611b = q3Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.f5610a) {
            case 0:
                this.f5611b.a();
                return;
            default:
                this.f5611b.d(this.f5612c, this.f5613d);
                return;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.f5610a) {
            case 0:
                ((TextView) this.f5611b.f10363y).setText(q3.b((this.f5612c - j) - this.f5613d));
                return;
            default:
                ((TextView) this.f5611b.f10363y).setText(q3.b(j));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j, q3 q3Var, long j10, long j11) {
        super(j, 1000L);
        this.f5611b = q3Var;
        this.f5612c = j10;
        this.f5613d = j11;
    }
}
