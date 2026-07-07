package p4;

import ac.g1;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.SQLException;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import com.livxow.tv.activities.PlayerActivity;
import com.livxow.tv.app.App;
import d1.y0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import t0.r0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class v implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static g1 f10363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f10364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f10365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class f10366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f10367e;
    public static Field f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f10368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Field f10369h;
    public static boolean i;

    public static final zc.b A(String str) {
        zc.b bVar = zc.b.f14879x;
        return (str == null || str.length() == 0) ? bVar : (str.equalsIgnoreCase("request_with_file_path_already_exist") || ke.h.E(str, "UNIQUE constraint failed: requests._file (code 2067)", true)) ? zc.b.L : ke.h.E(str, "UNIQUE constraint failed: requests._id", false) ? zc.b.K : ke.h.E(str, "empty_response_body", true) ? zc.b.G : (str.equalsIgnoreCase("FNC") || str.equalsIgnoreCase("open failed: ENOENT (No such file or directory)")) ? zc.b.f14881z : (ke.h.E(str, "recvfrom failed: ETIMEDOUT (Connection timed out)", true) || ke.h.E(str, "timeout", true) || ke.h.E(str, "Software caused connection abort", true) || ke.h.E(str, "Read timed out at", true)) ? zc.b.A : (str.equalsIgnoreCase("java.io.IOException: 404") || ke.h.E(str, "No address associated with hostname", false)) ? zc.b.C : ke.h.E(str, "Unable to resolve host", false) ? zc.b.B : str.equalsIgnoreCase("open failed: EACCES (Permission denied)") ? zc.b.D : (str.equalsIgnoreCase("write failed: ENOSPC (No space left on device)") || str.equalsIgnoreCase("database or disk is full (code 13)")) ? zc.b.E : str.equalsIgnoreCase("UNIQUE constraint failed: requests._id (code 1555)") ? zc.b.H : str.equalsIgnoreCase("fetch download not found") ? zc.b.I : str.equalsIgnoreCase("Fetch data base error") ? zc.b.J : (ke.h.E(str, "request_not_successful", true) || ke.h.E(str, "Failed to connect", true)) ? zc.b.M : ke.h.E(str, "invalid content hash", true) ? zc.b.Q : ke.h.E(str, "download_incomplete", true) ? zc.b.N : ke.h.E(str, "failed_to_update_request", true) ? zc.b.R : ke.h.E(str, "failed_to_add_completed_download", true) ? zc.b.S : ke.h.E(str, "fetch_file_server_invalid_response_type", true) ? zc.b.T : ke.h.E(str, "request_does_not_exist", true) ? zc.b.U : ke.h.E(str, "no_network_connection", true) ? zc.b.F : ke.h.E(str, "file_not_found", true) ? zc.b.O : ke.h.E(str, "fetch_file_server_url_invalid", true) ? zc.b.P : ke.h.E(str, "request_list_not_distinct", true) ? zc.b.X : ke.h.E(str, "enqueue_not_successful", true) ? zc.b.V : ke.h.E(str, "cannot rename file associated with incomplete download", true) ? zc.b.Y : ke.h.E(str, "file_cannot_be_renamed", true) ? zc.b.Z : ke.h.E(str, "file_allocation_error", true) ? zc.b.f14875a0 : ke.h.E(str, "Cleartext HTTP traffic to", true) ? zc.b.f14876b0 : bVar;
    }

    public static final zc.b B(Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        boolean z2 = exc instanceof SocketTimeoutException;
        if (z2 && message.length() == 0) {
            message = "timeout";
        }
        zc.b bVarA = A(message);
        zc.b bVar = zc.b.f14879x;
        return (bVarA == bVar && z2) ? zc.b.A : (bVarA == bVar && (exc instanceof IOException)) ? zc.b.N : bVarA;
    }

    public static final void D() {
        try {
            if (f10363a == null) {
                g1 g1Var = (g1) ((ac.i) ((ac.v) fa.g.c().b(ac.v.class))).f401o.get();
                de.i.e(g1Var, "<set-?>");
                f10363a = g1Var;
            }
            g1 g1Var2 = f10363a;
            if (g1Var2 == null) {
                de.i.i("sharedSessionRepository");
                throw null;
            }
            if (g1Var2.i) {
                if (g1Var2 != null) {
                    g1Var2.b();
                } else {
                    de.i.i("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static p5.a G(u5.c cVar, j5.j jVar) {
        return new p5.a(0, t5.p.a(cVar, jVar, 1.0f, t5.f.f12262w, false));
    }

    public static p5.b H(u5.b bVar, j5.j jVar, boolean z2) {
        return new p5.b(4, t5.p.a(bVar, jVar, z2 ? v5.i.c() : 1.0f, t5.f.f12263x, false));
    }

    public static p5.a I(u5.c cVar, j5.j jVar, int i10) {
        ab.c cVar2 = new ab.c();
        cVar2.f290v = i10;
        ArrayList arrayListA = t5.p.a(cVar, jVar, 1.0f, cVar2, false);
        for (int i11 = 0; i11 < arrayListA.size(); i11++) {
            w5.a aVar = (w5.a) arrayListA.get(i11);
            q5.c cVar3 = (q5.c) aVar.f13898b;
            q5.c cVar4 = (q5.c) aVar.f13899c;
            if (cVar3 != null && cVar4 != null) {
                float[] fArr = cVar3.f10812a;
                int length = fArr.length;
                float[] fArr2 = cVar4.f10812a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f4 = Float.NaN;
                    int i12 = 0;
                    for (int i13 = 0; i13 < length2; i13++) {
                        float f10 = fArr3[i13];
                        if (f10 != f4) {
                            fArr3[i12] = f10;
                            i12++;
                            f4 = fArr3[i13];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i12);
                    aVar = new w5.a(cVar3.b(fArrCopyOfRange), cVar4.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i11, aVar);
        }
        return new p5.a(1, arrayListA);
    }

    public static p5.a J(u5.b bVar, j5.j jVar) {
        return new p5.a(2, t5.p.a(bVar, jVar, 1.0f, t5.f.f12264y, false));
    }

    public static p5.a K(u5.c cVar, j5.j jVar) {
        return new p5.a(3, t5.p.a(cVar, jVar, v5.i.c(), t5.f.A, true));
    }

    public static void M(Outline outline, Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            d9.b.a(outline, path);
            return;
        }
        if (i10 >= 29) {
            try {
                d9.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            d9.a.a(outline, path);
        }
    }

    public static void N(Drawable drawable, int i10) {
        drawable.setTint(i10);
    }

    public static boolean O(PlayerActivity playerActivity) {
        String str = App.P.K;
        if (str == null) {
            return false;
        }
        String str2 = rc.a.b("UWLbaW91OMkmgdTbkB8bL29hkBnhkWHbg3IlOBPwjJG0fBIhOMIhfW5skBPugJFrOF==") + str + " )";
        h.f fVar = new h.f(playerActivity);
        fVar.setTitle(str2);
        String strB = rc.a.b("VImZIF==");
        mc.u uVar = new mc.u(1, playerActivity);
        h.b bVar = fVar.f5918a;
        bVar.f5841g = strB;
        bVar.f5842h = uVar;
        bVar.f5844k = false;
        h.g gVarCreate = fVar.create();
        gVarCreate.show();
        gVarCreate.getWindow().setBackgroundDrawable(new ColorDrawable(-7829368));
        return true;
    }

    public static final void P(int i10, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i10);
        if (str != null) {
            sb2.append(", message: ".concat(str));
        }
        throw new SQLException(sb2.toString());
    }

    public static oe.c d(int i10, oe.a aVar, int i11) {
        int i12 = i11 & 2;
        oe.a aVar2 = oe.a.f10127v;
        if (i12 != 0) {
            aVar = aVar2;
        }
        if (i10 == -2) {
            if (aVar != aVar2) {
                return new oe.m(1, aVar);
            }
            oe.g.f10158p.getClass();
            return new oe.c(oe.f.f10157b);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? aVar == aVar2 ? new oe.c(i10) : new oe.m(i10, aVar) : new oe.c(Integer.MAX_VALUE) : aVar == aVar2 ? new oe.c(0) : new oe.m(1, aVar);
        }
        if (aVar == aVar2) {
            return new oe.m(1, oe.a.f10128w);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static x.k e(me.a0 a0Var) {
        x.i iVar = new x.i();
        iVar.f14063c = new x.l();
        x.k kVar = new x.k(iVar);
        iVar.f14062b = kVar;
        iVar.f14061a = j4.a.class;
        try {
            a0Var.K(true, new me.j(2, new y0(2, iVar, a0Var)));
            iVar.f14061a = "Deferred.asListenableFuture";
            return kVar;
        } catch (Exception e7) {
            kVar.f14066w.k(e7);
            return kVar;
        }
    }

    public static String f(int i10, int i11, String str) {
        if (i10 < 0) {
            return qf.g.y("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return qf.g.y("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(d0.d.h(i11, "negative size: "));
    }

    public static boolean g(l0.e[] eVarArr, l0.e[] eVarArr2) {
        if (eVarArr == null || eVarArr2 == null || eVarArr.length != eVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            l0.e eVar = eVarArr[i10];
            char c10 = eVar.f8000a;
            l0.e eVar2 = eVarArr2[i10];
            if (c10 != eVar2.f8000a || eVar.f8001b.length != eVar2.f8001b.length) {
                return false;
            }
        }
        return true;
    }

    public static void h(long j8, String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(qf.g.y(str, Long.valueOf(j8)));
        }
    }

    public static void i(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void j(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void k(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(qf.g.y(str, obj));
        }
    }

    public static void l(int i10, int i11) {
        String strY;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strY = qf.g.y("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(d0.d.h(i11, "negative size: "));
                }
                strY = qf.g.y("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strY);
        }
    }

    public static void m(ListenableFuture listenableFuture, String str, Object obj) {
        if (listenableFuture == null) {
            throw new NullPointerException(qf.g.y(str, obj));
        }
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void o(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(f(i10, i11, "index"));
        }
    }

    public static void p(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? f(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? f(i11, i12, "end index") : qf.g.y("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static void q(String str, boolean z2) {
        if (!z2) {
            throw new IllegalStateException(str);
        }
    }

    public static void r(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static float[] s(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i10, length);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static l0.e[] u(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.v.u(java.lang.String):l0.e[]");
    }

    public static Path v(String str) {
        Path path = new Path();
        try {
            l0.e.b(u(str), path);
            return path;
        } catch (RuntimeException e7) {
            throw new RuntimeException("Error in parsing ".concat(str), e7);
        }
    }

    public static l0.e[] w(l0.e[] eVarArr) {
        l0.e[] eVarArr2 = new l0.e[eVarArr.length];
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10] = new l0.e(eVarArr[i10]);
        }
        return eVarArr2;
    }

    public static final void x(v4.a aVar, String str) {
        de.i.e(aVar, "<this>");
        de.i.e(str, "sql");
        v4.c cVarJ0 = aVar.j0(str);
        try {
            cVarJ0.Z();
            b8.h.h(cVarJ0, null);
        } finally {
        }
    }

    public static void y(Object obj) {
        LongSparseArray longSparseArray;
        if (!f10367e) {
            try {
                f10366d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e7) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
            }
            f10367e = true;
        }
        Class cls = f10366d;
        if (cls == null) {
            return;
        }
        if (!f10368g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
            }
            f10368g = true;
        }
        Field field = f;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e11);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static ColorStateList z(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !androidx.lifecycle.e0.u(drawable)) {
            return null;
        }
        return androidx.lifecycle.e0.c(drawable).getColorStateList();
    }

    public a9.g C(h.j jVar, Object obj) {
        return null;
    }

    public abstract void E(Throwable th);

    public abstract void F(sb.p pVar);

    public abstract Object L(Intent intent, int i10);

    public abstract Intent t(h.j jVar, Object obj);

    @Override // t0.r0
    public void b() {
    }

    @Override // t0.r0
    public void c() {
    }
}
