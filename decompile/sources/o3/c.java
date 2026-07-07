package o3;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n9.a0;
import r1.i0;
import r1.j0;
import u1.s;
import u1.t;
import u1.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends c9.a {

    /* renamed from: d, reason: collision with root package name */
    public final t f9866d = new t();

    /* renamed from: e, reason: collision with root package name */
    public final s f9867e = new s();

    /* renamed from: f, reason: collision with root package name */
    public y f9868f;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c9.a
    public final j0 e(h3.a aVar, ByteBuffer byteBuffer) {
        Object obj;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j;
        boolean z14;
        boolean z15;
        boolean z16;
        long j10;
        long j11;
        y yVar = this.f9868f;
        if (yVar == null || aVar.F != yVar.e()) {
            y yVar2 = new y(aVar.B);
            this.f9868f = yVar2;
            yVar2.a(aVar.B - aVar.F);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        t tVar = this.f9866d;
        tVar.I(limit, array);
        s sVar = this.f9867e;
        sVar.o(limit, array);
        sVar.t(39);
        long i6 = (sVar.i(1) << 32) | sVar.i(32);
        sVar.t(20);
        int i10 = sVar.i(12);
        int i11 = sVar.i(8);
        tVar.L(14);
        if (i11 != 0) {
            if (i11 != 255) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            obj = null;
                        } else {
                            y yVar3 = this.f9868f;
                            long d10 = a.d(i6, tVar);
                            obj = new a(1, d10, yVar3.b(d10));
                        }
                    } else {
                        y yVar4 = this.f9868f;
                        tVar.A();
                        if ((tVar.y() & 128) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        List list = Collections.EMPTY_LIST;
                        if (!z13) {
                            int y9 = tVar.y();
                            if ((y9 & 64) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((y9 & 32) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if ((y9 & 16) != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z14 && !z16) {
                                j10 = a.d(i6, tVar);
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            if (!z14) {
                                int y10 = tVar.y();
                                ArrayList arrayList = new ArrayList(y10);
                                for (int i12 = 0; i12 < y10; i12++) {
                                    tVar.y();
                                    if (!z16) {
                                        j11 = a.d(i6, tVar);
                                    } else {
                                        j11 = -9223372036854775807L;
                                    }
                                    yVar4.b(j11);
                                    arrayList.add(new a0(28));
                                }
                                list = arrayList;
                            }
                            if (z15) {
                                tVar.y();
                                tVar.A();
                            }
                            tVar.E();
                            tVar.y();
                            tVar.y();
                            j = j10;
                        } else {
                            j = -9223372036854775807L;
                        }
                        obj = new d(j, yVar4.b(j), list);
                    }
                } else {
                    int y11 = tVar.y();
                    ArrayList arrayList2 = new ArrayList(y11);
                    for (int i13 = 0; i13 < y11; i13++) {
                        tVar.A();
                        if ((tVar.y() & 128) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        if (!z10) {
                            int y12 = tVar.y();
                            if ((y12 & 64) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if ((y12 & 32) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z11) {
                                tVar.A();
                            }
                            if (!z11) {
                                int y13 = tVar.y();
                                ArrayList arrayList4 = new ArrayList(y13);
                                for (int i14 = 0; i14 < y13; i14++) {
                                    tVar.y();
                                    tVar.A();
                                    arrayList4.add(new n9.y(29));
                                }
                                arrayList3 = arrayList4;
                            }
                            if (z12) {
                                tVar.y();
                                tVar.A();
                            }
                            tVar.E();
                            tVar.y();
                            tVar.y();
                        }
                        arrayList2.add(new f(arrayList3));
                    }
                    obj = new g(arrayList2);
                }
            } else {
                long A = tVar.A();
                int i15 = i10 - 4;
                tVar.i(new byte[i15], 0, i15);
                obj = new a(0, A, i6);
            }
        } else {
            obj = new Object();
        }
        if (obj == null) {
            return new j0(new i0[0]);
        }
        return new j0(obj);
    }
}
