package d9;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.x;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends g9.a implements a {

    /* renamed from: f, reason: collision with root package name */
    public final Object f3976f;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f3976f = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [d9.a, com.google.android.gms.internal.measurement.x] */
    public static a K(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new x(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    public static Object L(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f3976f;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i6 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i6++;
                field = field2;
            }
        }
        if (i6 == 1) {
            w8.x.g(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e10) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
                } catch (NullPointerException e11) {
                    throw new IllegalArgumentException("Binder object is null.", e11);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(h8.c.i(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
    }
}
