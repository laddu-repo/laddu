package a1;

import a2.a2;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends a2 {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ b f115z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(24);
        this.f115z = bVar;
    }

    @Override // a2.a2
    public final u0.c B(int i6) {
        int i10;
        b bVar = this.f115z;
        if (i6 == 2) {
            i10 = bVar.f125k;
        } else {
            i10 = bVar.f126l;
        }
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return t(i10);
    }

    @Override // a2.a2
    public final boolean P(int i6, int i10, Bundle bundle) {
        int i11;
        b bVar = this.f115z;
        Chip chip = bVar.f124i;
        if (i6 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    boolean z10 = false;
                    if (i10 != 64) {
                        if (i10 != 128) {
                            Chip chip2 = ((ea.d) bVar).f4508q;
                            if (i10 == 16) {
                                if (i6 == 0) {
                                    return chip2.performClick();
                                }
                                if (i6 == 1) {
                                    chip2.playSoundEffect(0);
                                    View.OnClickListener onClickListener = chip2.E;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(chip2);
                                        z10 = true;
                                    }
                                    if (chip2.Q) {
                                        chip2.P.r(1, 1);
                                    }
                                }
                            }
                            return z10;
                        }
                        if (bVar.f125k != i6) {
                            return false;
                        }
                        bVar.f125k = Integer.MIN_VALUE;
                        chip.invalidate();
                        bVar.r(i6, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.f123h;
                    if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i11 = bVar.f125k) == i6) {
                        return false;
                    }
                    if (i11 != Integer.MIN_VALUE) {
                        bVar.f125k = Integer.MIN_VALUE;
                        chip.invalidate();
                        bVar.r(i11, 65536);
                    }
                    bVar.f125k = i6;
                    chip.invalidate();
                    bVar.r(i6, 32768);
                    return true;
                }
                return bVar.j(i6);
            }
            return bVar.q(i6);
        }
        WeakHashMap weakHashMap = q0.f12397a;
        return chip.performAccessibilityAction(i10, bundle);
    }

    @Override // a2.a2
    public final u0.c t(int i6) {
        return new u0.c(AccessibilityNodeInfo.obtain(this.f115z.n(i6).f12745a));
    }
}
