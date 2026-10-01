package com.unity3d.ads.network.model;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface HttpBody {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class ByteArrayBody implements HttpBody {
        private final byte[] content;

        public ByteArrayBody(byte[] content) {
            k.e(content, "content");
            this.content = content;
        }

        public final byte[] getContent() {
            return this.content;
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class EmptyBody implements HttpBody {
        public static final EmptyBody INSTANCE = new EmptyBody();

        private EmptyBody() {
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class StringBody implements HttpBody {
        private final String content;

        public StringBody(String content) {
            k.e(content, "content");
            this.content = content;
        }

        public final String getContent() {
            return this.content;
        }
    }
}
