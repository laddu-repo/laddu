package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.AdFormatOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public final Object convert(Object obj) {
        AdFormatOuterClass.AdFormat forNumber = AdFormatOuterClass.AdFormat.forNumber(((Integer) obj).intValue());
        if (forNumber == null) {
            return AdFormatOuterClass.AdFormat.UNRECOGNIZED;
        }
        return forNumber;
    }
}
