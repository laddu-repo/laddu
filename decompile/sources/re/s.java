package re;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11401a = 0;

    static {
        Object objI;
        Object objI2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objI = ud.a.class.getCanonicalName();
        } catch (Throwable th) {
            objI = fa.b.i(th);
        }
        if (od.h.a(objI) != null) {
            objI = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objI2 = s.class.getCanonicalName();
        } catch (Throwable th2) {
            objI2 = fa.b.i(th2);
        }
        if (od.h.a(objI2) != null) {
            objI2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
