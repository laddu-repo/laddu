package g7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f5505c = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    public final List f5506a;

    /* renamed from: b, reason: collision with root package name */
    public f f5507b;

    public e(String... strArr) {
        this.f5506a = Arrays.asList(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.f5506a
            int r1 = r0.size()
            r2 = 0
            if (r8 < r1) goto Lb
            goto L91
        Lb:
            int r1 = r0.size()
            r3 = 1
            int r1 = r1 - r3
            if (r8 != r1) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            java.lang.Object r4 = r0.get(r8)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "**"
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L54
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L35
            java.lang.String r9 = "*"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L33
            goto L35
        L33:
            r9 = 0
            goto L36
        L35:
            r9 = 1
        L36:
            if (r1 != 0) goto L51
            int r1 = r0.size()
            int r1 = r1 + (-2)
            if (r8 != r1) goto L91
            int r8 = r0.size()
            int r8 = r8 - r3
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L91
        L51:
            if (r9 == 0) goto L91
            goto L88
        L54:
            if (r1 != 0) goto L86
            int r4 = r8 + 1
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L86
            int r9 = r0.size()
            int r9 = r9 + (-2)
            if (r8 == r9) goto L88
            int r9 = r0.size()
            int r9 = r9 + (-3)
            if (r8 != r9) goto L91
            int r8 = r0.size()
            int r8 = r8 - r3
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L91
            goto L88
        L86:
            if (r1 == 0) goto L89
        L88:
            return r3
        L89:
            int r8 = r8 + r3
            int r1 = r0.size()
            int r1 = r1 - r3
            if (r8 >= r1) goto L92
        L91:
            return r2
        L92:
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.e.a(int, java.lang.String):boolean");
    }

    public final int b(int i6, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f5506a;
        if (!((String) list.get(i6)).equals("**")) {
            return 1;
        }
        if (i6 == list.size() - 1 || !((String) list.get(i6 + 1)).equals(str)) {
            return 0;
        }
        return 2;
    }

    public final boolean c(int i6, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f5506a;
        if (i6 >= list.size()) {
            return false;
        }
        if (((String) list.get(i6)).equals(str) || ((String) list.get(i6)).equals("**") || ((String) list.get(i6)).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean d(int i6, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f5506a;
        if (i6 < list.size() - 1 || ((String) list.get(i6)).equals("**")) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f5506a.equals(eVar.f5506a)) {
                return false;
            }
            f fVar = this.f5507b;
            f fVar2 = eVar.f5507b;
            if (fVar != null) {
                return fVar.equals(fVar2);
            }
            if (fVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f5506a.hashCode() * 31;
        f fVar = this.f5507b;
        if (fVar != null) {
            i6 = fVar.hashCode();
        } else {
            i6 = 0;
        }
        return hashCode + i6;
    }

    public final String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.f5506a);
        sb2.append(",resolved=");
        if (this.f5507b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append('}');
        return sb2.toString();
    }

    public e(e eVar) {
        this.f5506a = new ArrayList(eVar.f5506a);
        this.f5507b = eVar.f5507b;
    }
}
