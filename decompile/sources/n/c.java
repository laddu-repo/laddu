package n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.playfy.tv.R;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f8892f;

    /* renamed from: a, reason: collision with root package name */
    public int f8893a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f8894b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f8895c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f8896d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f8897e;

    public c(Context context, int i6) {
        super(context);
        this.f8893a = i6;
    }

    public final void a(Configuration configuration) {
        if (this.f8897e == null) {
            if (this.f8896d == null) {
                this.f8896d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f8894b == null) {
            this.f8894b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f8894b.setTo(theme);
            }
        }
        this.f8894b.applyStyle(this.f8893a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(n.c.f8892f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f8897e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f8896d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = n.c.f8892f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            n.c.f8892f = r1
        L1c:
            android.content.res.Configuration r1 = n.c.f8892f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f8896d
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f8897e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f8897e = r0
        L38:
            android.content.res.Resources r0 = r3.f8897e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.c.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f8895c == null) {
                this.f8895c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f8895c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f8894b;
        if (theme != null) {
            return theme;
        }
        if (this.f8893a == 0) {
            this.f8893a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f8894b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i6) {
        if (this.f8893a != i6) {
            this.f8893a = i6;
            b();
        }
    }
}
