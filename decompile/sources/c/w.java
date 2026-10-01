package c;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f1669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f1670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f1671c;

    public w(Field field, Field field2, Field field3) {
        this.f1669a = field;
        this.f1670b = field2;
        this.f1671c = field3;
    }

    @Override // c.u
    public final boolean a(InputMethodManager inputMethodManager) {
        try {
            this.f1671c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // c.u
    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.f1669a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // c.u
    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f1670b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
