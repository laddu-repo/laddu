package u0;

import a2.a2;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class d extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final a2 f12747a;

    public d(a2 a2Var) {
        this.f12747a = a2Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i6) {
        c t10 = this.f12747a.t(i6);
        if (t10 == null) {
            return null;
        }
        return t10.f12745a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i6) {
        this.f12747a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i6) {
        c B = this.f12747a.B(i6);
        if (B == null) {
            return null;
        }
        return B.f12745a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i6, int i10, Bundle bundle) {
        return this.f12747a.P(i6, i10, bundle);
    }
}
