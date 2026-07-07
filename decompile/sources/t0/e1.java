package t0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f12340a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f12341b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f12342c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f12343d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f12340a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f12341b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f12342c = declaredField3;
            declaredField3.setAccessible(true);
            f12343d = true;
        } catch (ReflectiveOperationException e10) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
        }
    }
}
