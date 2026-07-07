package m2;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.e5;
import db.h1;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements Closeable {
    public final SocketFactory A;
    public final ArrayDeque B = new ArrayDeque();
    public final SparseArray C = new SparseArray();
    public final b2.k D = new b2.k(this);
    public Uri E;
    public z F;
    public e2.u G;
    public String H;
    public long I;
    public m J;
    public s8.n K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public long P;

    /* renamed from: x, reason: collision with root package name */
    public final k7.d f8524x;

    /* renamed from: y, reason: collision with root package name */
    public final k7.d f8525y;

    /* renamed from: z, reason: collision with root package name */
    public final String f8526z;

    public n(k7.d dVar, k7.d dVar2, String str, Uri uri, SocketFactory socketFactory) {
        Uri build;
        this.f8524x = dVar;
        this.f8525y = dVar2;
        this.f8526z = str;
        this.A = socketFactory;
        Pattern pattern = a0.f8422a;
        if (uri.getUserInfo() == null) {
            build = uri;
        } else {
            String encodedAuthority = uri.getEncodedAuthority();
            encodedAuthority.getClass();
            u1.c.b(encodedAuthority.contains("@"));
            String str2 = u1.a0.f12750a;
            build = uri.buildUpon().encodedAuthority(encodedAuthority.split("@", -1)[1]).build();
        }
        this.E = build;
        this.F = new z(new j1.f0(this));
        this.I = 60000L;
        this.G = a0.d(uri);
        this.P = -9223372036854775807L;
        this.L = -1;
    }

    public static void d(n nVar, e5 e5Var) {
        if (nVar.M) {
            nVar.f8525y.S(e5Var);
            return;
        }
        k7.d dVar = nVar.f8524x;
        String message = e5Var.getMessage();
        if (message == null) {
            message = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        dVar.U(message, e5Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m mVar = this.J;
        if (mVar != null) {
            mVar.close();
            this.J = null;
            Uri uri = this.E;
            String str = this.H;
            str.getClass();
            b2.k kVar = this.D;
            n nVar = (n) kVar.A;
            int i6 = nVar.L;
            if (i6 != -1 && i6 != 0) {
                nVar.L = 0;
                kVar.A(kVar.l(12, str, h1.D, uri));
            }
        }
        this.F.close();
    }

    public final void f() {
        long j;
        q qVar = (q) this.B.pollFirst();
        if (qVar == null) {
            s sVar = (s) this.f8525y.f7747y;
            long j10 = sVar.K;
            if (j10 != -9223372036854775807L) {
                j = u1.a0.e0(j10);
            } else {
                long j11 = sVar.L;
                if (j11 != -9223372036854775807L) {
                    j = u1.a0.e0(j11);
                } else {
                    j = 0;
                }
            }
            sVar.A.y(j);
            return;
        }
        Uri uri = qVar.f8531b.f8466y.f8545b;
        u1.c.h(qVar.f8532c);
        String str = qVar.f8532c;
        String str2 = this.H;
        b2.k kVar = this.D;
        ((n) kVar.A).L = 0;
        db.r.d("Transport", str);
        kVar.A(kVar.l(10, str2, h1.g(1, new Object[]{"Transport", str}, null), uri));
    }

    public final Socket l(Uri uri) {
        boolean z10;
        int i6;
        if (uri.getHost() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        if (uri.getPort() > 0) {
            i6 = uri.getPort();
        } else {
            i6 = 554;
        }
        String host = uri.getHost();
        host.getClass();
        return this.A.createSocket(host, i6);
    }

    public final void m(long j) {
        boolean z10;
        if (this.L == 2 && !this.O) {
            Uri uri = this.E;
            String str = this.H;
            str.getClass();
            b2.k kVar = this.D;
            n nVar = (n) kVar.A;
            if (nVar.L == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.g(z10);
            kVar.A(kVar.l(5, str, h1.D, uri));
            nVar.O = true;
        }
        this.P = j;
    }

    public final void y(long j) {
        boolean z10;
        Uri uri = this.E;
        String str = this.H;
        str.getClass();
        b2.k kVar = this.D;
        int i6 = ((n) kVar.A).L;
        if (i6 != 1 && i6 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.g(z10);
        c0 c0Var = c0.f8447c;
        Object[] objArr = {Double.valueOf(j / 1000.0d)};
        String str2 = u1.a0.f12750a;
        kVar.A(kVar.l(6, str, h1.g(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }
}
