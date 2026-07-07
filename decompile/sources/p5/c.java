package p5;

import android.view.Display;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ int a(Display.Mode mode) {
        return mode.getPhysicalWidth();
    }

    public static /* bridge */ /* synthetic */ Display.Mode c(Display display) {
        return display.getMode();
    }

    public static /* synthetic */ WebMessage e(String str, WebMessagePort[] webMessagePortArr) {
        return new WebMessage(str, webMessagePortArr);
    }

    public static /* synthetic */ void i() {
    }

    public static /* bridge */ /* synthetic */ int x(Display.Mode mode) {
        return mode.getPhysicalHeight();
    }
}
