package com.unity3d.ads.core.data.model;

import b1.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import he.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.k;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UniversalRequestStoreSerializer implements l {
    private final UniversalRequestStoreOuterClass.UniversalRequestStore defaultValue;

    public UniversalRequestStoreSerializer() {
        UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
        k.d(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    @Override // b1.l
    public Object readFrom(InputStream inputStream, c cVar) {
        try {
            UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom = UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(inputStream);
            k.d(parseFrom, "parseFrom(input)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e10) {
            throw new IOException("Cannot read proto.", e10);
        } catch (Throwable th) {
            throw new IOException("Error while reading proto file.", th);
        }
    }

    @Override // b1.l
    public UniversalRequestStoreOuterClass.UniversalRequestStore getDefaultValue() {
        return this.defaultValue;
    }

    @Override // b1.l
    public Object writeTo(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, OutputStream outputStream, c cVar) {
        universalRequestStore.writeTo(outputStream);
        return y.f6101a;
    }
}
