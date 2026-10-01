package f7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import b7.a0;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f5073d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f5074a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5075b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f5076c;

    public a(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f5075b = str.concat("/");
        } else {
            this.f5075b = str;
        }
        this.f5076c = map;
        if (!(callback instanceof View)) {
            this.f5074a = null;
        } else {
            this.f5074a = ((View) callback).getContext().getApplicationContext();
        }
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (f5073d) {
            ((a0) this.f5076c.get(str)).f1489f = bitmap;
        }
    }
}
