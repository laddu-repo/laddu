package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class wd implements s7.g {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f3197x = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static volatile y9.e1 f3198y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3199v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f3200w;

    public /* synthetic */ wd(int i, String str) {
        this.f3199v = i;
        this.f3200w = str;
    }

    @Override // s7.g
    public void accept(Object obj, Object obj2) {
        int i = this.f3199v;
        String str = this.f3200w;
        o8.h hVar = (o8.h) obj2;
        ab abVar = (ab) obj;
        switch (i) {
            case 1:
                int i10 = ya.f3254k;
                wa waVar = new wa(hVar);
                za zaVar = (za) abVar.m();
                Parcel parcelF = zaVar.f();
                l6.c(parcelF, waVar);
                parcelF.writeString(str);
                parcelF.writeString("");
                parcelF.writeString(null);
                zaVar.I(parcelF, 11);
                break;
            default:
                int i11 = ya.f3254k;
                wa waVar2 = new wa(hVar);
                za zaVar2 = (za) abVar.m();
                Parcel parcelF2 = zaVar2.f();
                l6.c(parcelF2, waVar2);
                parcelF2.writeString(str);
                zaVar2.I(parcelF2, 5);
                break;
        }
    }

    public wd(Context context, xd xdVar) {
        this.f3199v = 0;
        this.f3200w = xdVar.v() ? kb.b(context, xdVar.u()) : xdVar.u();
    }
}
