package com.google.protobuf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n1 implements t2 {

    /* renamed from: b, reason: collision with root package name */
    public static final n1 f2992b = new n1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2993a;

    public /* synthetic */ n1(int i6) {
        this.f2993a = i6;
    }

    @Override // com.google.protobuf.t2
    public final s2 a(Class cls) {
        switch (this.f2993a) {
            case 0:
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    try {
                        return (s2) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
                    } catch (Exception e10) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.protobuf.t2
    public final boolean b(Class cls) {
        switch (this.f2993a) {
            case 0:
                return GeneratedMessageLite.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
