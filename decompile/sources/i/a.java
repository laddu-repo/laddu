package i;

import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ f A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6110x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ View f6111y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ View f6112z;

    public /* synthetic */ a(f fVar, View view, View view2, int i6) {
        this.f6110x = i6;
        this.A = fVar;
        this.f6111y = view;
        this.f6112z = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6110x) {
            case 0:
                f.b(this.A.f6196v, this.f6111y, this.f6112z);
                return;
            default:
                f.b(this.A.f6182f, this.f6111y, this.f6112z);
                return;
        }
    }
}
