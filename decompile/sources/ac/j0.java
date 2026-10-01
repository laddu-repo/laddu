package ac;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;
import androidx.media3.decoder.DecoderInputBuffer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements ce.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f412v;

    public /* synthetic */ j0(int i) {
        this.f412v = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, od.c] */
    @Override // ce.a
    public final Object b() {
        Class<?> returnType;
        ye.d[] dVarArr;
        switch (this.f412v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                af.p pVar = af.p.f531a;
                return new af.h(c0.f334a);
            case 1:
                ArrayList arrayList = new ArrayList(0);
                ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                return (arrayList2 == null || (dVarArr = (ye.d[]) arrayList2.toArray(new ye.d[0])) == null) ? af.k.f514a : dVarArr;
            case 2:
                od.j jVar = ImmLeaksCleaner.f569w;
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    declaredField3.setAccessible(true);
                    return new c.w(declaredField3, declaredField, declaredField2);
                } catch (NoSuchFieldException unused) {
                    return c.v.f1668a;
                }
            case 3:
                fe.a aVar = fe.d.f5392v;
                return Integer.valueOf(fe.d.f5392v.a().nextInt(2147418112) + 65536);
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                return Boolean.TRUE;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                try {
                    Method method = (Method) x4.c.f14201x.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class<?> cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused3) {
                    return null;
                }
        }
    }

    public /* synthetic */ j0(af.m mVar) {
        this.f412v = 1;
    }
}
