package gf;

import android.os.Parcelable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 extends kotlin.jvm.internal.j implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5692x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(int i6, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i6, obj, cls, str, str2, i10);
        this.f5692x = i11;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        switch (this.f5692x) {
            case 0:
                ((g1) this.receiver).a((Throwable) obj);
                return he.y.f6101a;
            case 1:
                Parcelable p02 = (Parcelable) obj;
                kotlin.jvm.internal.k.e(p02, "p0");
                od.q qVar = (od.q) this.receiver;
                qVar.getClass();
                f0.w(androidx.lifecycle.d1.g(qVar), null, new androidx.lifecycle.c(p02, qVar, null, 11, false), 3);
                return he.y.f6101a;
            case 2:
                Parcelable p03 = (Parcelable) obj;
                kotlin.jvm.internal.k.e(p03, "p0");
                od.u uVar = (od.u) this.receiver;
                uVar.getClass();
                f0.w(androidx.lifecycle.d1.g(uVar), null, new androidx.lifecycle.c(p03, uVar, null, 12, false), 3);
                return he.y.f6101a;
            case 3:
                Parcelable p04 = (Parcelable) obj;
                kotlin.jvm.internal.k.e(p04, "p0");
                od.i0 i0Var = (od.i0) this.receiver;
                i0Var.getClass();
                f0.w(androidx.lifecycle.d1.g(i0Var), null, new androidx.lifecycle.c(p04, i0Var, null, 14, false), 3);
                return he.y.f6101a;
            default:
                Set p05 = (Set) obj;
                kotlin.jvm.internal.k.e(p05, "p0");
                x4.i iVar = (x4.i) this.receiver;
                ReentrantLock reentrantLock = iVar.f14581d;
                reentrantLock.lock();
                try {
                    List<x4.n> Z = ie.j.Z(iVar.f14580c.values());
                    reentrantLock.unlock();
                    for (x4.n nVar : Z) {
                        nVar.getClass();
                        int[] iArr = nVar.f14610b;
                        int length = iArr.length;
                        Set set = ie.t.f6848x;
                        if (length != 0) {
                            int i6 = 0;
                            if (length != 1) {
                                je.i iVar2 = new je.i();
                                int length2 = iArr.length;
                                int i10 = 0;
                                while (i6 < length2) {
                                    int i11 = i10 + 1;
                                    if (p05.contains(Integer.valueOf(iArr[i6]))) {
                                        iVar2.add(nVar.f14611c[i10]);
                                    }
                                    i6++;
                                    i10 = i11;
                                }
                                set = android.support.v4.media.session.b.c(iVar2);
                            } else if (p05.contains(Integer.valueOf(iArr[0]))) {
                                set = nVar.f14612d;
                            }
                        }
                        if (!set.isEmpty()) {
                            nVar.f14609a.a(set);
                        }
                    }
                    return he.y.f6101a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }
}
