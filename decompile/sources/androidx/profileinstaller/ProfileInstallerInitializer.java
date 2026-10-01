package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import k5.b;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // k5.b
    public final Object create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new Object();
        }
        Choreographer.getInstance().postFrameCallback(new d1.b(this, context.getApplicationContext()));
        return new Object();
    }

    @Override // k5.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
