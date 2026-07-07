package com.unity3d.services.core.properties;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface Session {
    public static final Default Default = Default.$$INSTANCE;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Default implements Session {
        static final /* synthetic */ Default $$INSTANCE = new Default();

        /* renamed from: id, reason: collision with root package name */
        private static final String f3413id = SessionIdReader.INSTANCE.getSessionId();

        private Default() {
        }

        @Override // com.unity3d.services.core.properties.Session
        public String getId() {
            return f3413id;
        }
    }

    String getId();
}
