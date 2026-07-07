package c7;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import n7.g;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends Paint {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1984a;

    @Override // android.graphics.Paint
    public void setAlpha(int i6) {
        switch (this.f1984a) {
            case 0:
                if (Build.VERSION.SDK_INT < 30) {
                    setColor((g.c(i6) << 24) | (getColor() & 16777215));
                    return;
                } else {
                    super.setAlpha(g.c(i6));
                    return;
                }
            default:
                super.setAlpha(i6);
                return;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f1984a) {
            case 0:
                return;
            default:
                super.setTextLocales(localeList);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i6, int i10) {
        super(i6);
        this.f1984a = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PorterDuff.Mode mode) {
        super(1);
        this.f1984a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    private final void a(LocaleList localeList) {
    }
}
