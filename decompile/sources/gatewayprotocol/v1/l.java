package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.DeveloperConsentOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final l f5583a = new Object();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i6) {
        if (DeveloperConsentOuterClass.DeveloperConsentChoice.forNumber(i6) != null) {
            return true;
        }
        return false;
    }
}
