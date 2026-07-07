package ld;

import android.content.DialogInterface;
import j2.u;
import r1.j1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j1 f8340x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f8341y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ u f8342z;

    public /* synthetic */ m(j1 j1Var, o oVar, u uVar) {
        this.f8340x = j1Var;
        this.f8341y = oVar;
        this.f8342z = uVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        o.R(this.f8340x, this.f8341y, this.f8342z);
    }
}
