package ja;

import androidx.appcompat.widget.ActionBarContextView;
import t0.v0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7317a;

    /* renamed from: b, reason: collision with root package name */
    public int f7318b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7319c;

    @Override // t0.v0
    public void a() {
        this.f7317a = true;
    }

    @Override // t0.v0
    public void b() {
        ActionBarContextView.a((ActionBarContextView) this.f7319c);
        this.f7317a = false;
    }

    @Override // t0.v0
    public void c() {
        if (this.f7317a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f7319c;
        actionBarContextView.C = null;
        ActionBarContextView.b(actionBarContextView, this.f7318b);
    }
}
