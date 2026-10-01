package k8;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements Runnable {
    public final Object A;
    public final Object B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7751v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f7752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f7753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f7754y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f7755z;

    public /* synthetic */ s0(String str, x0 x0Var, int i, IOException iOException, byte[] bArr, Map map) {
        t7.y.g(x0Var);
        this.f7754y = x0Var;
        this.f7752w = i;
        this.f7755z = iOException;
        this.A = bArr;
        this.f7753x = str;
        this.B = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7751v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                v0 v0Var = (v0) this.B;
                d1 d1Var = ((p1) v0Var.f2053w).f7696z;
                p1.j(d1Var);
                if (!d1Var.f7851x) {
                    Log.println(6, v0Var.N(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (v0Var.f7796y == 0) {
                    g gVar = ((p1) v0Var.f2053w).f7695y;
                    if (gVar.A == null) {
                        synchronized (gVar) {
                            try {
                                if (gVar.A == null) {
                                    p1 p1Var = (p1) gVar.f2053w;
                                    ApplicationInfo applicationInfo = p1Var.f7692v.getApplicationInfo();
                                    String strB = x7.b.b();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        gVar.A = Boolean.valueOf(str != null && str.equals(strB));
                                    }
                                    if (gVar.A == null) {
                                        gVar.A = Boolean.TRUE;
                                        v0 v0Var2 = p1Var.A;
                                        p1.l(v0Var2);
                                        v0Var2.B.a("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (gVar.A.booleanValue()) {
                        v0Var.f7796y = 'C';
                    } else {
                        v0Var.f7796y = 'c';
                    }
                    break;
                }
                if (v0Var.f7797z < 0) {
                    ((p1) v0Var.f2053w).f7695y.J();
                    v0Var.f7797z = 161000L;
                }
                int i = this.f7752w;
                char c10 = v0Var.f7796y;
                long j8 = v0Var.f7797z;
                String str2 = this.f7753x;
                Object obj = this.f7754y;
                Object obj2 = this.f7755z;
                Object obj3 = this.A;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strO = v0.O(true, str2, obj, obj2, obj3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c10).length() + String.valueOf(j8).length() + 1 + strO.length());
                sb2.append("2");
                sb2.append(cCharAt);
                sb2.append(c10);
                sb2.append(j8);
                sb2.append(":");
                sb2.append(strO);
                String string = sb2.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                e6.c cVar = d1Var.A;
                if (cVar != null) {
                    String str3 = (String) cVar.f4849y;
                    d1 d1Var2 = (d1) cVar.f4850z;
                    d1Var2.D();
                    if (((d1) cVar.f4850z).H().getLong((String) cVar.f4847w, 0L) == 0) {
                        cVar.d();
                    }
                    if (string == null) {
                        string = "";
                    }
                    SharedPreferences sharedPreferencesH = d1Var2.H();
                    String str4 = (String) cVar.f4848x;
                    long j9 = sharedPreferencesH.getLong(str4, 0L);
                    if (j9 <= 0) {
                        SharedPreferences.Editor editorEdit = d1Var2.H().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    t4 t4Var = ((p1) d1Var2.f2053w).D;
                    p1.j(t4Var);
                    long jNextLong = t4Var.D0().nextLong() & Long.MAX_VALUE;
                    long j10 = j9 + 1;
                    long j11 = Long.MAX_VALUE / j10;
                    SharedPreferences.Editor editorEdit2 = d1Var2.H().edit();
                    if (jNextLong < j11) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j10);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((x0) this.f7754y).b(this.f7753x, this.f7752w, (Throwable) this.f7755z, (byte[]) this.A, (Map) this.B);
                return;
        }
    }

    public s0(v0 v0Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f7752w = i;
        this.f7753x = str;
        this.f7754y = obj;
        this.f7755z = obj2;
        this.A = obj3;
        this.B = v0Var;
    }
}
