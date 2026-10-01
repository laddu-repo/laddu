package va;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {
    public static final boolean a(int i, int i10, int i11, byte[] bArr, byte[] bArr2) {
        de.i.e(bArr, "a");
        de.i.e(bArr2, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12 + i] != bArr2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            sb2.append(String.format("%02x", Byte.valueOf(b9)));
        }
        return sb2.toString();
    }

    public static final void c(long j8, long j9, long j10) {
        if ((j9 | j10) < 0 || j9 > j8 || j8 - j9 < j10) {
            throw new ArrayIndexOutOfBoundsException("size=" + j8 + " offset=" + j9 + " byteCount=" + j10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] d(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static final File e(Context context, String str) {
        de.i.e(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static Object f(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return p0.a.a(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (e.a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static sd.c h(sd.c cVar) {
        de.i.e(cVar, "<this>");
        ud.c cVar2 = cVar instanceof ud.c ? (ud.c) cVar : null;
        if (cVar2 == null || (cVar = cVar2.f12978x) != null) {
            return cVar;
        }
        sd.e eVar = (sd.e) cVar2.f().A(sd.d.f11796v);
        sd.c fVar = eVar != null ? new re.f((me.s) eVar, cVar2) : cVar2;
        cVar2.f12978x = fVar;
        return fVar;
    }

    public static final boolean i(Context context) {
        NetworkCapabilities networkCapabilities;
        de.i.e(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        de.i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    public static void j(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static Executor l(final Executor executor, final da.j0 j0Var) {
        executor.getClass();
        return executor == da.f0.f4407v ? executor : new Executor() { // from class: da.w0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e7) {
                    j0Var.n(e7);
                }
            }
        };
    }

    public static Uri m(Uri uri) {
        if (uri.getQueryParameter("CMCD") == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("CMCD")) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static int r(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final String s(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = wf.b.f14030a;
        int i10 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i10 < 8 && cArr2[i10] == '0') {
            i10++;
        }
        if (i10 >= 0) {
            if (i10 <= 8) {
                return new String(cArr2, i10, 8 - i10);
            }
            throw new IllegalArgumentException(j4.a.k(i10, 8, "startIndex: ", " > endIndex: "));
        }
        StringBuilder sbO = j4.a.o(i10, 8, "startIndex: ", ", endIndex: ", ", size: ");
        sbO.append(8);
        throw new IndexOutOfBoundsException(sbO.toString());
    }

    public static int t(int i) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i) {
                return i11;
            }
        }
        return 1;
    }

    public static void u(int i, Object[] objArr) {
        for (int i10 = 0; i10 < i; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(u5.a.b(i10, "at index ", new StringBuilder(String.valueOf(i10).length() + 9)));
            }
        }
    }

    public abstract void g(int i);

    public abstract long k();

    public abstract void o(boolean z2);

    public abstract void p();

    public abstract void q(int i);

    public void n(boolean z2) {
    }
}
