package mf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8878a = 0;

    static {
        Object b10;
        Object b11;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            b10 = ne.a.class.getCanonicalName();
        } catch (Throwable th) {
            b10 = he.a.b(th);
        }
        if (he.k.a(b10) != null) {
            b10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            b11 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            b11 = he.a.b(th2);
        }
        if (he.k.a(b11) != null) {
            b11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
