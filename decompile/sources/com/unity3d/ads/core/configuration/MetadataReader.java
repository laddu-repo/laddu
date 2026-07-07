package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class MetadataReader<T> {
    private final JsonStorage jsonStorage;
    private final String key;

    public MetadataReader(JsonStorage jsonStorage, String key) {
        k.e(jsonStorage, "jsonStorage");
        k.e(key, "key");
        this.jsonStorage = jsonStorage;
        this.key = key;
    }

    public static Object read$default(MetadataReader metadataReader, Object obj, int i6, Object obj2) {
        if (obj2 == null) {
            if ((i6 & 1) != 0) {
                obj = null;
            }
            if (metadataReader.getJsonStorage().get(metadataReader.getKey()) == null) {
                return obj;
            }
            k.j();
            throw null;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: read");
    }

    public static Object readAndDelete$default(MetadataReader metadataReader, Object obj, int i6, Object obj2) {
        if (obj2 == null) {
            if ((i6 & 1) != 0) {
                obj = null;
            }
            if (metadataReader.getJsonStorage().get(metadataReader.getKey()) == null) {
                if (metadataReader.getJsonStorage().get(metadataReader.getKey()) != null) {
                    metadataReader.getJsonStorage().delete(metadataReader.getKey());
                }
                return obj;
            }
            k.j();
            throw null;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAndDelete");
    }

    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    public final String getKey() {
        return this.key;
    }

    public final <T> T read(T t10) {
        if (getJsonStorage().get(getKey()) == null) {
            return t10;
        }
        k.j();
        throw null;
    }

    public final <T> T readAndDelete(T t10) {
        if (getJsonStorage().get(getKey()) == null) {
            if (getJsonStorage().get(getKey()) != null) {
                getJsonStorage().delete(getKey());
            }
            return t10;
        }
        k.j();
        throw null;
    }
}
