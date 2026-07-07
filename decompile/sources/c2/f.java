package c2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f1793a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f1794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f1795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f1795c = hVar;
        this.f1793a = contentResolver;
        this.f1794b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        h hVar = this.f1795c;
        hVar.a(d.c(hVar.f1803a, hVar.f1811i, hVar.f1810h));
    }
}
