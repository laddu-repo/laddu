package r7;

import bg.e0;
import bg.f0;
import bg.j;
import bg.l0;
import bg.n;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import df.m;
import df.u;
import he.y;
import ie.r;
import ie.t;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.k;
import okhttp3.CipherSuite;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.OkHttpUtils;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: k, reason: collision with root package name */
    public static final String f11847k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f11848l;

    /* renamed from: a, reason: collision with root package name */
    public final String f11849a;

    /* renamed from: b, reason: collision with root package name */
    public final Headers f11850b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11851c;

    /* renamed from: d, reason: collision with root package name */
    public final Protocol f11852d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11853e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11854f;

    /* renamed from: g, reason: collision with root package name */
    public final Headers f11855g;

    /* renamed from: h, reason: collision with root package name */
    public final Handshake f11856h;

    /* renamed from: i, reason: collision with root package name */
    public final long f11857i;
    public final long j;

    static {
        StringBuilder sb2 = new StringBuilder();
        Platform.Companion companion = Platform.Companion;
        sb2.append(companion.get().getPrefix());
        sb2.append("-Sent-Millis");
        f11847k = sb2.toString();
        f11848l = companion.get().getPrefix() + "-Received-Millis";
    }

    public e(l0 rawSource) {
        TlsVersion tlsVersion;
        k.e(rawSource, "rawSource");
        try {
            f0 d10 = bg.b.d(rawSource);
            this.f11849a = d10.x(Long.MAX_VALUE);
            this.f11851c = d10.x(Long.MAX_VALUE);
            Headers.Builder builder = new Headers.Builder();
            int b10 = d.b(d10);
            for (int i6 = 0; i6 < b10; i6++) {
                OkHttpUtils.addLenient(builder, d10.x(Long.MAX_VALUE));
            }
            this.f11850b = builder.build();
            StatusLine parse = StatusLine.Companion.parse(d10.x(Long.MAX_VALUE));
            this.f11852d = parse.protocol;
            this.f11853e = parse.code;
            this.f11854f = parse.message;
            Headers.Builder builder2 = new Headers.Builder();
            int b11 = d.b(d10);
            for (int i10 = 0; i10 < b11; i10++) {
                OkHttpUtils.addLenient(builder2, d10.x(Long.MAX_VALUE));
            }
            String str = f11847k;
            String str2 = builder2.get(str);
            String str3 = f11848l;
            String str4 = builder2.get(str3);
            builder2.removeAll(str);
            builder2.removeAll(str3);
            this.f11857i = str2 != null ? Long.parseLong(str2) : 0L;
            this.j = str4 != null ? Long.parseLong(str4) : 0L;
            this.f11855g = builder2.build();
            if (u.H(this.f11849a, "https://", false)) {
                String x10 = d10.x(Long.MAX_VALUE);
                if (x10.length() <= 0) {
                    CipherSuite forJavaName = CipherSuite.Companion.forJavaName(d10.x(Long.MAX_VALUE));
                    List<? extends Certificate> a10 = a(d10);
                    List<? extends Certificate> a11 = a(d10);
                    if (!d10.r()) {
                        tlsVersion = TlsVersion.Companion.forJavaName(d10.x(Long.MAX_VALUE));
                    } else {
                        tlsVersion = TlsVersion.SSL_3_0;
                    }
                    this.f11856h = Handshake.Companion.get(tlsVersion, forJavaName, a10, a11);
                } else {
                    throw new IOException("expected \"\" but was \"" + x10 + '\"');
                }
            } else {
                this.f11856h = null;
            }
            rawSource.close();
        } catch (Throwable th) {
            rawSource.close();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, bg.m, bg.k] */
    public static List a(f0 f0Var) {
        int b10 = d.b(f0Var);
        if (b10 == -1) {
            return r.f6846x;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            ArrayList arrayList = new ArrayList(b10);
            for (int i6 = 0; i6 < b10; i6++) {
                String x10 = f0Var.x(Long.MAX_VALUE);
                ?? obj = new Object();
                n nVar = n.A;
                n s = l.s(x10);
                k.b(s);
                obj.k0(s);
                arrayList.add(certificateFactory.generateCertificate(new j(obj, 0)));
            }
            return arrayList;
        } catch (CertificateException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public static void b(e0 e0Var, List list) {
        try {
            e0Var.Z(list.size());
            e0Var.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((Certificate) it.next()).getEncoded();
                n nVar = n.A;
                k.d(bytes, "bytes");
                e0Var.F(l.v(bytes).a());
                e0Var.writeByte(10);
            }
        } catch (CertificateEncodingException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public final void c(DiskLruCache.Editor editor) {
        y yVar;
        String str = this.f11849a;
        Handshake handshake = this.f11856h;
        Headers headers = this.f11855g;
        Headers headers2 = this.f11850b;
        e0 c10 = bg.b.c(editor.newSink(0));
        Throwable th = null;
        try {
            c10.F(str);
            c10.writeByte(10);
            c10.F(this.f11851c);
            c10.writeByte(10);
            c10.Z(headers2.size());
            c10.writeByte(10);
            int size = headers2.size();
            for (int i6 = 0; i6 < size; i6++) {
                c10.F(headers2.name(i6));
                c10.F(": ");
                c10.F(headers2.value(i6));
                c10.writeByte(10);
            }
            c10.F(new StatusLine(this.f11852d, this.f11853e, this.f11854f).toString());
            c10.writeByte(10);
            c10.Z(headers.size() + 2);
            c10.writeByte(10);
            int size2 = headers.size();
            for (int i10 = 0; i10 < size2; i10++) {
                c10.F(headers.name(i10));
                c10.F(": ");
                c10.F(headers.value(i10));
                c10.writeByte(10);
            }
            c10.F(f11847k);
            c10.F(": ");
            c10.Z(this.f11857i);
            c10.writeByte(10);
            c10.F(f11848l);
            c10.F(": ");
            c10.Z(this.j);
            c10.writeByte(10);
            if (u.H(str, "https://", false)) {
                c10.writeByte(10);
                k.b(handshake);
                c10.F(handshake.cipherSuite().javaName());
                c10.writeByte(10);
                b(c10, handshake.peerCertificates());
                b(c10, handshake.localCertificates());
                c10.F(handshake.tlsVersion().javaName());
                c10.writeByte(10);
            }
            yVar = y.f6101a;
        } catch (Throwable th2) {
            th = th2;
            yVar = null;
        }
        try {
            c10.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            } else {
                he.a.a(th, th3);
            }
        }
        if (th == null) {
            k.b(yVar);
            return;
        }
        throw th;
    }

    public e(Response response) {
        Headers build;
        k.e(response, "response");
        this.f11849a = response.request().url().toString();
        Response networkResponse = response.networkResponse();
        k.b(networkResponse);
        Headers headers = networkResponse.request().headers();
        Headers headers2 = response.headers();
        int size = headers2.size();
        Set set = null;
        for (int i6 = 0; i6 < size; i6++) {
            if ("Vary".equalsIgnoreCase(headers2.name(i6))) {
                String value = headers2.value(i6);
                if (set == null) {
                    u.B();
                    set = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                Iterator it = m.a0(value, new char[]{','}).iterator();
                while (it.hasNext()) {
                    set.add(m.n0((String) it.next()).toString());
                }
            }
        }
        set = set == null ? t.f6848x : set;
        if (set.isEmpty()) {
            build = Util.EMPTY_HEADERS;
        } else {
            Headers.Builder builder = new Headers.Builder();
            int size2 = headers.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String name = headers.name(i10);
                if (set.contains(name)) {
                    builder.add(name, headers.value(i10));
                }
            }
            build = builder.build();
        }
        this.f11850b = build;
        this.f11851c = response.request().method();
        this.f11852d = response.protocol();
        this.f11853e = response.code();
        this.f11854f = response.message();
        this.f11855g = response.headers();
        this.f11856h = response.handshake();
        this.f11857i = response.sentRequestAtMillis();
        this.j = response.receivedResponseAtMillis();
    }
}
