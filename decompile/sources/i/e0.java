package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 implements View.OnClickListener {
    public Context A;

    /* renamed from: x, reason: collision with root package name */
    public final View f6174x;

    /* renamed from: y, reason: collision with root package name */
    public final String f6175y;

    /* renamed from: z, reason: collision with root package name */
    public Method f6176z;

    public e0(String str, View view) {
        this.f6174x = view;
        this.f6175y = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f6176z == null) {
            View view2 = this.f6174x;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f6175y;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f6176z = method;
                            this.A = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id2 = view2.getId();
                    if (id2 == -1) {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder q9 = r4.a.q("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    q9.append(view2.getClass());
                    q9.append(str);
                    throw new IllegalStateException(q9.toString());
                }
            }
        }
        try {
            this.f6176z.invoke(this.A, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Could not execute method for android:onClick", e11);
        }
    }
}
