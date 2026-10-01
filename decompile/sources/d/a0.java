package d;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.g1;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Locale;
import okhttp3.OkHttpClient;
import wf.h1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3416x;

    public /* synthetic */ a0(int i6) {
        this.f3416x = i6;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [he.f, java.lang.Object] */
    @Override // ve.a
    public final Object invoke() {
        Class<?> returnType;
        switch (this.f3416x) {
            case 0:
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    declaredField3.setAccessible(true);
                    return new d0(declaredField3, declaredField, declaredField2);
                } catch (NoSuchFieldException unused) {
                    return c0.f3422a;
                }
            case 1:
                ye.a aVar = ye.d.f15057x;
                return Integer.valueOf(ye.d.f15057x.e().nextInt(2147418112) + 65536);
            case 2:
                return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss Z", Locale.getDefault());
            case 3:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused2) {
                    return null;
                }
            case 4:
                try {
                    Method method = (Method) i5.c.f6608z.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class<?> cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused3) {
                    return null;
                }
            case 5:
                return p7.a.f10617c;
            case 6:
                return c9.a.g().d("lora");
            case 7:
                return new wf.c(kd.k0.f7875a, 0);
            case 8:
                return new wf.c(kd.m.f7879a, 0);
            case 9:
                return new wf.c(h1.f14332a, 0);
            case 10:
                return new wf.c(h1.f14332a, 0);
            case 11:
                return new wf.c(h1.f14332a, 0);
            case 12:
                return new wf.c(kd.s.f7899a, 0);
            case 13:
                return new wf.c(kd.g.f7855a, 0);
            case 14:
                h1 h1Var = h1.f14332a;
                return new wf.h0(h1Var, h1Var);
            case 15:
                return new OkHttpClient();
            case 16:
                return new g1();
            case 17:
                lc.c cVar = new lc.c(18);
                cVar.E(kotlin.jvm.internal.x.a(o4.b.class), new cf.p(23));
                return cVar.F();
            case 18:
                return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss Z", Locale.getDefault());
            case 19:
                uf.j jVar = uf.j.f13139i;
                uf.g[] gVarArr = new uf.g[0];
                if (!df.m.S("kotlin.Unit")) {
                    if (!jVar.equals(uf.j.f13136f)) {
                        uf.a aVar2 = new uf.a("kotlin.Unit");
                        return new uf.h("kotlin.Unit", jVar, aVar2.f13106b.size(), ie.i.q0(gVarArr), aVar2);
                    }
                    throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                throw new IllegalArgumentException("Blank serial names are prohibited");
            case 20:
                return he.y.f6101a;
            case 21:
                return Boolean.TRUE;
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                return xf.b0.f14724b;
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                return xf.u.f14748b;
            case 24:
                return xf.r.f14746b;
            case 25:
                return xf.y.f14754b;
            default:
                return xf.g.f14734b;
        }
    }

    public /* synthetic */ a0(Object obj, int i6) {
        this.f3416x = i6;
    }
}
