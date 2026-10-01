package nd;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.playfy.tv.ui.fragments.SettingsFragment;
import java.io.File;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 extends ne.j implements ve.p {
    public final /* synthetic */ kotlin.jvm.internal.w A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Intent f9688x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f9689y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ApplicationInfo f9690z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Intent intent, SettingsFragment settingsFragment, ApplicationInfo applicationInfo, kotlin.jvm.internal.w wVar, le.c cVar) {
        super(2, cVar);
        this.f9688x = intent;
        this.f9689y = settingsFragment;
        this.f9690z = applicationInfo;
        this.A = wVar;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        return new e0(this.f9688x, this.f9689y, this.f9690z, this.A, cVar);
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        e0 e0Var = (e0) create((gf.c0) obj, (le.c) obj2);
        he.y yVar = he.y.f6101a;
        e0Var.invokeSuspend(yVar);
        return yVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        he.a.f(obj);
        SettingsFragment settingsFragment = this.f9689y;
        Uri d10 = FileProvider.d(settingsFragment.F().getApplicationContext(), w8.k.c(this.f9690z.packageName, ".provider"), (File) this.A.f8055x);
        Intent intent = this.f9688x;
        intent.putExtra("android.intent.extra.STREAM", d10);
        settingsFragment.M(Intent.createChooser(intent, "Share app via"));
        return he.y.f6101a;
    }
}
