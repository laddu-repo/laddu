package j1;

import com.playfy.tv.ui.fragments.PlaylistsFragment;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k7.d f6985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f6986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.b f6987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nd.a0 f6988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PlaylistsFragment f6989e;

    public v(PlaylistsFragment playlistsFragment, k7.d dVar, AtomicReference atomicReference, g.b bVar, nd.a0 a0Var) {
        this.f6989e = playlistsFragment;
        this.f6985a = dVar;
        this.f6986b = atomicReference;
        this.f6987c = bVar;
        this.f6988d = a0Var;
    }

    @Override // j1.x
    public final void a() {
        f.h activityResultRegistry;
        StringBuilder sb2 = new StringBuilder("fragment_");
        PlaylistsFragment playlistsFragment = this.f6989e;
        sb2.append(playlistsFragment.C);
        sb2.append("_rq#");
        sb2.append(playlistsFragment.f7038v0.getAndIncrement());
        String sb3 = sb2.toString();
        PlaylistsFragment playlistsFragment2 = (PlaylistsFragment) this.f6985a.f7747y;
        a0 a0Var = playlistsFragment2.T;
        if (a0Var != null) {
            activityResultRegistry = a0Var.E.getActivityResultRegistry();
        } else {
            activityResultRegistry = playlistsFragment2.E().getActivityResultRegistry();
        }
        this.f6986b.set(activityResultRegistry.c(sb3, playlistsFragment, this.f6987c, this.f6988d));
    }
}
