package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b f4611a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4612b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4613c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4614d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4615e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4616f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4617g;

    /* renamed from: h, reason: collision with root package name */
    public int f4618h;

    /* renamed from: i, reason: collision with root package name */
    public int f4619i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public View f4620k;

    /* renamed from: l, reason: collision with root package name */
    public View f4621l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4622m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4623n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4624o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f4625p;

    public e() {
        super(-2, -2);
        this.f4612b = false;
        this.f4613c = 0;
        this.f4614d = 0;
        this.f4615e = -1;
        this.f4616f = -1;
        this.f4617g = 0;
        this.f4618h = 0;
        this.f4625p = new Rect();
    }

    public final boolean a(int i6) {
        if (i6 != 0) {
            if (i6 != 1) {
                return false;
            }
            return this.f4623n;
        }
        return this.f4622m;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.f4612b = false;
        this.f4613c = 0;
        this.f4614d = 0;
        this.f4615e = -1;
        this.f4616f = -1;
        this.f4617g = 0;
        this.f4618h = 0;
        this.f4625p = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e0.a.f4148b);
        this.f4613c = obtainStyledAttributes.getInteger(0, 0);
        this.f4616f = obtainStyledAttributes.getResourceId(1, -1);
        this.f4614d = obtainStyledAttributes.getInteger(2, 0);
        this.f4615e = obtainStyledAttributes.getInteger(6, -1);
        this.f4617g = obtainStyledAttributes.getInt(5, 0);
        this.f4618h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4612b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.Q;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.Q;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.S;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.R);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e10) {
                    throw new RuntimeException(r4.a.k("Could not inflate Behavior subclass ", string), e10);
                }
            }
            this.f4611a = bVar;
        }
        obtainStyledAttributes.recycle();
        b bVar2 = this.f4611a;
        if (bVar2 != null) {
            bVar2.c(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f4612b = false;
        this.f4613c = 0;
        this.f4614d = 0;
        this.f4615e = -1;
        this.f4616f = -1;
        this.f4617g = 0;
        this.f4618h = 0;
        this.f4625p = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4612b = false;
        this.f4613c = 0;
        this.f4614d = 0;
        this.f4615e = -1;
        this.f4616f = -1;
        this.f4617g = 0;
        this.f4618h = 0;
        this.f4625p = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4612b = false;
        this.f4613c = 0;
        this.f4614d = 0;
        this.f4615e = -1;
        this.f4616f = -1;
        this.f4617g = 0;
        this.f4618h = 0;
        this.f4625p = new Rect();
    }
}
