package gd;

import android.content.DialogInterface;
import android.os.Parcelable;
import kd.d0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements DialogInterface.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5639x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f5640y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f5641z;

    public /* synthetic */ u(int i6, Object obj, Object obj2) {
        this.f5639x = i6;
        this.f5640y = obj;
        this.f5641z = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        switch (this.f5639x) {
            case 0:
                x xVar = (x) this.f5640y;
                w wVar = (w) this.f5641z;
                dialogInterface.dismiss();
                df.v vVar = xVar.B;
                d0 d0Var = (d0) xVar.h(wVar.c());
                kotlin.jvm.internal.k.d(d0Var, "access$getItem(...)");
                vVar.invoke(d0Var, Boolean.TRUE);
                return;
            default:
                ve.l lVar = (ve.l) this.f5640y;
                Parcelable parcelable = (Parcelable) this.f5641z;
                dialogInterface.dismiss();
                lVar.invoke(parcelable);
                return;
        }
    }
}
