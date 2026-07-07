package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u implements Comparator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f2455x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ic.s f2456y;

    public u(h hVar, ic.s sVar) {
        this.f2455x = hVar;
        this.f2456y = sVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        if (nVar instanceof r) {
            if (nVar2 instanceof r) {
                return 0;
            }
            return 1;
        }
        if (nVar2 instanceof r) {
            return -1;
        }
        h hVar = this.f2455x;
        if (hVar == null) {
            return nVar.f().compareTo(nVar2.f());
        }
        return (int) a8.a.D(hVar.i(this.f2456y, Arrays.asList(nVar, nVar2)).b().doubleValue());
    }
}
