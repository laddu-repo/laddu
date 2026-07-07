package pd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends com.bumptech.glide.f {
    public static List W(Object[] objArr) {
        de.i.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        de.i.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static void X(int i, int i10, int i11, byte[] bArr, byte[] bArr2) {
        de.i.e(bArr, "<this>");
        de.i.e(bArr2, "destination");
        System.arraycopy(bArr, i10, bArr2, i, i11 - i10);
    }

    public static void Y(int i, int i10, int i11, int[] iArr, int[] iArr2) {
        de.i.e(iArr, "<this>");
        de.i.e(iArr2, "destination");
        System.arraycopy(iArr, i10, iArr2, i, i11 - i10);
    }

    public static void Z(int i, int i10, int i11, Object[] objArr, Object[] objArr2) {
        de.i.e(objArr, "<this>");
        de.i.e(objArr2, "destination");
        System.arraycopy(objArr, i10, objArr2, i, i11 - i10);
    }

    public static /* synthetic */ void a0(int i, int i10, int i11, Object[] objArr, Object[] objArr2) {
        if ((i11 & 4) != 0) {
            i = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        Z(0, i, i10, objArr, objArr2);
    }

    public static byte[] b0(byte[] bArr, int i, int i10) {
        de.i.e(bArr, "<this>");
        com.bumptech.glide.f.g(i10, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i10);
        de.i.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] c0(Object[] objArr, int i, int i10) {
        de.i.e(objArr, "<this>");
        com.bumptech.glide.f.g(i10, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i10);
        de.i.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void d0(Object[] objArr, int i, int i10) {
        de.i.e(objArr, "<this>");
        Arrays.fill(objArr, i, i10, (Object) null);
    }

    public static ArrayList e0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object f0(int i, Object[] objArr) {
        de.i.e(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static List g0(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new g(objArr, false)) : fa.b.s(objArr[0]) : p.f10551v;
    }
}
