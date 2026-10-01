package gatewayprotocol.v1;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final MapEntryLite f5590a;

    static {
        WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
        f5590a = MapEntryLite.newDefaultInstance(fieldType, HttpUrl.FRAGMENT_ENCODE_SET, fieldType, HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
