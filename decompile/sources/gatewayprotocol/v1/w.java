package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public final Object convert(Object obj) {
        DiagnosticEventRequestOuterClass.DiagnosticTagType forNumber = DiagnosticEventRequestOuterClass.DiagnosticTagType.forNumber(((Integer) obj).intValue());
        if (forNumber == null) {
            return DiagnosticEventRequestOuterClass.DiagnosticTagType.UNRECOGNIZED;
        }
        return forNumber;
    }
}
