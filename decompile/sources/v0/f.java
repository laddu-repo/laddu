package v0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: x, reason: collision with root package name */
    public final InputContentInfo f13183x;

    public f(Object obj) {
        this.f13183x = (InputContentInfo) obj;
    }

    @Override // v0.g
    public final Uri b() {
        return this.f13183x.getContentUri();
    }

    @Override // v0.g
    public final void c() {
        this.f13183x.requestPermission();
    }

    @Override // v0.g
    public final Uri d() {
        return this.f13183x.getLinkUri();
    }

    @Override // v0.g
    public final Object e() {
        return this.f13183x;
    }

    @Override // v0.g
    public final ClipDescription getDescription() {
        return this.f13183x.getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f13183x = new InputContentInfo(uri, clipDescription, uri2);
    }
}
