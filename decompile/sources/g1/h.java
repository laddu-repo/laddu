package g1;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends e1.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5295a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f5296b;

    public h(EditText editText) {
        this.f5296b = new WeakReference(editText);
    }

    @Override // e1.i
    public void a() {
        switch (this.f5295a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f5296b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // e1.i
    public final void b() {
        switch (this.f5295a) {
            case 0:
                i.a((EditText) this.f5296b.get(), 1);
                return;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f5296b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    return;
                }
                return;
        }
    }

    public h(SwitchCompat switchCompat) {
        this.f5296b = new WeakReference(switchCompat);
    }
}
