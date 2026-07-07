package okhttp3;

import bg.n;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import df.m;
import df.u;
import h8.c;
import ie.i;
import ie.j;
import ie.r;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.z;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import ve.a;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String pattern, String... pins) {
            k.e(pattern, "pattern");
            k.e(pins, "pins");
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(j.c0(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final String pin(Certificate certificate) {
            k.e(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + sha256Hash((X509Certificate) certificate).a();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }

        public final n sha1Hash(X509Certificate x509Certificate) {
            k.e(x509Certificate, "<this>");
            n nVar = n.A;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            k.d(encoded, "publicKey.encoded");
            return l.v(encoded).c(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        }

        public final n sha256Hash(X509Certificate x509Certificate) {
            k.e(x509Certificate, "<this>");
            n nVar = n.A;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            k.d(encoded, "publicKey.encoded");
            return l.v(encoded).c("SHA-256");
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Pin {
        private final n hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String pattern, String pin) {
            k.e(pattern, "pattern");
            k.e(pin, "pin");
            if ((u.H(pattern, "*.", false) && m.Q(pattern, "*", 1, false, 4) == -1) || ((u.H(pattern, "**.", false) && m.Q(pattern, "*", 2, false, 4) == -1) || m.Q(pattern, "*", 0, false, 6) == -1)) {
                String canonicalHost = HostnamesKt.toCanonicalHost(pattern);
                if (canonicalHost != null) {
                    this.pattern = canonicalHost;
                    if (u.H(pin, "sha1/", false)) {
                        this.hashAlgorithm = "sha1";
                        n nVar = n.A;
                        String substring = pin.substring(5);
                        k.d(substring, "this as java.lang.String).substring(startIndex)");
                        n s = l.s(substring);
                        if (s != null) {
                            this.hash = s;
                            return;
                        }
                        throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
                    }
                    if (u.H(pin, "sha256/", false)) {
                        this.hashAlgorithm = "sha256";
                        n nVar2 = n.A;
                        String substring2 = pin.substring(7);
                        k.d(substring2, "this as java.lang.String).substring(startIndex)");
                        n s7 = l.s(substring2);
                        if (s7 != null) {
                            this.hash = s7;
                            return;
                        }
                        throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
                    }
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(pin));
                }
                throw new IllegalArgumentException("Invalid pattern: ".concat(pattern));
            }
            throw new IllegalArgumentException("Unexpected pattern: ".concat(pattern).toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            if (k.a(this.pattern, pin.pattern) && k.a(this.hashAlgorithm, pin.hashAlgorithm) && k.a(this.hash, pin.hash)) {
                return true;
            }
            return false;
        }

        public final n getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + c.g(this.hashAlgorithm, this.pattern.hashCode() * 31, 31);
        }

        public final boolean matchesCertificate(X509Certificate certificate) {
            k.e(certificate, "certificate");
            String str = this.hashAlgorithm;
            if (k.a(str, "sha256")) {
                return k.a(this.hash, CertificatePinner.Companion.sha256Hash(certificate));
            }
            if (k.a(str, "sha1")) {
                return k.a(this.hash, CertificatePinner.Companion.sha1Hash(certificate));
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x006b A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean matchesHostname(java.lang.String r11) {
            /*
                r10 = this;
                java.lang.String r0 = "hostname"
                kotlin.jvm.internal.k.e(r11, r0)
                java.lang.String r0 = r10.pattern
                java.lang.String r1 = "**."
                r2 = 0
                boolean r0 = df.u.H(r0, r1, r2)
                r1 = 46
                r3 = 1
                if (r0 == 0) goto L3a
                java.lang.String r0 = r10.pattern
                int r0 = r0.length()
                int r6 = r0 + (-3)
                int r0 = r11.length()
                int r0 = r0 - r6
                int r4 = r11.length()
                int r4 = r4 - r6
                java.lang.String r8 = r10.pattern
                r5 = 3
                r9 = 0
                r7 = r11
                boolean r11 = df.u.C(r4, r5, r6, r7, r8, r9)
                if (r11 == 0) goto L6c
                if (r0 == 0) goto L6b
                int r0 = r0 - r3
                char r11 = r7.charAt(r0)
                if (r11 != r1) goto L6c
                goto L6b
            L3a:
                r7 = r11
                java.lang.String r11 = r10.pattern
                java.lang.String r0 = "*."
                boolean r11 = df.u.H(r11, r0, r2)
                if (r11 == 0) goto L6d
                java.lang.String r11 = r10.pattern
                int r11 = r11.length()
                int r6 = r11 + (-1)
                int r11 = r7.length()
                int r11 = r11 - r6
                int r0 = r7.length()
                int r4 = r0 - r6
                java.lang.String r8 = r10.pattern
                r5 = 1
                r9 = 0
                boolean r0 = df.u.C(r4, r5, r6, r7, r8, r9)
                if (r0 == 0) goto L6c
                int r11 = r11 - r3
                r0 = 4
                int r11 = df.m.U(r7, r1, r11, r0)
                r0 = -1
                if (r11 != r0) goto L6c
            L6b:
                return r3
            L6c:
                return r2
            L6d:
                java.lang.String r11 = r10.pattern
                boolean r11 = r7.equals(r11)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Pin.matchesHostname(java.lang.String):boolean");
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.a();
        }
    }

    public CertificatePinner(Set<Pin> pins, CertificateChainCleaner certificateChainCleaner) {
        k.e(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final n sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final n sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String hostname, List<? extends Certificate> peerCertificates) {
        k.e(hostname, "hostname");
        k.e(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new CertificatePinner$check$1(this, peerCertificates, hostname));
    }

    public final void check$okhttp(String hostname, a cleanedPeerCertificatesFn) {
        k.e(hostname, "hostname");
        k.e(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(hostname);
        if (!findMatchingPins.isEmpty()) {
            List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
            for (X509Certificate x509Certificate : list) {
                n nVar = null;
                n nVar2 = null;
                for (Pin pin : findMatchingPins) {
                    String hashAlgorithm = pin.getHashAlgorithm();
                    if (k.a(hashAlgorithm, "sha256")) {
                        if (nVar == null) {
                            nVar = Companion.sha256Hash(x509Certificate);
                        }
                        if (k.a(pin.getHash(), nVar)) {
                            return;
                        }
                    } else if (k.a(hashAlgorithm, "sha1")) {
                        if (nVar2 == null) {
                            nVar2 = Companion.sha1Hash(x509Certificate);
                        }
                        if (k.a(pin.getHash(), nVar2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb2.append("\n    ");
                sb2.append(Companion.pin(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(hostname);
            sb2.append(":");
            for (Pin pin2 : findMatchingPins) {
                sb2.append("\n    ");
                sb2.append(pin2);
            }
            String sb3 = sb2.toString();
            k.d(sb3, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb3);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (k.a(certificatePinner.pins, this.pins) && k.a(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String hostname) {
        k.e(hostname, "hostname");
        List list = r.f6846x;
        for (Object obj : this.pins) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (list.isEmpty()) {
                    list = new ArrayList();
                }
                z.a(list).add(obj);
            }
        }
        return list;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int i6;
        int hashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        if (certificateChainCleaner != null) {
            i6 = certificateChainCleaner.hashCode();
        } else {
            i6 = 0;
        }
        return hashCode + i6;
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        k.e(certificateChainCleaner, "certificateChainCleaner");
        if (k.a(this.certificateChainCleaner, certificateChainCleaner)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public final void check(String hostname, Certificate... peerCertificates) {
        k.e(hostname, "hostname");
        k.e(peerCertificates, "peerCertificates");
        check(hostname, i.q0(peerCertificates));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i6, f fVar) {
        this(set, (i6 & 2) != 0 ? null : certificateChainCleaner);
    }
}
