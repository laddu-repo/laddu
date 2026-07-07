package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements View.OnClickListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f5921v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f5922w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Method f5923x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Context f5924y;

    public g0(View view, String str) {
        this.f5921v = view;
        this.f5922w = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f5923x == null) {
            View view2 = this.f5921v;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f5922w;
                if (context == null) {
                    int id2 = view2.getId();
                    if (id2 == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f5923x = method;
                        this.f5924y = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f5923x.invoke(this.f5924y, view);
        } catch (IllegalAccessException e7) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
