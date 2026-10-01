package jd;

import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7382x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f7383y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f7384z;

    public /* synthetic */ i(int i6, int i10, Object obj) {
        this.f7382x = i10;
        this.f7384z = obj;
        this.f7383y = i6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7382x) {
            case 0:
                ((ve.l) this.f7384z).invoke(Integer.valueOf(this.f7383y));
                return;
            default:
                k4.i iVar = (k4.i) this.f7384z;
                k4.q qVar = iVar.D;
                int i6 = iVar.C;
                int i10 = this.f7383y;
                if (i10 != i6) {
                    qVar.setPlaybackSpeed(iVar.B[i10]);
                }
                qVar.N.dismiss();
                return;
        }
    }
}
