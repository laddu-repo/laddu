package j2;

import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.View;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j4.b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import q2.y0;
import q2.z0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y implements x, z0, u0.m {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7143x;

    /* renamed from: y, reason: collision with root package name */
    public int f7144y;

    /* renamed from: z, reason: collision with root package name */
    public Object f7145z;

    public /* synthetic */ y(int i6, int i10, Object obj) {
        this.f7143x = i10;
        this.f7145z = obj;
        this.f7144y = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(j2.y r10, he.b r11, ne.a r12) {
        /*
            java.lang.Object r0 = r10.f7145z
            y2.j r0 = (y2.j) r0
            boolean r1 = r12 instanceof yf.q
            if (r1 == 0) goto L17
            r1 = r12
            yf.q r1 = (yf.q) r1
            int r2 = r1.E
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.E = r2
            goto L1c
        L17:
            yf.q r1 = new yf.q
            r1.<init>(r10, r12)
        L1c:
            java.lang.Object r12 = r1.C
            int r2 = r1.E
            r3 = 0
            r4 = 6
            r5 = 0
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L5e
            if (r2 != r8) goto L56
            int r10 = r1.B
            java.lang.String r11 = r1.A
            java.util.LinkedHashMap r0 = r1.f15083z
            j2.y r2 = r1.f15082y
            he.b r9 = r1.f15081x
            he.a.f(r12)
            xf.k r12 = (xf.k) r12
            r0.put(r11, r12)
            java.lang.Object r11 = r2.f7145z
            y2.j r11 = (y2.j) r11
            byte r11 = r11.f()
            if (r11 == r7) goto L53
            if (r11 != r6) goto L49
            goto L99
        L49:
            java.lang.Object r10 = r2.f7145z
            y2.j r10 = (y2.j) r10
            java.lang.String r11 = "Expected end of the object or comma"
            y2.j.q(r10, r11, r5, r3, r4)
            throw r3
        L53:
            r5 = r10
            r10 = r2
            goto L72
        L56:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L5e:
            he.a.f(r12)
            byte r12 = r0.g(r4)
            byte r2 = r0.w()
            if (r2 == r7) goto Lb1
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r9 = r11
            r11 = r12
        L72:
            java.lang.Object r12 = r10.f7145z
            y2.j r12 = (y2.j) r12
            boolean r2 = r12.c()
            if (r2 == 0) goto L98
            java.lang.String r11 = r12.j()
            r2 = 5
            r12.g(r2)
            r1.f15081x = r9
            r1.f15082y = r10
            r1.f15083z = r0
            r1.A = r11
            r1.B = r5
            r1.E = r8
            r9.getClass()
            r9.f6068y = r1
            me.a r10 = me.a.f8833x
            return r10
        L98:
            r2 = r10
        L99:
            java.lang.Object r10 = r2.f7145z
            y2.j r10 = (y2.j) r10
            if (r11 != r4) goto La3
            r10.g(r6)
            goto La5
        La3:
            if (r11 == r7) goto Lab
        La5:
            xf.w r10 = new xf.w
            r10.<init>(r0)
            return r10
        Lab:
            java.lang.String r11 = "object"
            yf.n.i(r10, r11)
            throw r3
        Lb1:
            java.lang.String r10 = "Unexpected leading comma"
            y2.j.q(r0, r10, r5, r3, r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.y.d(j2.y, he.b, ne.a):java.lang.Object");
    }

    @Override // u0.m
    public boolean a(View view) {
        ((BottomSheetBehavior) this.f7145z).C(this.f7144y);
        return true;
    }

    @Override // q2.z0
    public void b() {
        e5 e5Var = ((m2.s) this.f7145z).I;
        if (e5Var == null) {
        } else {
            throw e5Var;
        }
    }

    @Override // j2.x
    public MediaCodecInfo c(int i6) {
        if (((MediaCodecInfo[]) this.f7145z) == null) {
            this.f7145z = new MediaCodecList(this.f7144y).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f7145z)[i6];
    }

    public void e(long j) {
        int i6 = this.f7144y;
        long[] jArr = (long[]) this.f7145z;
        if (i6 == jArr.length) {
            this.f7145z = Arrays.copyOf(jArr, i6 * 2);
        }
        long[] jArr2 = (long[]) this.f7145z;
        int i10 = this.f7144y;
        this.f7144y = i10 + 1;
        jArr2[i10] = j;
    }

    public void f(long[] jArr) {
        int length = this.f7144y + jArr.length;
        long[] jArr2 = (long[]) this.f7145z;
        if (length > jArr2.length) {
            this.f7145z = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f7145z, this.f7144y, jArr.length);
        this.f7144y = length;
    }

    @Override // j2.x
    public boolean g(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public void h() {
        Bitmap bitmap;
        WeakReference weakReference;
        this.f7144y = 0;
        Iterator it = ((LinkedHashMap) this.f7145z).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                t6.e eVar = (t6.e) ie.j.H(arrayList);
                if (eVar != null && (weakReference = eVar.f12622b) != null) {
                    bitmap = (Bitmap) weakReference.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i6 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    int i11 = i10 - i6;
                    if (((t6.e) arrayList.get(i11)).f12622b.get() == null) {
                        arrayList.remove(i11);
                        i6++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public void i(int i6, int i10) {
        int i11 = i10 + i6;
        char[] cArr = (char[]) this.f7145z;
        if (cArr.length <= i11) {
            int i12 = i6 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] copyOf = Arrays.copyOf(cArr, i11);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
            this.f7145z = copyOf;
        }
    }

    @Override // q2.z0
    public boolean isReady() {
        m2.s sVar = (m2.s) this.f7145z;
        int i6 = this.f7144y;
        if (!sVar.N) {
            m2.r rVar = (m2.r) sVar.B.get(i6);
            if (rVar.f8536c.x(rVar.f8537d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // q2.z0
    public int j(long j) {
        m2.s sVar = (m2.s) this.f7145z;
        int i6 = this.f7144y;
        if (sVar.N) {
            return -3;
        }
        m2.r rVar = (m2.r) sVar.B.get(i6);
        y0 y0Var = rVar.f8536c;
        int v10 = y0Var.v(rVar.f8537d, j);
        y0Var.I(v10);
        return v10;
    }

    public long k(int i6) {
        if (i6 >= 0 && i6 < this.f7144y) {
            return ((long[]) this.f7145z)[i6];
        }
        StringBuilder n10 = h8.c.n(i6, "Invalid index ", ", size is ");
        n10.append(this.f7144y);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // j2.x
    public boolean l(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // j2.x
    public int m() {
        if (((MediaCodecInfo[]) this.f7145z) == null) {
            this.f7145z = new MediaCodecList(this.f7144y).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f7145z).length;
    }

    @Override // q2.z0
    public int n(b0 b0Var, y1.h hVar, int i6) {
        m2.s sVar = (m2.s) this.f7145z;
        int i10 = this.f7144y;
        if (sVar.N) {
            return -3;
        }
        m2.r rVar = (m2.r) sVar.B.get(i10);
        return rVar.f8536c.C(b0Var, hVar, i6, rVar.f8537d);
    }

    public boolean o() {
        if (((n7.a) this.f7145z) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [he.b, java.lang.Object, le.c] */
    public xf.k p() {
        xf.k wVar;
        Object obj;
        y2.j jVar = (y2.j) this.f7145z;
        byte w10 = jVar.w();
        if (w10 == 1) {
            return t(true);
        }
        if (w10 == 0) {
            return t(false);
        }
        if (w10 == 6) {
            int i6 = this.f7144y + 1;
            this.f7144y = i6;
            if (i6 == 200) {
                yf.p pVar = new yf.p(this, null);
                ?? obj2 = new Object();
                obj2.f6067x = pVar;
                obj2.f6068y = obj2;
                me.a aVar = he.a.f6066a;
                obj2.f6069z = aVar;
                while (true) {
                    obj = obj2.f6069z;
                    le.c cVar = obj2.f6068y;
                    if (cVar == null) {
                        break;
                    }
                    if (kotlin.jvm.internal.k.a(aVar, obj)) {
                        try {
                            yf.p pVar2 = obj2.f6067x;
                            kotlin.jvm.internal.z.c(3, pVar2);
                            yf.p pVar3 = new yf.p(pVar2.A, cVar);
                            pVar3.f15080z = obj2;
                            Object invokeSuspend = pVar3.invokeSuspend(he.y.f6101a);
                            if (invokeSuspend != me.a.f8833x) {
                                cVar.resumeWith(invokeSuspend);
                            }
                        } catch (Throwable th) {
                            cVar.resumeWith(he.a.b(th));
                        }
                    } else {
                        obj2.f6069z = aVar;
                        cVar.resumeWith(obj);
                    }
                }
                he.a.f(obj);
                wVar = (xf.k) obj;
            } else {
                byte g10 = jVar.g((byte) 6);
                if (jVar.w() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        if (!jVar.c()) {
                            break;
                        }
                        String j = jVar.j();
                        jVar.g((byte) 5);
                        linkedHashMap.put(j, p());
                        g10 = jVar.f();
                        if (g10 != 4) {
                            if (g10 != 7) {
                                y2.j.q(jVar, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                        }
                    }
                    if (g10 == 6) {
                        jVar.g((byte) 7);
                    } else if (g10 == 4) {
                        yf.n.i(jVar, "object");
                        throw null;
                    }
                    wVar = new xf.w(linkedHashMap);
                } else {
                    y2.j.q(jVar, "Unexpected leading comma", 0, null, 6);
                    throw null;
                }
            }
            this.f7144y--;
            return wVar;
        }
        if (w10 == 8) {
            return r();
        }
        y2.j.q(jVar, "Cannot read Json element because of unexpected ".concat(yf.n.n(w10)), 0, null, 6);
        throw null;
    }

    @Override // j2.x
    public boolean q() {
        return true;
    }

    public xf.e r() {
        boolean z10;
        y2.j jVar = (y2.j) this.f7145z;
        byte f3 = jVar.f();
        if (jVar.w() != 4) {
            ArrayList arrayList = new ArrayList();
            while (jVar.c()) {
                arrayList.add(p());
                f3 = jVar.f();
                if (f3 != 4) {
                    if (f3 == 9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i6 = jVar.f14913b;
                    if (!z10) {
                        y2.j.q(jVar, "Expected end of the array or comma", i6, null, 4);
                        throw null;
                    }
                }
            }
            if (f3 == 8) {
                jVar.g((byte) 9);
            } else if (f3 == 4) {
                yf.n.i(jVar, "array");
                throw null;
            }
            return new xf.e(arrayList);
        }
        y2.j.q(jVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public long s(y2.l lVar) {
        u1.t tVar = (u1.t) this.f7145z;
        int i6 = 0;
        lVar.k(tVar.f12811a, 0, 1, false);
        int i10 = tVar.f12811a[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        lVar.k(tVar.f12811a, 1, i12, false);
        while (i6 < i12) {
            i6++;
            i13 = (tVar.f12811a[i6] & 255) + (i13 << 8);
        }
        this.f7144y = i12 + 1 + this.f7144y;
        return i13;
    }

    public xf.a0 t(boolean z10) {
        String j;
        y2.j jVar = (y2.j) this.f7145z;
        if (!z10) {
            j = jVar.l();
        } else {
            j = jVar.j();
        }
        if (!z10 && kotlin.jvm.internal.k.a(j, "null")) {
            return xf.t.INSTANCE;
        }
        return new xf.q(j, z10);
    }

    public String toString() {
        switch (this.f7143x) {
            case 8:
                return new String((char[]) this.f7145z, 0, this.f7144y);
            default:
                return super.toString();
        }
    }

    public synchronized void u(t6.a aVar, Bitmap bitmap, Map map, int i6) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7145z;
            Object obj = linkedHashMap.get(aVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(aVar, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            t6.e eVar = new t6.e(identityHashCode, new WeakReference(bitmap), map, i6);
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    t6.e eVar2 = (t6.e) arrayList.get(i10);
                    if (i6 >= eVar2.f12624d) {
                        if (eVar2.f12621a == identityHashCode && eVar2.f12622b.get() == bitmap) {
                            arrayList.set(i10, eVar);
                        } else {
                            arrayList.add(i10, eVar);
                        }
                    } else {
                        i10++;
                    }
                } else {
                    arrayList.add(eVar);
                    break;
                }
            }
            int i11 = this.f7144y;
            this.f7144y = i11 + 1;
            if (i11 >= 10) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void v(int i6) {
        if (i6 >= 10 && i6 != 20) {
            h();
        }
    }

    public void w(String text) {
        kotlin.jvm.internal.k.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        i(this.f7144y, length);
        text.getChars(0, text.length(), (char[]) this.f7145z, this.f7144y);
        this.f7144y += length;
    }

    public y(t8.b bVar, int i6) {
        this.f7143x = 7;
        w8.x.g(bVar);
        this.f7145z = bVar;
        this.f7144y = i6;
    }

    public y(xf.i iVar, y2.j jVar) {
        this.f7143x = 9;
        this.f7145z = jVar;
    }

    public y(int i6) {
        this.f7143x = 5;
        this.f7145z = new long[i6];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(byte b10, int i6) {
        this(32);
        this.f7143x = i6;
        switch (i6) {
            case 3:
                this.f7145z = new u1.t(8);
                return;
            case 4:
                this.f7145z = new LinkedHashMap();
                return;
            case 5:
                return;
            case 6:
            case 7:
            default:
                this.f7144y = 255;
                this.f7145z = null;
                return;
            case 8:
                return;
        }
    }

    public y(boolean z10, boolean z11, boolean z12) {
        this.f7143x = 0;
        this.f7144y = (z10 || z11 || z12) ? 1 : 0;
    }
}
