package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;
import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class RealConnection$connectTls$1 extends l implements a {
    final /* synthetic */ Address $address;
    final /* synthetic */ CertificatePinner $certificatePinner;
    final /* synthetic */ Handshake $unverifiedHandshake;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.$certificatePinner = certificatePinner;
        this.$unverifiedHandshake = handshake;
        this.$address = address;
    }

    @Override // ve.a
    public final List<Certificate> invoke() {
        CertificateChainCleaner certificateChainCleaner$okhttp = this.$certificatePinner.getCertificateChainCleaner$okhttp();
        k.b(certificateChainCleaner$okhttp);
        return certificateChainCleaner$okhttp.clean(this.$unverifiedHandshake.peerCertificates(), this.$address.url().host());
    }
}
