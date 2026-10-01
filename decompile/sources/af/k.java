package af;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ye.d[] f514a = new ye.d[0];

    public static final void a(int i, int i10, ye.d dVar) {
        de.i.e(dVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i11 = (~i) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                arrayList.add(dVar.e(i12));
            }
            i11 >>>= 1;
        }
        String strB = dVar.b();
        de.i.e(strB, "serialName");
        throw new we.b(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strB + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strB + "', but they were missing", null);
    }
}
