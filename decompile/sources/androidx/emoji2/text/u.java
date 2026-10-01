package androidx.emoji2.text;

import com.google.android.gms.internal.measurement.eh;
import com.google.android.gms.internal.measurement.fi;
import com.google.android.gms.internal.measurement.wg;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f934e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f935g;

    public u(com.google.android.gms.internal.measurement.g gVar, Object[] objArr, StringBuilder sb2) {
        this.f930a = 2;
        this.f931b = 0;
        this.f932c = -1;
        eh.c(gVar, "context");
        this.f934e = gVar;
        this.f933d = 0;
        this.f = objArr;
        this.f935g = sb2;
    }

    public static void h(StringBuilder sb2, Object obj, String str) {
        sb2.append("[INVALID: format=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(obj.getClass().getCanonicalName());
        sb2.append(", value=");
        sb2.append(fi.a(obj));
        sb2.append("]");
    }

    public void a() {
        this.f931b = 1;
        this.f = (y) this.f934e;
        this.f933d = 0;
    }

    public boolean b() {
        j1.a aVarB = ((y) this.f).f947b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f6649y).get(iA + aVarB.f6646v) == 0) || this.f932c == 65039;
    }

    public void c() {
        if (this.f932c == 0) {
            return;
        }
        HashMap map = ((wg) this.f935g).f3209d;
        int[] iArr = (int[]) this.f934e;
        wg wgVar = (wg) map.get(Integer.valueOf(iArr[this.f931b]));
        while (true) {
            int i = (wgVar.f3207b - wgVar.f3206a) + 1;
            int i10 = this.f932c;
            if (i > i10) {
                return;
            }
            int i11 = this.f931b + i;
            this.f931b = i11;
            this.f935g = wgVar;
            int i12 = i10 - i;
            this.f932c = i12;
            if (i12 > 0) {
                wgVar = (wg) wgVar.f3209d.get(Integer.valueOf(iArr[i11]));
            }
        }
    }

    public void d() {
        wg wgVar = ((wg) this.f935g).f3208c;
        if (wgVar != null) {
            this.f935g = wgVar;
        } else {
            this.f935g = (wg) this.f;
            int i = this.f932c;
            if (i > 0) {
                this.f932c = i - 1;
            }
            if (this.f933d > 0) {
                this.f931b++;
            }
        }
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(java.lang.Object r9, com.google.android.gms.internal.measurement.ci r10, com.google.android.gms.internal.measurement.di r11) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.u.e(java.lang.Object, com.google.android.gms.internal.measurement.ci, com.google.android.gms.internal.measurement.di):void");
    }

    public void f(wg wgVar, StringBuilder sb2) {
        for (wg wgVar2 : wgVar.f3209d.values()) {
            sb2.append("  ");
            sb2.append(wgVar);
            sb2.append(" -> ");
            sb2.append(wgVar2);
            sb2.append(" [label=\"");
            int[] iArr = (int[]) this.f934e;
            sb2.append(Arrays.toString(Arrays.copyOfRange(iArr, wgVar2.f3206a, Math.min(iArr.length, wgVar2.f3207b + 1))));
            sb2.append("\"]\n");
            f(wgVar2, sb2);
        }
    }

    public boolean g(int i, int i10, int i11, int i12) {
        if (i >= 0 && i11 >= 0) {
            int[] iArr = (int[]) this.f934e;
            int length = iArr.length;
            int iMin = Math.min(length, i10);
            if (iMin - i == Math.min(length, i12) - i11) {
                for (int i13 = i; i13 <= iMin; i13++) {
                    if (iArr[i13] != iArr[(i11 + i13) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        switch (this.f930a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("digraph {\n");
                f((wg) this.f, sb2);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public u(int[] iArr) {
        this.f930a = 1;
        this.f934e = iArr;
        wg wgVar = new wg(-1, -1);
        this.f = wgVar;
        this.f935g = wgVar;
    }

    public u(y yVar) {
        this.f930a = 0;
        this.f931b = 1;
        this.f934e = yVar;
        this.f = yVar;
    }
}
