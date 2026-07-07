package h0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.playfy.tv.R;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f5777a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f5778b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5779c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5780d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5781e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f5782f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f5783g;

    public k(String str, PendingIntent pendingIntent) {
        IconCompat b10 = IconCompat.b(R.drawable.common_full_open_on_phone);
        Bundle bundle = new Bundle();
        this.f5780d = true;
        this.f5778b = b10;
        if (b10.e() == 2) {
            this.f5781e = b10.d();
        }
        this.f5782f = q.b(str);
        this.f5783g = pendingIntent;
        this.f5777a = bundle;
        this.f5779c = true;
        this.f5780d = true;
    }
}
