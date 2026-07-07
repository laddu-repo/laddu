package l4;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import com.google.android.gms.internal.measurement.k4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class u {
    public static final /* synthetic */ int C = 0;
    public CharSequence A;
    public final v.m B;

    /* renamed from: x, reason: collision with root package name */
    public final String f8194x;

    /* renamed from: y, reason: collision with root package name */
    public final o4.j f8195y;

    /* renamed from: z, reason: collision with root package name */
    public v f8196z;

    static {
        new LinkedHashMap();
    }

    public u(j0 j0Var) {
        LinkedHashMap linkedHashMap = k0.f8156b;
        this.f8194x = jb.b.q(j0Var.getClass());
        this.f8195y = new o4.j(this);
        this.B = new v.m(0);
    }

    public final Bundle a(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f8195y.f9929f;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle b10 = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            g gVar = (g) entry.getValue();
            gVar.getClass();
            kotlin.jvm.internal.k.e(name, "name");
            if (gVar.f8122c && (obj = gVar.f8123d) != null) {
                gVar.f8120a.e(b10, name, obj);
            }
        }
        if (bundle != null) {
            b10.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                g gVar2 = (g) entry2.getValue();
                gVar2.getClass();
                g0 g0Var = gVar2.f8120a;
                kotlin.jvm.internal.k.e(name2, "name");
                if (gVar2.f8121b || !b10.containsKey(name2) || !a8.i.p(name2, b10)) {
                    try {
                        g0Var.a(name2, b10);
                    } catch (IllegalStateException unused) {
                    }
                }
                StringBuilder q9 = r4.a.q("Wrong argument type for '", name2, "' in argument savedState. ");
                q9.append(g0Var.b());
                q9.append(" expected.");
                throw new IllegalArgumentException(q9.toString().toString());
            }
        }
        return b10;
    }

    public final int[] b(u uVar) {
        v vVar;
        ie.h hVar = new ie.h();
        u uVar2 = this;
        while (true) {
            o4.j jVar = uVar2.f8195y;
            v vVar2 = uVar2.f8196z;
            if (uVar != null) {
                vVar = uVar.f8196z;
            } else {
                vVar = null;
            }
            if (vVar != null) {
                v vVar3 = uVar.f8196z;
                kotlin.jvm.internal.k.b(vVar3);
                if (vVar3.h(jVar.f9924a) == uVar2) {
                    hVar.addFirst(uVar2);
                    break;
                }
            }
            if (vVar2 == null || vVar2.D.f12259a != jVar.f9924a) {
                hVar.addFirst(uVar2);
            }
            if (kotlin.jvm.internal.k.a(vVar2, uVar) || vVar2 == null) {
                break;
            }
            uVar2 = vVar2;
        }
        List Z = ie.j.Z(hVar);
        ArrayList arrayList = new ArrayList(ie.l.x(Z, 10));
        Iterator it = Z.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((u) it.next()).f8195y.f9924a));
        }
        return ie.j.Y(arrayList);
    }

    public final f c(int i6) {
        f fVar;
        v.m mVar = this.B;
        if (mVar.f() == 0) {
            fVar = null;
        } else {
            fVar = (f) mVar.c(i6);
        }
        if (fVar == null) {
            v vVar = this.f8196z;
            if (vVar == null) {
                return null;
            }
            return vVar.c(i6);
        }
        return fVar;
    }

    public final Map d() {
        return ie.w.D((LinkedHashMap) this.f8195y.f9929f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x039f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0321  */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v30, types: [he.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l4.t e(androidx.lifecycle.j1 r30) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.u.e(androidx.lifecycle.j1):l4.t");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1
            if (r10 != r11) goto L5
            goto Ld3
        L5:
            r1 = 0
            if (r11 == 0) goto Ld4
            boolean r2 = r11 instanceof l4.u
            if (r2 != 0) goto Le
            goto Ld4
        Le:
            o4.j r2 = r10.f8195y
            java.lang.Object r3 = r2.f9928e
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            l4.u r11 = (l4.u) r11
            v.m r4 = r11.B
            o4.j r5 = r11.f8195y
            java.lang.Object r6 = r5.f9928e
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r3 = kotlin.jvm.internal.k.a(r3, r6)
            v.m r6 = r10.B
            int r7 = r6.f()
            int r8 = r4.f()
            if (r7 != r8) goto L5e
            v.n r7 = new v.n
            r7.<init>(r6)
            cf.j r7 = cf.l.K(r7)
            cf.a r7 = (cf.a) r7
            java.util.Iterator r7 = r7.iterator()
        L3d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r6.c(r8)
            java.lang.Object r8 = r4.c(r8)
            boolean r8 = kotlin.jvm.internal.k.a(r9, r8)
            if (r8 != 0) goto L3d
            goto L5e
        L5c:
            r4 = 1
            goto L5f
        L5e:
            r4 = 0
        L5f:
            java.util.Map r6 = r10.d()
            int r6 = r6.size()
            java.util.Map r7 = r11.d()
            int r7 = r7.size()
            if (r6 != r7) goto Lb8
            java.util.Map r6 = r10.d()
            java.util.Set r6 = r6.entrySet()
            cf.o r6 = ie.j.C(r6)
            java.lang.Object r6 = r6.f2073b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L85:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb6
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.util.Map r8 = r11.d()
            java.lang.Object r9 = r7.getKey()
            boolean r8 = r8.containsKey(r9)
            if (r8 == 0) goto Lb8
            java.util.Map r8 = r11.d()
            java.lang.Object r9 = r7.getKey()
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r7 = r7.getValue()
            boolean r7 = kotlin.jvm.internal.k.a(r8, r7)
            if (r7 == 0) goto Lb8
            goto L85
        Lb6:
            r11 = 1
            goto Lb9
        Lb8:
            r11 = 0
        Lb9:
            int r6 = r2.f9924a
            int r7 = r5.f9924a
            if (r6 != r7) goto Ld4
            java.lang.Object r2 = r2.f9927d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r5.f9927d
            java.lang.String r5 = (java.lang.String) r5
            boolean r2 = kotlin.jvm.internal.k.a(r2, r5)
            if (r2 == 0) goto Ld4
            if (r3 == 0) goto Ld4
            if (r4 == 0) goto Ld4
            if (r11 == 0) goto Ld4
        Ld3:
            return r0
        Ld4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.u.equals(java.lang.Object):boolean");
    }

    public void f(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, m4.a.f8603e);
        kotlin.jvm.internal.k.d(obtainAttributes, "obtainAttributes(...)");
        String string = obtainAttributes.getString(2);
        o4.j jVar = this.f8195y;
        if (string == null) {
            jVar.f9924a = 0;
            jVar.f9926c = null;
        } else {
            jVar.getClass();
            if (!df.m.S(string)) {
                String uriPattern = "android-app://androidx.navigation/".concat(string);
                kotlin.jvm.internal.k.e(uriPattern, "uriPattern");
                ArrayList k8 = c9.a.k((LinkedHashMap) jVar.f9929f, new o4.i(new r(uriPattern, null, null), 1));
                if (k8.isEmpty()) {
                    he.a.d(new androidx.lifecycle.i(uriPattern, 19));
                    jVar.f9924a = uriPattern.hashCode();
                    jVar.f9926c = null;
                } else {
                    StringBuilder q9 = r4.a.q("Cannot set route \"", string, "\" for destination ");
                    q9.append((u) jVar.f9925b);
                    q9.append(". Following required arguments are missing: ");
                    q9.append(k8);
                    throw new IllegalArgumentException(q9.toString().toString());
                }
            } else {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
        }
        jVar.f9927d = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            jVar.f9924a = resourceId;
            jVar.f9926c = null;
            jVar.f9926c = k4.j(new e1.m(context, 1), resourceId);
        }
        this.A = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public int hashCode() {
        int i6;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        o4.j jVar = this.f8195y;
        int i15 = jVar.f9924a * 31;
        String str = (String) jVar.f9927d;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = i15 + i6;
        ArrayList arrayList = (ArrayList) jVar.f9928e;
        int size = arrayList.size();
        int i17 = 0;
        while (i17 < size) {
            Object obj = arrayList.get(i17);
            i17++;
            r rVar = (r) obj;
            int i18 = i16 * 31;
            String str2 = rVar.f8174a;
            if (str2 != null) {
                i12 = str2.hashCode();
            } else {
                i12 = 0;
            }
            int i19 = (i18 + i12) * 31;
            String str3 = rVar.f8175b;
            if (str3 != null) {
                i13 = str3.hashCode();
            } else {
                i13 = 0;
            }
            int i20 = (i19 + i13) * 31;
            String str4 = rVar.f8176c;
            if (str4 != null) {
                i14 = str4.hashCode();
            } else {
                i14 = 0;
            }
            i16 = i20 + i14;
        }
        v.m mVar = this.B;
        kotlin.jvm.internal.k.e(mVar, "<this>");
        int i21 = 0;
        while (true) {
            if (i21 < mVar.f()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            int i22 = i21 + 1;
            f fVar = (f) mVar.g(i21);
            int i23 = ((i16 * 31) + fVar.f8116a) * 31;
            z zVar = fVar.f8117b;
            if (zVar != null) {
                i11 = zVar.hashCode();
            } else {
                i11 = 0;
            }
            i16 = i23 + i11;
            Bundle bundle = fVar.f8118c;
            if (bundle != null) {
                i16 = bf.y.g(bundle) + (i16 * 31);
            }
            i21 = i22;
        }
        for (String str5 : d().keySet()) {
            int g10 = h8.c.g(str5, i16 * 31, 31);
            Object obj2 = d().get(str5);
            if (obj2 != null) {
                i10 = obj2.hashCode();
            } else {
                i10 = 0;
            }
            i16 = g10 + i10;
        }
        return i16;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        o4.j jVar = this.f8195y;
        String str = (String) jVar.f9926c;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(jVar.f9924a));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = (String) jVar.f9927d;
        if (str2 != null && !df.m.S(str2)) {
            sb2.append(" route=");
            sb2.append((String) jVar.f9927d);
        }
        if (this.A != null) {
            sb2.append(" label=");
            sb2.append(this.A);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.k.d(sb3, "toString(...)");
        return sb3;
    }
}
