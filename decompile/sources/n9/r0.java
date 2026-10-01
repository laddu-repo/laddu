package n9;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.io.IOException;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r0 implements Runnable {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9448x = 1;

    /* renamed from: y, reason: collision with root package name */
    public final int f9449y;

    /* renamed from: z, reason: collision with root package name */
    public final String f9450z;

    public /* synthetic */ r0(String str, w0 w0Var, int i6, IOException iOException, byte[] bArr, Map map) {
        w8.x.g(w0Var);
        this.A = w0Var;
        this.f9449y = i6;
        this.B = iOException;
        this.C = bArr;
        this.f9450z = str;
        this.D = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.f9448x) {
            case 0:
                u0 u0Var = (u0) this.D;
                c1 c1Var = ((n1) u0Var.f4301y).B;
                n1.e(c1Var);
                if (c1Var.f9493z) {
                    if (u0Var.A == 0) {
                        g gVar = ((n1) u0Var.f4301y).A;
                        if (gVar.C == null) {
                            synchronized (gVar) {
                                try {
                                    if (gVar.C == null) {
                                        n1 n1Var = (n1) gVar.f4301y;
                                        ApplicationInfo applicationInfo = n1Var.f9413x.getApplicationInfo();
                                        String b10 = a9.b.b();
                                        if (applicationInfo != null) {
                                            String str = applicationInfo.processName;
                                            if (str != null && str.equals(b10)) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            gVar.C = Boolean.valueOf(z10);
                                        }
                                        if (gVar.C == null) {
                                            gVar.C = Boolean.TRUE;
                                            u0 u0Var2 = n1Var.C;
                                            n1.g(u0Var2);
                                            u0Var2.D.a("My process not in the list of running processes");
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        if (gVar.C.booleanValue()) {
                            u0Var.A = 'C';
                        } else {
                            u0Var.A = 'c';
                        }
                    }
                    if (u0Var.B < 0) {
                        ((n1) u0Var.f4301y).A.i1();
                        u0Var.B = 130000L;
                    }
                    int i6 = this.f9449y;
                    char c10 = u0Var.A;
                    long j = u0Var.B;
                    String str2 = this.f9450z;
                    Object obj = this.A;
                    Object obj2 = this.B;
                    Object obj3 = this.C;
                    char charAt = "01VDIWEA?".charAt(i6);
                    String o12 = u0.o1(true, str2, obj, obj2, obj3);
                    int length = String.valueOf(charAt).length();
                    StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(c10).length() + String.valueOf(j).length() + 1 + o12.length());
                    sb2.append(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                    sb2.append(charAt);
                    sb2.append(c10);
                    sb2.append(j);
                    sb2.append(":");
                    sb2.append(o12);
                    String sb3 = sb2.toString();
                    if (sb3.length() > 1024) {
                        sb3 = str2.substring(0, 1024);
                    }
                    i4.m0 m0Var = c1Var.C;
                    if (m0Var != null) {
                        String str3 = (String) m0Var.f6461z;
                        c1 c1Var2 = (c1) m0Var.B;
                        c1Var2.d1();
                        if (((c1) m0Var.B).h1().getLong((String) m0Var.f6460y, 0L) == 0) {
                            m0Var.s();
                        }
                        if (sb3 == null) {
                            sb3 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        SharedPreferences h12 = c1Var2.h1();
                        String str4 = (String) m0Var.f6459x;
                        long j10 = h12.getLong(str4, 0L);
                        if (j10 <= 0) {
                            SharedPreferences.Editor edit = c1Var2.h1().edit();
                            edit.putString(str3, sb3);
                            edit.putLong(str4, 1L);
                            edit.apply();
                            return;
                        }
                        j4 j4Var = ((n1) c1Var2.f4301y).F;
                        n1.e(j4Var);
                        long nextLong = j4Var.b2().nextLong() & Long.MAX_VALUE;
                        long j11 = j10 + 1;
                        long j12 = Long.MAX_VALUE / j11;
                        SharedPreferences.Editor edit2 = c1Var2.h1().edit();
                        if (nextLong < j12) {
                            edit2.putString(str3, sb3);
                        }
                        edit2.putLong(str4, j11);
                        edit2.apply();
                        return;
                    }
                    return;
                }
                Log.println(6, u0Var.n1(), "Persisted config not initialized. Not logging error/warn");
                return;
            default:
                ((w0) this.A).j(this.f9450z, this.f9449y, (Throwable) this.B, (byte[]) this.C, (Map) this.D);
                return;
        }
    }

    public r0(u0 u0Var, int i6, String str, Object obj, Object obj2, Object obj3) {
        this.f9449y = i6;
        this.f9450z = str;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.D = u0Var;
    }
}
