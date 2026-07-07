package p7;

import android.content.Context;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.k;
import okhttp3.OkHttpClient;
import r7.i;
import t7.b;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f10615a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f10616b = "";

    /* renamed from: c, reason: collision with root package name */
    public static OkHttpClient f10617c;

    /* renamed from: d, reason: collision with root package name */
    public static i f10618d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f10619e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f10620f;

    /* renamed from: g, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f10621g;

    /* renamed from: h, reason: collision with root package name */
    public static b f10622h;

    /* renamed from: i, reason: collision with root package name */
    public static final v7.a f10623i;

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        x7.a.a(builder);
        f10617c = builder.build();
        f10619e = true;
        f10620f = "NET_LOG";
        f10621g = new ConcurrentLinkedQueue();
        f10622h = t7.a.f12625a;
        f10623i = v7.a.f13439a;
    }

    public static Context a() {
        Context context = f10615a;
        if (context != null) {
            return context;
        }
        k.k("app");
        throw null;
    }
}
