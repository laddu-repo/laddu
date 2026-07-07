package com.unity3d.services.core.device.reader.pii;

import he.a;
import he.j;
import java.util.Locale;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;

    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final NonBehavioralFlag fromString(String value) {
            Object b10;
            k.e(value, "value");
            try {
                String upperCase = value.toUpperCase(Locale.ROOT);
                k.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                b10 = NonBehavioralFlag.valueOf(upperCase);
            } catch (Throwable th) {
                b10 = a.b(th);
            }
            Object obj = NonBehavioralFlag.UNKNOWN;
            if (b10 instanceof j) {
                b10 = obj;
            }
            return (NonBehavioralFlag) b10;
        }

        private Companion() {
        }
    }
}
