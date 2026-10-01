package okhttp3.internal.http2;

import bg.n;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Header {
    public static final Companion Companion = new Companion(null);
    public static final n PSEUDO_PREFIX;
    public static final n RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final n TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final n TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final n TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final n TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final n name;
    public final n value;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    static {
        n nVar = n.A;
        PSEUDO_PREFIX = l.u(":");
        RESPONSE_STATUS = l.u(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = l.u(TARGET_METHOD_UTF8);
        TARGET_PATH = l.u(TARGET_PATH_UTF8);
        TARGET_SCHEME = l.u(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = l.u(TARGET_AUTHORITY_UTF8);
    }

    public Header(n name, n value) {
        k.e(name, "name");
        k.e(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = value.d() + name.d() + 32;
    }

    public static /* synthetic */ Header copy$default(Header header, n nVar, n nVar2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            nVar = header.name;
        }
        if ((i6 & 2) != 0) {
            nVar2 = header.value;
        }
        return header.copy(nVar, nVar2);
    }

    public final n component1() {
        return this.name;
    }

    public final n component2() {
        return this.value;
    }

    public final Header copy(n name, n value) {
        k.e(name, "name");
        k.e(value, "value");
        return new Header(name, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        if (k.a(this.name, header.name) && k.a(this.value, header.value)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.q() + ": " + this.value.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String name, String value) {
        this(l.u(name), l.u(value));
        k.e(name, "name");
        k.e(value, "value");
        n nVar = n.A;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(n name, String value) {
        this(name, l.u(value));
        k.e(name, "name");
        k.e(value, "value");
        n nVar = n.A;
    }
}
