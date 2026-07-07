package lf;

import gf.f0;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e implements r {

    /* renamed from: x, reason: collision with root package name */
    public final le.h f8366x;

    /* renamed from: y, reason: collision with root package name */
    public final int f8367y;

    /* renamed from: z, reason: collision with root package name */
    public final jf.a f8368z;

    public e(le.h hVar, int i6, jf.a aVar) {
        this.f8366x = hVar;
        this.f8367y = i6;
        this.f8368z = aVar;
    }

    public abstract Object a(jf.v vVar, le.c cVar);

    public abstract e b(le.h hVar, int i6, jf.a aVar);

    public kf.h c() {
        return null;
    }

    @Override // kf.h
    public Object collect(kf.i iVar, le.c cVar) {
        Object j = f0.j(new dd.c(iVar, this, (le.c) null, 5), cVar);
        if (j == me.a.f8833x) {
            return j;
        }
        return he.y.f6101a;
    }

    @Override // lf.r
    public final kf.h r(le.h hVar, int i6, jf.a aVar) {
        le.h hVar2 = this.f8366x;
        le.h plus = hVar.plus(hVar2);
        jf.a aVar2 = jf.a.f7436x;
        jf.a aVar3 = this.f8368z;
        int i10 = this.f8367y;
        if (aVar == aVar2) {
            if (i10 != -3) {
                if (i6 != -3) {
                    if (i10 != -2) {
                        if (i6 != -2) {
                            i6 += i10;
                            if (i6 < 0) {
                                i6 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i6 = i10;
            }
            aVar = aVar3;
        }
        if (kotlin.jvm.internal.k.a(plus, hVar2) && i6 == i10 && aVar == aVar3) {
            return this;
        }
        return b(plus, i6, aVar);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        le.i iVar = le.i.f8353x;
        le.h hVar = this.f8366x;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i6 = this.f8367y;
        if (i6 != -3) {
            arrayList.add("capacity=" + i6);
        }
        jf.a aVar = jf.a.f7436x;
        jf.a aVar2 = this.f8368z;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return r4.a.n(sb2, ie.j.L(arrayList, ", ", null, null, null, 62), ']');
    }
}
