package d;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Field f3423a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f3424b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f3425c;

    public d0(Field field, Field field2, Field field3) {
        this.f3423a = field;
        this.f3424b = field2;
        this.f3425c = field3;
    }

    @Override // d.b0
    public final boolean a(InputMethodManager inputMethodManager) {
        try {
            this.f3425c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // d.b0
    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.f3423a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // d.b0
    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f3424b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
